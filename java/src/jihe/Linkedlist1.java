package jihe;

import java.util.LinkedList;

public class Linkedlist1 {
	public static void main(String[] args) {
		//也不是线程安全的,以链表为原理，添加删除性能高.
		LinkedList<String> list=new LinkedList<>();
		list.add("张飞");
		list.add("黄忠");
		list.add("马超");
		list.addFirst("李雨轩");
		list.addLast("关羽");
		//移除第一个
		list.removeFirst();
		//把队列看作是一个栈，出栈从头开始出栈
		Object pop=list.pop();
		System.out.println("出栈的元素"+pop);
		System.out.println(list);
		//压栈
		list.push("赵云");
		System.out.println(list);

	}

	
		
	
}
