package duixiangliu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import neibulei.neibulei;

public class duixiangliu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�����������ObjectOutputStream��java����д��outputstream
		//������������Objectinputstream����ǰʹ�õ�ObjectOutputStream�����л�
		Person person=new Person("������", 21, new Date());
		Person person2=new Person("����У", 23, new Date());
		Person person3=new Person("�׽���", 20, new Date());
		//����Զ���������л���һ��Ҫ���ڼ�����
		List<Person> list=new ArrayList<Person>();
		list.add(person);
		list.add(person2);
		list.add(person3);
		ObjectOutputStream objectOutputStream=null;
		try {
			objectOutputStream=new ObjectOutputStream(new FileOutputStream("test.txt"));
			/*objectOutputStream.writeObject(person);*/
			objectOutputStream.writeObject(list);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (objectOutputStream!=null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}

}
