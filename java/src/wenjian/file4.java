package wenjian;

import java.io.File;

public class file4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file=new File("E:\\test.txt");
		//判断这个文件对象是否是文件
		boolean flag=file.isFile();
		//判断一个文件对象是否是目录
		boolean flag2=file.isDirectory();
		//判断文件是否可读
		boolean flag3=file.canRead();
		//判断文件是否可写
		boolean flag4=file.canWrite();
		//判断文件是否是隐藏的
		boolean flag5=file.isHidden();
		
	}

}
