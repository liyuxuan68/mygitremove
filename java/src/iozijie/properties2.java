package iozijie;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class properties2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Properties properties=new Properties();
		FileReader reader=null;
		try {
			reader=new FileReader("E:\\test.txt");
			//reader=properties2.class.getClassLoader().getResourceAsStream("test.txt");���Java��Ŀ��srcĿ¼�µ��ļ�
			//�����ж�ȡ����
			properties.load(reader);
			System.out.println(properties);
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
