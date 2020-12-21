package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//���������socket
		Socket socket=null;
		BufferedWriter writer=null;
		BufferedReader reader=null;
		try {
			socket=new Socket("127.0.0.1",9000);
			//��������
			OutputStream outputStream=socket.getOutputStream();
			writer=new BufferedWriter(new OutputStreamWriter(outputStream));
			reader=new BufferedReader(new InputStreamReader(System.in));
			String line=null;
			while(true) {
				line=reader.readLine();
				writer.write(line);
				writer.newLine();
				writer.flush();
			}
			
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}

}
