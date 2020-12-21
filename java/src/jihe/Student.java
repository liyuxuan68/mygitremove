package jihe;

public class Student implements Comparable<Student>{
	private int stuno;
	private String name;
	private int age;
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
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
	public Student(int stuno, String name, int age) {
		super();
		this.stuno = stuno;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [stuno=" + stuno + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO 自动生成的方法存根
		return this.age-o.age;
	}
	
	
}
