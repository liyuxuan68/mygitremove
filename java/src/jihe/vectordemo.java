package jihe;

import java.util.Vector;

public class vectordemo {
	public static void main(String[] args) {
		//vector底层也是数组，区别在于线程安全
		Vector<String> vector=new Vector<>();
		vector.addElement("关羽");
		vector.add("张飞");
		vector.add("赵云");	
		
	}
}
