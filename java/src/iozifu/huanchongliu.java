package iozifu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class huanchongliu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		BufferedWriter bufferedWriter=null;
		try {
			bufferedWriter=new BufferedWriter(new FileWriter("E:\\test2.txt"));
			bufferedWriter.write("������");
			//����
			bufferedWriter.newLine();
			bufferedWriter.write("���˾ͺ�");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (bufferedWriter!=null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}

}
