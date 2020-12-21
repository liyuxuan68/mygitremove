package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class map3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//hashtable是线程安全的，不允许有null
		Map<String,String> map=new Hashtable<>();
		map.put("豹子头", "林冲");
		map.put("及时雨", "宋江");
		map.put("智多星", "吴用");
		map.put("花和尚", "鲁智深");
		//LinkedHashmap是有序的
	}

}
