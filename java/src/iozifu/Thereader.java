package iozifu;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Thereader {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�������������󡣶�ȡ���ݡ��ر���������
		File file=new File("D:\\test.txt");
		FileReader reader=null;
		String string="";
		try {
			reader=new FileReader(file);
			//��ȡ���ַ���ת����ascii
			/*int c=reader.read();
			System.out.println((char)c);*/
			int c=-1;
			//�����ַ��Ķ�ȡ���ܵ�
			while((c=reader.read())!=-1) {
				string+=(char)c;
			}
			System.out.println(string);
			char[] cs=new char[10];
			//���ַ�������������
			int l=reader.read(cs);//���ص�����Ч���ַ�����
			System.out.println(cs);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}

}
