package iozifu;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Thereader2 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�������������󡣶�ȡ���ݡ��ر���������
		File file=new File("E:\\test.txt");
		FileReader reader=null;
		String string="";
		try {
			reader=new FileReader(file);
			/*char[] cs=new char[5];
			//���ַ�������������
			int l=reader.read(cs);
			System.out.println(Arrays.toString(cs));*/
			char[] cs=new char[5];
			int l=-1;
			while((l=reader.read(cs))!=-1) {
				String string2=new String(cs,0,l);
				string+=string2;
			}
			System.out.println(string);
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
