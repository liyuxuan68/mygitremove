package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map2 {
	public static void main(String[] args) {
		//treemap以key来排序，key不能是null
		/*Map<String,String> map=new TreeMap<>();
		map.put("b", "林冲");
		map.put("a", "宋江");
		map.put("d", "吴用");
		map.put("c", "鲁智深");
		System.out.println(map);
		Collections.synchronizedMap(map);*/
		Map<person, String> map=new TreeMap<>();
		map.put(new person("及时雨", 25), "宋江");
		map.put(new person("青面兽", 26), "杨志");
		map.put(new person("黑旋风", 22), "李逵");
		System.out.println(map);
	}
}
