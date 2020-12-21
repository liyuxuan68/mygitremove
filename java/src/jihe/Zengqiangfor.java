package jihe;

import java.util.ArrayList;
import java.util.List;

public class Zengqiangfor {
	public static void main(String[] args) {
		String[] strings=new String[]{"赵云","马超","黄忠","张飞","关羽","魏延"};
		//for(数据类型 输出变量：集合变量)
		for(String str:strings) {
			System.out.println(str);
		}
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//不能并发执行
		for(Integer w:list) {
			System.out.println(w);
		}
	}
	
}
