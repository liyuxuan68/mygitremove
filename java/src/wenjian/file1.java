package wenjian;

import java.io.File;

public class file1 {
	public static void main(String[] args) {
		//文件的构造器是用来创建文件对象的
		File file=new File("E:\\test.txt");
		System.out.println(file);
		File file2=new File("E:\\test", "test.txt");
		System.out.println(file2.getName());
		//java中file类的对象可以代表目录，也可以代表文件
		File file3=new File("E:\\test");
		System.out.println(file3.getName());
		//根据目录的文件对象创建一个文件
		File file4=new File(file3,"test.txt");
		System.out.println(file4.getName());
	}
}
