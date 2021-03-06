package set;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO 自动生成的方法存根
		int flag=this.age-o.age;
		if (flag==0) {
			flag=this.name.compareTo(name);
		}
		return flag;
	}
	
}
