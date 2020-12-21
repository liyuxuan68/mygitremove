package jihe;

import java.util.ArrayList;
import java.util.List;

public class list3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//arraylist中的元素可重复，是有序的集合，长度不固定，不是安全线程，效率高，底层是数组。在添加数据的时候初始的长度是10，后续会以5个长度来扩充集合的长度
		List<String> list=new ArrayList<String>();
		list.add("吴用");//0
		list.add("刘唐");//1
		list.add("松江");//2
		list.add("阮小五");
		list.add("阮小二");
		list.add("阮小七");
		Object remove=list.remove(1);//返回删除的那个元素
		System.out.println(remove);
		list.set(2, "晁盖");//在指定位置替换元素
		System.out.println(list);
	}

}
