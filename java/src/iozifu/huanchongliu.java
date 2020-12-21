package iozifu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class huanchongliu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BufferedWriter bufferedWriter=null;
		try {
			bufferedWriter=new BufferedWriter(new FileWriter("E:\\test2.txt"));
			bufferedWriter.write("我来了");
			//换行
			bufferedWriter.newLine();
			bufferedWriter.write("来了就好");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (bufferedWriter!=null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
