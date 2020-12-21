package wangluo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class wangluo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		//获得本机地址
		InetAddress localhost=InetAddress.getLocalHost();
		String hostaddress=localhost.getHostAddress();//获取本机地址
		String hostname=localhost.getHostName();//获取主机名
		System.out.println("本机地址"+hostaddress);
		System.out.println("主机名"+hostname);
		
		//获得一个远程的IP
		//InetAddress baidu=InetAddress.getByName("183.232.231.174");
		//String baiduaddress=baidu.getHostAddress();//获取本机地址
		//String baiduname=baidu.getHostName();//获取主机名
		//System.out.println("本机地址"+baiduaddress);
		//System.out.println("主机名"+baiduname);
		//通信两端都要有socket
		DatagramSocket dSocket=null;
		dSocket=new DatagramSocket(10000);
		byte[] bs=new byte[1024];
		//创建数据包
		DatagramPacket dPacket=new DatagramPacket(bs, bs.length);
		//接受数据
		while(true) {
		dSocket.receive(dPacket);
		//获得数据端ip
		InetAddress inetAddress=dPacket.getAddress();
		//获取数据
		byte[] data=dPacket.getData();
		//创建接受的字符串
		String string=new String(data,0,dPacket.getLength());//表示data从0开始到它的长度dPacket.getLength()
		System.out.println(inetAddress.getHostAddress()+"发送的数据是："+string);
		}
		
	}

}
