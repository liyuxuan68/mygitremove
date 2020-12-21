package iozijie;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class properties2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Properties properties=new Properties();
		FileReader reader=null;
		try {
			reader=new FileReader("E:\\test.txt");
			//reader=properties2.class.getClassLoader().getResourceAsStream("test.txt");获得Java项目的src目录下的文件
			//在流中读取输入
			properties.load(reader);
			System.out.println(properties);
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
