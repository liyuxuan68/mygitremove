package bianma;
import java.util.Arrays;


public class bianma1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//asci`i GBK:用于储存中文的码表 UTF-8:最大的一张码表包含了所有字符的标准
		String string="中";
		
		try {
			byte[] bs=string.getBytes("UTF-8");
			System.out.println(Arrays.toString(bs));
			String string2=new String(bs, "UTF-8");
			System.out.println(string2);
		} catch (Exception e) {
			// TODO 自动生成的 catch块
			e.printStackTrace();
		}
	}

}
