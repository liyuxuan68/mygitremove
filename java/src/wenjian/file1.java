package wenjian;

import java.io.File;

public class file1 {
	public static void main(String[] args) {
		//�ļ��Ĺ����������������ļ������
		File file=new File("E:\\test.txt");
		System.out.println(file);
		File file2=new File("E:\\test", "test.txt");
		System.out.println(file2.getName());
		//java��file��Ķ�����Դ���Ŀ¼��Ҳ���Դ����ļ�
		File file3=new File("E:\\test");
		System.out.println(file3.getName());
		//����Ŀ¼���ļ����󴴽�һ���ļ�
		File file4=new File(file3,"test.txt");
		System.out.println(file4.getName());
	}
}
