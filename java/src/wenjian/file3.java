package wenjian;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class file3 {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\test.txt");
		//��ȡ�ļ��ľ���·��
		String string=file.getAbsolutePath();
		//����һ���ļ������·��,���·�����ǵ�ǰ��Ŀ�ĸ�·��
		File file2=new File("test.txt");
		file2.createNewFile();
		String string2=file2.getAbsolutePath();
		System.out.println(string2);
		//��ȡ�ļ������·��
		String string3=file2.getPath();
		System.out.println(string3);
		//����ļ��Ĵ�С
		long length=file2.length();
		System.out.println(length);
		//����ļ�������޸�ʱ��
		long l=file2.lastModified();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(l));
		//��õ��Դ��̵ĸ�Ŀ¼
		File[] files=File.listRoots();
		System.out.println(Arrays.toString(files));

		
		
	}
}
