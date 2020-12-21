package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class list1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Collection<String> collection=new ArrayList<String>();
		collection.add("劳斯莱斯");
		collection.add("宾利");
		collection.add("法拉利");
		collection.add("奔驰");
		collection.add("宝马");
		iter(collection);
		collection.size();//集合的长度
		
	}
	//迭代器在遍历的过程中不允许有并发进程操作集合
	public static void iter(Collection<String> collection) {
		//获得一个集合的迭代器对象,迭代器对象的指针是一去不复返的
		Iterator<String> iterator=collection.iterator();
		//我们通过迭代器来遍历集合
		while(iterator.hasNext()) {
			//获得这个元素
			Object j=iterator.next();//返回下一个元素
			System.out.println(j);
		}
	}
}
