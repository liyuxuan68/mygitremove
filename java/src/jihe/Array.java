package jihe;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Array {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Student[] students=new Student[10];
		for(int i=0;i<students.length;i++) {
			Student s=new Student(i, "����", 20);
			students[i]=s;
		}
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
	}
	
}
