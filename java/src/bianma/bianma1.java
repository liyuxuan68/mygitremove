package bianma;
import java.util.Arrays;


public class bianma1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//asci`i GBK:���ڴ������ĵ���� UTF-8:����һ���������������ַ��ı�׼
		String string="��";
		
		try {
			byte[] bs=string.getBytes("UTF-8");
			System.out.println(Arrays.toString(bs));
			String string2=new String(bs, "UTF-8");
			System.out.println(string2);
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch��
			e.printStackTrace();
		}
	}

}
