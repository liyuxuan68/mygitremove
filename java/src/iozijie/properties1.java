package iozijie;

import java.io.PrintWriter;
import java.util.Properties;

public class properties1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//properties��ʾһ���־õ����Լ�
		//1.�̳���hashtable�����̰߳�ȫ�ļ�ֵ�Դ洢�ṹ
		//2.ֻ�ܴ����ַ�����ֵ��
		//3.properties�ɱ��������л������м���
		Properties properties=new Properties();
		//�洢��ֵ��
		properties.setProperty("1", "����");
		properties.setProperty("2", "ѧ��");
		properties.setProperty("3", "�׿�");
		System.out.println(properties);
		String string=properties.getProperty("1");
		PrintWriter pw=null;
		try {
			pw=new PrintWriter("E:\\test.txt");
			//��prop�������뵽����
			properties.list(pw);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (pw!=null) {
				pw.close();
			}
		}
	}

}
