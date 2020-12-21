package wenjian;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class file3 {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\test.txt");
		//获取文件的绝对路径
		String string=file.getAbsolutePath();
		//创建一个文件用相对路径,相对路径就是当前项目的根路径
		File file2=new File("test.txt");
		file2.createNewFile();
		String string2=file2.getAbsolutePath();
		System.out.println(string2);
		//获取文件的相对路径
		String string3=file2.getPath();
		System.out.println(string3);
		//获得文件的大小
		long length=file2.length();
		System.out.println(length);
		//获得文件的最后修改时间
		long l=file2.lastModified();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(l));
		//获得电脑磁盘的根目录
		File[] files=File.listRoots();
		System.out.println(Arrays.toString(files));

		
		
	}
}
