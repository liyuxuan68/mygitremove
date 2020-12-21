package duixiangliu;

import java.io.Serializable;
import java.util.Date;

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9045928213592974311L;//固定序列号,使反序列化能够正常运行
	private String name;
	private int age;
	Date date;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", date=" + date + "]";
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
	public Person(String name, int age, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
