package iozifu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Hcreader {

	public static void main(String[] args){
		// TODO �Զ����ɵķ������
		
		BufferedReader reader=null;
		try {
			//����һ����Ч���������ַ���
			reader=new BufferedReader(new FileReader("E:\\test.txt"));
			//reader.readLine();//��ȡһ��,�����ȡ�����ٶ�����ʾnull
			String string=null;
			while((string=reader.readLine())!=null) {
				System.out.print(string);
			}
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			//�ر��������ʱ���ڲ���Դ���Զ��Ĺر�
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
