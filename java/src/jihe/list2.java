package jihe;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class list2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//list����ļ��ϣ��������ǵ�����һ�������ǿ��԰�list���Ϊ��һ�����ȿɱ�����飬�����ṩ�˷ḻ��API
		List<String> list=new ArrayList<String>();
		list.add("����");//0
		list.add("����");//1
		list.add("�ɽ�");//2
		int index=list.indexOf("����");//���list�е�һ�γ��ָ�Ԫ�ص�����
		int index2=list.lastIndexOf("����");//���ش��б������һ�γ��ָ�Ԫ�ص�������
		System.out.println(list);
		list.add(1, "�˸�");//����һ��Ԫ��
		System.out.println(list);
		List<String> list2=new ArrayList<String>();
		list2.add("��С��");
		list2.add("��С��");
		list2.add("��С��");
		list.addAll(list2);
		System.out.println(list);
		//������������ȡ��Ӧ������
		String oString=list.get(1);
		System.out.println(oString);
		listinterator1(list);
		System.out.println("----------------------------------------");
		listinterator2(list2);
		xunhuan(list);
		
	}
	//list��������ʹ�õ������Ĺ����в������ϣ����ǿ��Բ���������
	public static void listinterator1(List<String> list) {
		ListIterator<String> listIterator=list.listIterator();
		while(listIterator.hasNext()) {
			String string=listIterator.next();
			System.out.println(string);
			if ("����".equals(string)) {
				//���������Ԫ�ر��α�����Ч
				listIterator.add("����");
			}
		}
	
		System.out.println(list);
	}
	public static void listinterator2(List<String> list) {
		ListIterator<String> listIterator=list.listIterator();
		//����һ��Ԫ�ر���
		while(listIterator.hasPrevious()) {
			String string=listIterator.previous();
			System.out.println(string);
		}
	}
	public static void xunhuan(List<String> list) {
		for(int i=0;i<list.size();i++) {
			String string=list.get(i);
			System.out.println(string);
			if ("����".equals(string)) {
				list.add(i+1,"����");
			}
		}
	}
}
