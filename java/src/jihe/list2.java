package jihe;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class list2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//list有序的集合，就像我们的数组一样。我们可以把list理解为是一个长度可变的数组，而且提供了丰富的API
		List<String> list=new ArrayList<String>();
		list.add("吴用");//0
		list.add("刘唐");//1
		list.add("松江");//2
		int index=list.indexOf("刘唐");//获得list中第一次出现该元素的索引
		int index2=list.lastIndexOf("刘唐");//返回此列表中最后一次出现该元素的素索引
		System.out.println(list);
		list.add(1, "晁盖");//插入一个元素
		System.out.println(list);
		List<String> list2=new ArrayList<String>();
		list2.add("阮小五");
		list2.add("阮小二");
		list2.add("阮小七");
		list.addAll(list2);
		System.out.println(list);
		//根据索引来获取对应的内容
		String oString=list.get(1);
		System.out.println(oString);
		listinterator1(list);
		System.out.println("----------------------------------------");
		listinterator2(list2);
		xunhuan(list);
		
	}
	//list不可以在使用迭代器的过程中操作集合，但是可以操作迭代器
	public static void listinterator1(List<String> list) {
		ListIterator<String> listIterator=list.listIterator();
		while(listIterator.hasNext()) {
			String string=listIterator.next();
			System.out.println(string);
			if ("刘唐".equals(string)) {
				//迭代器添加元素本次遍历无效
				listIterator.add("武松");
			}
		}
	
		System.out.println(list);
	}
	public static void listinterator2(List<String> list) {
		ListIterator<String> listIterator=list.listIterator();
		//向上一个元素遍历
		while(listIterator.hasPrevious()) {
			String string=listIterator.previous();
			System.out.println(string);
		}
	}
	public static void xunhuan(List<String> list) {
		for(int i=0;i<list.size();i++) {
			String string=list.get(i);
			System.out.println(string);
			if ("刘唐".equals(string)) {
				list.add(i+1,"武松");
			}
		}
	}
}
