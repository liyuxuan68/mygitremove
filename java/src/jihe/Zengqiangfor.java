package jihe;

import java.util.ArrayList;
import java.util.List;

public class Zengqiangfor {
	public static void main(String[] args) {
		String[] strings=new String[]{"����","��","����","�ŷ�","����","κ��"};
		//for(�������� ������������ϱ���)
		for(String str:strings) {
			System.out.println(str);
		}
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//���ܲ���ִ��
		for(Integer w:list) {
			System.out.println(w);
		}
	}
	
}
