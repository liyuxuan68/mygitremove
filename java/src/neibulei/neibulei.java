package neibulei;
class outter{
	int num;
	public void outmethod() {
		System.out.println("�����ⲿ��ķ���");
	}
	class inner{
		int innernum;
		public void innermethod() {
			System.out.println("�����ڲ���ķ���");
			System.out.println(num);//�ڲ��������ֱ�ӷ����ⲿ��ı����ͷ���
		}
	}
	public void method() {
		inner i=new inner();//�ⲿ�������ֱ�ӷ����ڲ�����
		i.innernum=10;
		i.innermethod();
	}
}

public class neibulei {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//���ڲ���������ڲ���,����ֱ�Ӵ����ڲ���Ķ���
		outter outter=new outter();
		outter.inner inner=new outter().new inner();
		inner.innernum=13;
		inner.innermethod();
	}

}
