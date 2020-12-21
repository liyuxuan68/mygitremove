package jihe;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Array {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student[] students=new Student[10];
		for(int i=0;i<students.length;i++) {
			Student s=new Student(i, "老李", 20);
			students[i]=s;
		}
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
	}
	
}
