package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map2 {
	public static void main(String[] args) {
		//treemap��key������key������null
		/*Map<String,String> map=new TreeMap<>();
		map.put("b", "�ֳ�");
		map.put("a", "�ν�");
		map.put("d", "����");
		map.put("c", "³����");
		System.out.println(map);
		Collections.synchronizedMap(map);*/
		Map<person, String> map=new TreeMap<>();
		map.put(new person("��ʱ��", 25), "�ν�");
		map.put(new person("������", 26), "��־");
		map.put(new person("������", 22), "����");
		System.out.println(map);
	}
}
