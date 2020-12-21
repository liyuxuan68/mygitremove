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
		// TODO 自动生成的方法存根
		DatagramSocket ds=null;
		BufferedReader reader=null;
		//创建客户端udp的socket
		try {
			reader=new BufferedReader(new InputStreamReader(System.in));
			ds=new DatagramSocket();
			//创建数据包
			//String string="你好，我是李雨轩";
			String line=null;
			while((line=reader.readLine())!=null) {
				if("exit".equals(line)) {
					break;
				}
				//转化为byte
				byte[] bs=line.getBytes();
				DatagramPacket dp=new DatagramPacket(bs, bs.length, InetAddress.getByName("192.168.8.109"), 10000);
				//发送数据
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
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
