package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//LinkedhashSet�����򼯺�
		Set<String> set=new LinkedHashSet<>();
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("�ŷ�");
		set.add("�ŷ�");
		System.out.println(set);
		String string="ac";
		String string2="ab";
		//�ַ���Ҳ�ܱȽϣ��Ȱ��յ�һ���ַ����Ƚϣ�˭��һ���ַ���˭�ʹ󡣵�һ����ȾͱȺ����
		int i=string.compareTo(string2);
		System.out.println(i);
		Student student=new Student("abc", 20);
		Student student2=new Student("acd", 19);
		int flag=student.compareTo(student2);
		System.out.println(flag);
	}

}
