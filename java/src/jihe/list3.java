package jihe;

import java.util.ArrayList;
import java.util.List;

public class list3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//arraylist�е�Ԫ�ؿ��ظ���������ļ��ϣ����Ȳ��̶������ǰ�ȫ�̣߳�Ч�ʸߣ��ײ������顣��������ݵ�ʱ���ʼ�ĳ�����10����������5�����������伯�ϵĳ���
		List<String> list=new ArrayList<String>();
		list.add("����");//0
		list.add("����");//1
		list.add("�ɽ�");//2
		list.add("��С��");
		list.add("��С��");
		list.add("��С��");
		Object remove=list.remove(1);//����ɾ�����Ǹ�Ԫ��
		System.out.println(remove);
		list.set(2, "�˸�");//��ָ��λ���滻Ԫ��
		System.out.println(list);
	}

}
