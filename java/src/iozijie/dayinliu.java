package iozijie;

import java.io.PrintWriter;

public class dayinliu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		PrintWriter pw=null;
		try {
			/*pw=new PrintWriter("E:\\test.txt");*/
			pw=new PrintWriter(System.out);
			pw.print(1);
			pw.print("ssjsj");
			pw.print(2);
			pw.print(1);
			pw.print(1);
			pw.print(1);
			pw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (pw!=null) {
				pw.close();
			}
		}
	}

}
