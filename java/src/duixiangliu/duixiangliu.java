package duixiangliu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import neibulei.neibulei;

public class duixiangliu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//对象输出流：ObjectOutputStream将java对象写入outputstream
		//对象输入流：Objectinputstream对以前使用的ObjectOutputStream反序列化
		Person person=new Person("李雨轩", 21, new Date());
		Person person2=new Person("段中校", 23, new Date());
		Person person3=new Person("易将军", 20, new Date());
		//如果对多个对象序列化，一定要放在集合中
		List<Person> list=new ArrayList<Person>();
		list.add(person);
		list.add(person2);
		list.add(person3);
		ObjectOutputStream objectOutputStream=null;
		try {
			objectOutputStream=new ObjectOutputStream(new FileOutputStream("test.txt"));
			/*objectOutputStream.writeObject(person);*/
			objectOutputStream.writeObject(list);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (objectOutputStream!=null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
