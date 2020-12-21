package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//LinkedhashSet是有序集合
		Set<String> set=new LinkedHashSet<>();
		set.add("孔明");
		set.add("刘备");
		set.add("关羽");
		set.add("张飞");
		set.add("张飞");
		System.out.println(set);
		String string="ac";
		String string2="ab";
		//字符串也能比较，先按照第一个字符来比较，谁第一个字符大谁就大。第一个相等就比后面的
		int i=string.compareTo(string2);
		System.out.println(i);
		Student student=new Student("abc", 20);
		Student student2=new Student("acd", 19);
		int flag=student.compareTo(student2);
		System.out.println(flag);
	}

}
