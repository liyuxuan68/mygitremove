package iozijie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Zijieoutput {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//字节流读取二进制数据，比如MP3，MP4
		//创建一个字节输入流
		OutputStream outputStream=null;
		try {
			byte[] bs= {97,98,100,101};
			outputStream=new FileOutputStream("E://test.txt");
			outputStream.write(bs);
			//字节流不需要flush
			/*outputStream.write(98);*/
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (outputStream!=null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
