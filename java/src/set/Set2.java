package set;

import java.util.HashSet;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Set<person> set=new HashSet<>();
		set.add(new person("孔明", 26));
		set.add(new person("刘备", 28));
		set.add(new person("关羽", 27));
		set.add(new person("张飞", 26));
		set.add(new person("张飞", 26));
		//如果对象的hash和equals值都相等代表是同一个对象。set会自动调用hashcode和equals方法进行排重
		System.out.println(set);
		
		
	}

}
