package wangluo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class fasongduan {

	@SuppressWarnings("resource")
	public static void main(String[] args)  {
		// TODO �Զ����ɵķ������
		DatagramSocket ds=null;
		BufferedReader reader=null;
		//�����ͻ���udp��socket
		try {
			reader=new BufferedReader(new InputStreamReader(System.in));
			ds=new DatagramSocket();
			//�������ݰ�
			//String string="��ã�����������";
			String line=null;
			while((line=reader.readLine())!=null) {
				if("exit".equals(line)) {
					break;
				}
				//ת��Ϊbyte
				byte[] bs=line.getBytes();
				DatagramPacket dp=new DatagramPacket(bs, bs.length, InetAddress.getByName("192.168.8.109"), 10000);
				//��������
				ds.send(dp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			ds.close();
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}

}
