package object;

public class ToString {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		//���ࣺ���ϲ���ࡣobject��������ĸ���
		//����͸���֮�������ǳ���
		student student=new student();
		System.out.println(student);//ʵ���Ͼ��Ǵ�ӡtoString
		student.toString();
		//�����������hashֵ
		System.out.println(student.hashCode());
		//���hash��ʮ������
		String hv=Integer.toHexString(student.hashCode());
		System.out.println(hv);
		Class class1=student.getClass();
		System.out.println(class1);
		System.out.println(class1.getName());
	}

}
class student{
	int sno;
	String name;
	int age;
	public void learn() {
		System.out.println(name+"��ѧϰ");
	}

}
