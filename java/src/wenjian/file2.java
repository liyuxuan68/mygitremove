package wenjian;

import java.io.File;
import java.io.IOException;

public class file2 {

	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		File file=new File("E:\\tupian\\hello.txt");
		//���1һ��Ŀ¼�µ����ļ�����
		file.listFiles();
		//������ļ�����
		file.list();
		//�ж��ļ��Ƿ����
		boolean flag=file.exists();
		//����һ���ļ�
		boolean flag2=file.createNewFile();
		//����Ŀ¼
		File file2=new File("E:\\tupian\\hello");
		boolean flag3=file2.mkdir();
		//�����༶Ŀ¼
		File file3=new File("E:\\tupian\\hello1\\www\\dddd");
		boolean flag4=file3.mkdirs();
		//�ļ���ɾ��,����������վ,ɾ��·�������һ�㡣ֻ�п�Ŀ¼����ɾ��
		file.delete();
	}

}
