package iozifu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Thewriter {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//io的i是input输入，io的o是ouput输出
		//从数据角度可以分为字节流和字符流
		//字符流：文本，我们能读懂的都可以认为是字符流
		//字节流：二进制数据，这种数据我们打开一般读不懂
		//字符输入流的超类：Reader：子类FileReader,BufferedReader
		//字符输出流的超类：Writer：子类FileWriter,BufferedWriter
		//如果是输入流就以Reader结尾，如果是输出流就以Writer结尾
		File file=new File("D:\\test.txt");
		Writer writer=null;
		try {
			//IO流需要关闭的，如果不这样设计就不能关闭资源
			//读书就是把知识输入自己的大脑，读是输入。写字就是把知识写出到纸上，写是输出。
			writer=new FileWriter(file,true);//不加true会把以前的覆盖掉
			char[] cs= {'a','b','c'};
			char[] cs2= {'a','b','c','d','e'};
			writer.write(cs);
			writer.write(cs2, 2, 2);//从第二个索引，长度为2
			/*for(int i=0;i<100;i++) {
				writer.write("helloworld\r\n");//windows换行加\r\n
				if (i%10==0) {
					writer.flush();
				}
			}*/
			writer.write("hello");//必须刷新才会显示，如果不关闭输出流的话必须调用flush方法
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			//判断writer不是空防止指针异常
			//在关闭前会做flush的事情,也就是刷新
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		

	}

}
