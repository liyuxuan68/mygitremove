package jihe;

import java.util.LinkedList;

public class Linkedlist1 {
	public static void main(String[] args) {
		//Ҳ�����̰߳�ȫ��,������Ϊԭ�����ɾ�����ܸ�.
		LinkedList<String> list=new LinkedList<>();
		list.add("�ŷ�");
		list.add("����");
		list.add("��");
		list.addFirst("������");
		list.addLast("����");
		//�Ƴ���һ��
		list.removeFirst();
		//�Ѷ��п�����һ��ջ����ջ��ͷ��ʼ��ջ
		Object pop=list.pop();
		System.out.println("��ջ��Ԫ��"+pop);
		System.out.println(list);
		//ѹջ
		list.push("����");
		System.out.println(list);

	}

	
		
	
}
