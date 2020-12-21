package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//map是一个键值对的集合,key和value可以是任何类型（不能是基本数据类型），无序
		Map<String,String> map=new HashMap<>();
		map.put("豹子头", "林冲");
		map.put("及时雨", "宋江");
		map.put("智多星", "吴用");
		map.put("花和尚", "鲁智深");
		//如果存在重复的key就会把之前的覆盖掉
		//键允许有一个是空的，值允许有多个为空
		System.out.println(map);
		Map<String,String> map1=new HashMap<>();
		map1.put("入云龙", "公孙胜");
		map1.put("黑旋风", "李逵");
		map.putAll(map1);
		System.out.println(map);
		//map.clear();清空
		map.remove("豹子头");//删除
		//获取map中的值
		String string=map.get("及时雨");
		//获得一个map集合的key的set集合
		Set<String> set=map.keySet();
		System.out.println(set);
		//遍历map集合
		for(String key:set) {
			//根据key遍历map中的value
			String string2=map.get(key);
		}
		//判断是否存在某个key
		boolean flag=map.containsKey("豹子头");
		//判断是否存在某个value
		boolean flag2=map.containsValue("林冲");
		//判断是否是空集合
		boolean flag3=map.isEmpty();
		//把键和值都放入一个集合里面，然后遍历。map遍历需要借助set或者list
		Set<Map.Entry<String, String>> set2=map.entrySet();
		for(Map.Entry<String, String> entry:set2) {
			String key=entry.getKey();
			String value=entry.getValue();
		}
		
		
		

	}

}
