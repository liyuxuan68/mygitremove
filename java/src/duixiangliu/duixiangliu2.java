package duixiangliu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class duixiangliu2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ObjectInputStream objectInputStream=null;
		try {
			objectInputStream=new ObjectInputStream(new FileInputStream("test.txt"));
			/*Object object=objectInputStream.readObject();
			Person person=(Person) object;
			System.out.println(person.getName()+" "+person.getAge()+" "+person.getDate());*/
			List<Person> list=(List<Person>) objectInputStream.readObject();
			System.out.println(list);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if (objectInputStream!=null) {
				try {
					objectInputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}
