package wenjian;

import java.io.File;

public class file4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File file=new File("E:\\test.txt");
		//�ж�����ļ������Ƿ����ļ�
		boolean flag=file.isFile();
		//�ж�һ���ļ������Ƿ���Ŀ¼
		boolean flag2=file.isDirectory();
		//�ж��ļ��Ƿ�ɶ�
		boolean flag3=file.canRead();
		//�ж��ļ��Ƿ��д
		boolean flag4=file.canWrite();
		//�ж��ļ��Ƿ������ص�
		boolean flag5=file.isHidden();
		
	}

}
