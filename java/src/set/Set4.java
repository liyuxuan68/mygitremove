package set;

import java.util.Set;
import java.util.TreeSet;

public class Set4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//treeset按照从小到大的顺序进行排序，treeset的泛型对象必须实现比较接口,treeset自动调用泛型的Comparable
		Set<Student> set=new TreeSet<>();
		Student student=new Student("abc", 20);
		Student student2=new Student("abd", 19);
		set.add(student);
		set.add(student2);
		System.out.println(set);
	}

}
