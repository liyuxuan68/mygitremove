package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class list1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Collection<String> collection=new ArrayList<String>();
		collection.add("��˹��˹");
		collection.add("����");
		collection.add("������");
		collection.add("����");
		collection.add("����");
		iter(collection);
		collection.size();//���ϵĳ���
		
	}
	//�������ڱ����Ĺ����в������в������̲�������
	public static void iter(Collection<String> collection) {
		//���һ�����ϵĵ���������,�����������ָ����һȥ��������
		Iterator<String> iterator=collection.iterator();
		//����ͨ������������������
		while(iterator.hasNext()) {
			//������Ԫ��
			Object j=iterator.next();//������һ��Ԫ��
			System.out.println(j);
		}
	}
}
