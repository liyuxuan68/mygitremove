package neibulei;
interface teacher{
	public void teach();
}
class Javateacher implements teacher{

	@Override
	public void teach() {
		// TODO 自动生成的方法存根
		
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
		// TODO 自动生成的方法存根
		//用接口和抽象类实现匿名内部类
		teacher jt1=new Javateacher();
		jt1.teach();
		//创建的不是接口的本身,后面的大括号就是一个匿名类
		teacher jt2=new teacher() {
			public void teach() {
				// TODO 自动生成的方法存根
				System.out.println("我是匿名内部类的方法");
			}
		};
		jt2.teach();
		teacher1 jt3=new teacher1("李雨轩") {
			public void teach() {
				System.out.println(getName());
			}
		};
		jt3.teach();
	}
		
}
