package iozijie;

import java.io.PrintWriter;
import java.util.Properties;

public class properties1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//properties表示一个持久的属性集
		//1.继承自hashtable，是线程安全的键值对存储结构
		//2.只能储存字符串键值对
		//3.properties可保存在流中或在流中加载
		Properties properties=new Properties();
		//存储键值对
		properties.setProperty("1", "轩哥");
		properties.setProperty("2", "学神");
		properties.setProperty("3", "易抗");
		System.out.println(properties);
		String string=properties.getProperty("1");
		PrintWriter pw=null;
		try {
			pw=new PrintWriter("E:\\test.txt");
			//把prop数据输入到流中
			properties.list(pw);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (pw!=null) {
				pw.close();
			}
		}
	}

}
