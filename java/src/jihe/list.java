package jihe;

import java.util.ArrayList;
import java.util.Collection;

public class list {
	public static void main(String[] args) {
		//泛型就是在集合中指定存储数据的类型
		Collection<String> collection=new ArrayList<String>();
		collection.add("劳斯莱斯");
		collection.add("宾利");
		collection.add("法拉利");
		System.out.println(collection);
		Collection<String> collection2=new ArrayList<String>();
		collection2.add("奔驰");
		collection2.add("宝马");
		//把一个集合的内容加入到另一个集合中
		collection.addAll(collection2);
		//把整个集合作为一个元素添加到集合里面
		//collection.add(collection2);
		System.out.println(collection);
		//清空所有元素
		//collection.clear();
		//批量的删除
		//collection.remove(collection2);
		//重集合中删除某个元素
		collection.remove("劳斯莱斯");
		System.out.println(collection);
		//判断集合中是否包含某个元素
		boolean flag=collection.contains("宝马");
		System.out.println(flag);
		//查询包含多个元素
		boolean flag2=collection.containsAll(collection2);
		System.out.println(flag2);
		//判断一个集合是否为空
		boolean flag3=collection.isEmpty();
		//把集合转化成数组
		Object[] object=collection.toArray();
		System.out.println(object);
		for(int i=0;i<object.length;i++) {
			System.out.println(object[i]);
		}
	}
}
