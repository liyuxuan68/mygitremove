package jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List4 {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(1, "����", 28));
		list.add(new Student(2, "����", 25));
		list.add(new Student(3, "����", 22));
		list.add(new Student(4, "����", 27));
		System.out.println(list);
		//���Ϸ�ת
		Collections.reverse(list);
		System.out.println(list);
		//����˳��
		Collections.shuffle(list);
		System.out.println(list);
		//����
		Collections.sort(list);
		System.out.println(list);
	}
}
