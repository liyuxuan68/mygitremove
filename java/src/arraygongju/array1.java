package arraygongju;

import java.util.Arrays;
import java.util.List;

public class array1 {
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] arr= {1,2,3,4};
		String string=Arrays.toString(arr);
		System.out.println(string);
		Arrays.sort(arr);//����,�Զ����ݶ�����������͵�compareto������������
		//���ַ�����
		int i=Arrays.binarySearch(arr, 3);
		System.out.println(i);
		//������ת����list
		Integer[] arr2= {3,6,8,9,11};
		List<Integer> list=Arrays.asList(arr2);
		System.out.println(list);
	}

}
