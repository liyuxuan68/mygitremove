package iozijie;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Zijieinput {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�ֽ�����̫�ʺ��ı��Ķ�ȡ����������Ŀ��ܳ�������
		InputStream inputStream=null;
		try {
			byte[] bs=new byte[10];
			inputStream=new FileInputStream("E:\\test2.txt");
			int l=inputStream.read(bs);//�����ֽ���
			/*System.out.println(Arrays.toString(bs));*/
			System.out.println(new String(bs, 0, l));//ת�����ַ���
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (inputStream!=null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}

}
