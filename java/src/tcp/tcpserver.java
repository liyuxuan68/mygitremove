package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpserver {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����������׽���
		ServerSocket ss=null;
		Socket socket=null;
		BufferedReader reader=null;
		try {
			ss=new ServerSocket(9000);
			System.out.println("�����Ѿ�������");
			//���ܿͻ��˵�����
			socket=ss.accept();
			//���������
			InputStream inputStream=socket.getInputStream();
			reader=new BufferedReader(new InputStreamReader(inputStream));
			//��ȡ����
			while(true) {
				String line=reader.readLine();
				InetAddress address=socket.getInetAddress();
				//��ÿͻ��˵�ip��ַ
				String ip=address.getHostAddress();
				System.out.println(ip+"�����ˣ�"+line);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				if(socket!=null) {
					try {
						socket.close();
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
			}
		}

	}

}
