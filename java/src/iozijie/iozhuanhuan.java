package iozijie;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class iozhuanhuan {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�����ַ���ת���ֽ���������
		OutputStreamWriter outputStreamWriter=null;
		try {
			//�ַ���ͨ���ֽ�������ָ������
			outputStreamWriter=new OutputStreamWriter(new FileOutputStream("E:\\test.txt"));
			outputStreamWriter.write("abcdefg");
			outputStreamWriter.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (outputStreamWriter!=null) {
				try {
					outputStreamWriter.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}

}
