package iozijie;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class copybuffer {
	public static void main(String[] args) {
		//定义一个高效缓冲字节流
		BufferedInputStream bufferedInputStream=null;
		BufferedOutputStream bufferedOutputStream=null;
		try {
			bufferedInputStream=new BufferedInputStream(new FileInputStream("E://fenlei.jpg"));
			bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("E:\\test2.jpg"));
			byte[] bs=new byte[1024];
			int l=-1;
			while ((l=bufferedInputStream.read(bs))!=-1) {
				bufferedOutputStream.write(bs, 0, l);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (bufferedOutputStream!=null) {
				try {
					bufferedOutputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (bufferedInputStream!=null) {
				try {
					bufferedInputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
}
