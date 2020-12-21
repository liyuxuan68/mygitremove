package iozijie;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class iozhuanhuan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建字符流转换字节流的桥梁
		OutputStreamWriter outputStreamWriter=null;
		try {
			//字符流通向字节流可以指定编码
			outputStreamWriter=new OutputStreamWriter(new FileOutputStream("E:\\test.txt"));
			outputStreamWriter.write("abcdefg");
			outputStreamWriter.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (outputStreamWriter!=null) {
				try {
					outputStreamWriter.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
