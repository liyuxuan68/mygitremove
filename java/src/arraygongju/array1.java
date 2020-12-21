package arraygongju;

import java.util.Arrays;
import java.util.List;

public class array1 {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr= {1,2,3,4};
		String string=Arrays.toString(arr);
		System.out.println(string);
		Arrays.sort(arr);//排序,自动根据对象或其他类型的compareto方法进行排序。
		//二分法查找
		int i=Arrays.binarySearch(arr, 3);
		System.out.println(i);
		//把数组转换成list
		Integer[] arr2= {3,6,8,9,11};
		List<Integer> list=Arrays.asList(arr2);
		System.out.println(list);
	}

}
