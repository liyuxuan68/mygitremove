package neibulei;
interface teacher{
	public void teach();
}
class Javateacher implements teacher{

	@Override
	public void teach() {
		// TODO �Զ����ɵķ������
		
	}
	
}
abstract class teacher1{
	private String name;
	
	public teacher1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void teach() {
		System.out.println(name);
	}
}
public class niming {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�ýӿںͳ�����ʵ�������ڲ���
		teacher jt1=new Javateacher();
		jt1.teach();
		//�����Ĳ��ǽӿڵı���,����Ĵ����ž���һ��������
		teacher jt2=new teacher() {
			public void teach() {
				// TODO �Զ����ɵķ������
				System.out.println("���������ڲ���ķ���");
			}
		};
		jt2.teach();
		teacher1 jt3=new teacher1("������") {
			public void teach() {
				System.out.println(getName());
			}
		};
		jt3.teach();
	}
		
}
