package wangluo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class wangluo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		//��ñ�����ַ
		InetAddress localhost=InetAddress.getLocalHost();
		String hostaddress=localhost.getHostAddress();//��ȡ������ַ
		String hostname=localhost.getHostName();//��ȡ������
		System.out.println("������ַ"+hostaddress);
		System.out.println("������"+hostname);
		
		//���һ��Զ�̵�IP
		//InetAddress baidu=InetAddress.getByName("183.232.231.174");
		//String baiduaddress=baidu.getHostAddress();//��ȡ������ַ
		//String baiduname=baidu.getHostName();//��ȡ������
		//System.out.println("������ַ"+baiduaddress);
		//System.out.println("������"+baiduname);
		//ͨ�����˶�Ҫ��socket
		DatagramSocket dSocket=null;
		dSocket=new DatagramSocket(10000);
		byte[] bs=new byte[1024];
		//�������ݰ�
		DatagramPacket dPacket=new DatagramPacket(bs, bs.length);
		//��������
		while(true) {
		dSocket.receive(dPacket);
		//������ݶ�ip
		InetAddress inetAddress=dPacket.getAddress();
		//��ȡ����
		byte[] data=dPacket.getData();
		//�������ܵ��ַ���
		String string=new String(data,0,dPacket.getLength());//��ʾdata��0��ʼ�����ĳ���dPacket.getLength()
		System.out.println(inetAddress.getHostAddress()+"���͵������ǣ�"+string);
		}
		
	}

}
