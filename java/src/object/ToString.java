package object;

public class ToString {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		//根类：最上层的类。object是所有类的根类
		//根类和父类之间的类就是超类
		student student=new student();
		System.out.println(student);//实际上就是打印toString
		student.toString();
		//获得这个对象的hash值
		System.out.println(student.hashCode());
		//获得hash的十六进制
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
		System.out.println(name+"在学习");
	}

}
