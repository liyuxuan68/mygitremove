package wenjian;

import java.io.File;
import java.io.IOException;

public class file2 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		File file=new File("E:\\tupian\\hello.txt");
		//获得1一个目录下的子文件对象
		file.listFiles();
		//获得子文件名字
		file.list();
		//判断文件是否存在
		boolean flag=file.exists();
		//创建一个文件
		boolean flag2=file.createNewFile();
		//创建目录
		File file2=new File("E:\\tupian\\hello");
		boolean flag3=file2.mkdir();
		//创建多级目录
		File file3=new File("E:\\tupian\\hello1\\www\\dddd");
		boolean flag4=file3.mkdirs();
		//文件的删除,不会进入回收站,删除路径的最后一层。只有空目录才能删除
		file.delete();
	}

}
