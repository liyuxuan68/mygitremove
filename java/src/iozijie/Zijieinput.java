package iozijie;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Zijieinput {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//字节流不太适合文本的读取，如果有中文可能出现乱码
		InputStream inputStream=null;
		try {
			byte[] bs=new byte[10];
			inputStream=new FileInputStream("E:\\test2.txt");
			int l=inputStream.read(bs);//返回字节数
			/*System.out.println(Arrays.toString(bs));*/
			System.out.println(new String(bs, 0, l));//转化成字符串
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
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
