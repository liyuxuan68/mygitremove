package iozifu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Thewriter {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//io��i��input���룬io��o��ouput���
		//�����ݽǶȿ��Է�Ϊ�ֽ������ַ���
		//�ַ������ı��������ܶ����Ķ�������Ϊ���ַ���
		//�ֽ��������������ݣ������������Ǵ�һ�������
		//�ַ��������ĳ��ࣺReader������FileReader,BufferedReader
		//�ַ�������ĳ��ࣺWriter������FileWriter,BufferedWriter
		//���������������Reader��β����������������Writer��β
		File file=new File("D:\\test.txt");
		Writer writer=null;
		try {
			//IO����Ҫ�رյģ������������ƾͲ��ܹر���Դ
			//������ǰ�֪ʶ�����Լ��Ĵ��ԣ��������롣д�־��ǰ�֪ʶд����ֽ�ϣ�д�������
			writer=new FileWriter(file,true);//����true�����ǰ�ĸ��ǵ�
			char[] cs= {'a','b','c'};
			char[] cs2= {'a','b','c','d','e'};
			writer.write(cs);
			writer.write(cs2, 2, 2);//�ӵڶ�������������Ϊ2
			/*for(int i=0;i<100;i++) {
				writer.write("helloworld\r\n");//windows���м�\r\n
				if (i%10==0) {
					writer.flush();
				}
			}*/
			writer.write("hello");//����ˢ�²Ż���ʾ��������ر�������Ļ��������flush����
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			//�ж�writer���ǿշ�ָֹ���쳣
			//�ڹر�ǰ����flush������,Ҳ����ˢ��
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		

	}

}
