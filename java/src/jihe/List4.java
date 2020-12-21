package jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List4 {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(1, "张三", 28));
		list.add(new Student(2, "李四", 25));
		list.add(new Student(3, "王五", 22));
		list.add(new Student(4, "赵六", 27));
		System.out.println(list);
		//集合反转
		Collections.reverse(list);
		System.out.println(list);
		//打乱顺序
		Collections.shuffle(list);
		System.out.println(list);
		//排序
		Collections.sort(list);
		System.out.println(list);
	}
}
