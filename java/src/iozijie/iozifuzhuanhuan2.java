package iozijie;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class iozifuzhuanhuan2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		InputStreamReader inputStreamReader=null;
		try {
			inputStreamReader=new InputStreamReader(new FileInputStream("E:\\test.txt"));
			char[] c=new char[10];
			inputStreamReader.read(c);
			System.out.print(c);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (inputStreamReader!=null) {
				try {
					inputStreamReader.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
