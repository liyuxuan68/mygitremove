package set;


public class kebiancanshu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		add(10);
		add(10,20,300,40,50);
		add(new int[] {10,20,30,40,50});
		System.out.println(add(10));
	}
	public static int add(int a,int b) {
		return a+b;
	}
	//�ɱ�εĶ��巽ʽ
	//���Դ������飬�����Դ��������Ĵ���
	public static int add(int...a ) {
		int total=0;
		for(int i=0;i<a.length;i++) {
			total+=a[i];
		}
		return total;
	}

}
