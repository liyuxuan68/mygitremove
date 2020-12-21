package set;

import java.util.HashSet;
import java.util.Set;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Set1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//set集合不包含重复的元素。
		Set<String> set=new HashSet<>();
		//给set添加元素
		set.add("董卓");
		set.add("张让");
		set.add("何进");
		set.add("吕布");
		//set是无序的
		//set只能有一个null
		//set不是线程安全的
		System.out.println(set);
	}

}
