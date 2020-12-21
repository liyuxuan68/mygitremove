package iozijie;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class copyphoto {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		InputStream inputStream=null;
		OutputStream outputStream=null;
		try {
			inputStream=new FileInputStream("E:\\head.jpg");
			outputStream=new FileOutputStream("E:\\test3.jpg");
			byte[] bs=new byte[1024];
			int i=-1;
			while((i=inputStream.read(bs))!=-1) {
				outputStream.write(bs,0,i);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (outputStream!=null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (inputStream!=null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
