package set;

import java.util.HashSet;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Set<person> set=new HashSet<>();
		set.add(new person("����", 26));
		set.add(new person("����", 28));
		set.add(new person("����", 27));
		set.add(new person("�ŷ�", 26));
		set.add(new person("�ŷ�", 26));
		//��������hash��equalsֵ����ȴ�����ͬһ������set���Զ�����hashcode��equals������������
		System.out.println(set);
		
		
	}

}
