package iozifu;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class copy {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�����ļ�
		File file=new File("E:\\test.txt");
		File file2=new File("E:\\test2.txt");
		Writer writer=null;
		Reader reader=null;
		try {
			reader=new FileReader(file);
			writer=new FileWriter(file2);
			char[] cs=new char[1024];
			int l=-1;
			while((l=reader.read(cs))!=-1) {
				//����������ȡ��������д�뵽�����
				writer.write(cs, 0, l);
			}
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			//���ŵ��ȹر�
			if (writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
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
