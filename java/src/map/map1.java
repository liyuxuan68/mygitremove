package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//map��һ����ֵ�Եļ���,key��value�������κ����ͣ������ǻ����������ͣ�������
		Map<String,String> map=new HashMap<>();
		map.put("����ͷ", "�ֳ�");
		map.put("��ʱ��", "�ν�");
		map.put("�Ƕ���", "����");
		map.put("������", "³����");
		//��������ظ���key�ͻ��֮ǰ�ĸ��ǵ�
		//��������һ���ǿյģ�ֵ�����ж��Ϊ��
		System.out.println(map);
		Map<String,String> map1=new HashMap<>();
		map1.put("������", "����ʤ");
		map1.put("������", "����");
		map.putAll(map1);
		System.out.println(map);
		//map.clear();���
		map.remove("����ͷ");//ɾ��
		//��ȡmap�е�ֵ
		String string=map.get("��ʱ��");
		//���һ��map���ϵ�key��set����
		Set<String> set=map.keySet();
		System.out.println(set);
		//����map����
		for(String key:set) {
			//����key����map�е�value
			String string2=map.get(key);
		}
		//�ж��Ƿ����ĳ��key
		boolean flag=map.containsKey("����ͷ");
		//�ж��Ƿ����ĳ��value
		boolean flag2=map.containsValue("�ֳ�");
		//�ж��Ƿ��ǿռ���
		boolean flag3=map.isEmpty();
		//�Ѽ���ֵ������һ���������棬Ȼ�������map������Ҫ����set����list
		Set<Map.Entry<String, String>> set2=map.entrySet();
		for(Map.Entry<String, String> entry:set2) {
			String key=entry.getKey();
			String value=entry.getValue();
		}
		
		
		

	}

}
