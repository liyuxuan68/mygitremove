package jihe;

import java.util.ArrayList;
import java.util.Collection;

public class list {
	public static void main(String[] args) {
		//���;����ڼ�����ָ���洢���ݵ�����
		Collection<String> collection=new ArrayList<String>();
		collection.add("��˹��˹");
		collection.add("����");
		collection.add("������");
		System.out.println(collection);
		Collection<String> collection2=new ArrayList<String>();
		collection2.add("����");
		collection2.add("����");
		//��һ�����ϵ����ݼ��뵽��һ��������
		collection.addAll(collection2);
		//������������Ϊһ��Ԫ����ӵ���������
		//collection.add(collection2);
		System.out.println(collection);
		//�������Ԫ��
		//collection.clear();
		//������ɾ��
		//collection.remove(collection2);
		//�ؼ�����ɾ��ĳ��Ԫ��
		collection.remove("��˹��˹");
		System.out.println(collection);
		//�жϼ������Ƿ����ĳ��Ԫ��
		boolean flag=collection.contains("����");
		System.out.println(flag);
		//��ѯ�������Ԫ��
		boolean flag2=collection.containsAll(collection2);
		System.out.println(flag2);
		//�ж�һ�������Ƿ�Ϊ��
		boolean flag3=collection.isEmpty();
		//�Ѽ���ת��������
		Object[] object=collection.toArray();
		System.out.println(object);
		for(int i=0;i<object.length;i++) {
			System.out.println(object[i]);
		}
	}
}
