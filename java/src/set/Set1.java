package set;

import java.util.HashSet;
import java.util.Set;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Set1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//set���ϲ������ظ���Ԫ�ء�
		Set<String> set=new HashSet<>();
		//��set���Ԫ��
		set.add("��׿");
		set.add("����");
		set.add("�ν�");
		set.add("����");
		//set�������
		//setֻ����һ��null
		//set�����̰߳�ȫ��
		System.out.println(set);
	}

}
