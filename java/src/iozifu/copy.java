package iozifu;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class copy {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建文件
		File file=new File("E:\\test.txt");
		File file2=new File("E:\\test2.txt");
		Writer writer=null;
		Reader reader=null;
		try {
			reader=new FileReader(file);
			writer=new FileWriter(file2);
			char[] cs=new char[1024];
			int l=-1;
			while((l=reader.read(cs))!=-1) {
				//把输入流读取到的数据写入到输出流
				writer.write(cs, 0, l);
			}
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			//后排的先关闭
			if (writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
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
