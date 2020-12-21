package iozifu;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Thereader {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建输入流对象。读取数据。关闭输入流。
		File file=new File("D:\\test.txt");
		FileReader reader=null;
		String string="";
		try {
			reader=new FileReader(file);
			//读取的字符被转换成ascii
			/*int c=reader.read();
			System.out.println((char)c);*/
			int c=-1;
			//单个字符的读取性能低
			while((c=reader.read())!=-1) {
				string+=(char)c;
			}
			System.out.println(string);
			char[] cs=new char[10];
			//向字符数组中填数据
			int l=reader.read(cs);//返回的是有效的字符个数
			System.out.println(cs);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (reader!=null) {
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
