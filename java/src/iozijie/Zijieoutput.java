package iozijie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Zijieoutput {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�ֽ�����ȡ���������ݣ�����MP3��MP4
		//����һ���ֽ�������
		OutputStream outputStream=null;
		try {
			byte[] bs= {97,98,100,101};
			outputStream=new FileOutputStream("E://test.txt");
			outputStream.write(bs);
			//�ֽ�������Ҫflush
			/*outputStream.write(98);*/
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if (outputStream!=null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}

}
