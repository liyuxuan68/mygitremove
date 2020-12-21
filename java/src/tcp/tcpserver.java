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
		// TODO 自动生成的方法存根
		//创建服务端套接字
		ServerSocket ss=null;
		Socket socket=null;
		BufferedReader reader=null;
		try {
			ss=new ServerSocket(9000);
			System.out.println("服务已经启动了");
			//接受客户端的请求
			socket=ss.accept();
			//获得流对象
			InputStream inputStream=socket.getInputStream();
			reader=new BufferedReader(new InputStreamReader(inputStream));
			//读取数据
			while(true) {
				String line=reader.readLine();
				InetAddress address=socket.getInetAddress();
				//获得客户端的ip地址
				String ip=address.getHostAddress();
				System.out.println(ip+"发送了："+line);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				if(socket!=null) {
					try {
						socket.close();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			}
		}

	}

}
