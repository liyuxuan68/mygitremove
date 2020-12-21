package wenjian;

import java.io.File;

public class file5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file=new File("E:\\tupian");
		delect(file);
	}
	public static void delect(File file) {
		if(!file.exists()||file==null) {
			return ;
		}
		File[] files=file.listFiles();
		for(File file2:files) {
			if(file2.isDirectory()) {
				delect(file2);
			}else {
				file2.delete();
			}
		}
	}
}
