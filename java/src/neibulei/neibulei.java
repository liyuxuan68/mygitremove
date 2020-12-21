package neibulei;
class outter{
	int num;
	public void outmethod() {
		System.out.println("我是外部类的方法");
	}
	class inner{
		int innernum;
		public void innermethod() {
			System.out.println("我是内部类的方法");
			System.out.println(num);//内部的类可以直接访问外部类的变量和方法
		}
	}
	public void method() {
		inner i=new inner();//外部的类可以直接访问内部的类
		i.innernum=10;
		i.innermethod();
	}
}

public class neibulei {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//类内部的类就是内部类,不能直接创建内部类的对象
		outter outter=new outter();
		outter.inner inner=new outter().new inner();
		inner.innernum=13;
		inner.innermethod();
	}

}
