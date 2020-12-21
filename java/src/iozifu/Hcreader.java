package iozifu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Hcreader {

	public static void main(String[] args){
		// TODO 自动生成的方法存根
		
		BufferedReader reader=null;
		try {
			//创建一个高效缓冲输入字符流
			reader=new BufferedReader(new FileReader("E:\\test.txt"));
			//reader.readLine();//读取一行,如果读取完了再读会显示null
			String string=null;
			while((string=reader.readLine())!=null) {
				System.out.print(string);
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			//关闭外层对象的时候内层资源会自动的关闭
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
