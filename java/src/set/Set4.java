package set;

import java.util.Set;
import java.util.TreeSet;

public class Set4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//treeset���մ�С�����˳���������treeset�ķ��Ͷ������ʵ�ֱȽϽӿ�,treeset�Զ����÷��͵�Comparable
		Set<Student> set=new TreeSet<>();
		Student student=new Student("abc", 20);
		Student student2=new Student("abd", 19);
		set.add(student);
		set.add(student2);
		System.out.println(set);
	}

}
