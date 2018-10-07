package util;

import java.util.Arrays;

/**
 * @author lbb 生成随机数列和检测排序算法的正确性
 */
public class DataSortTemplate {
	// 随机生成的数组
	public int[] generateRandomArray(int Size, int maxValue) {

		int[] arr = new int[Size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) ((maxValue) * Math.random());
		}
		return arr;

	}

	// 拷贝一份数组
	public int[] copyArray(int[] arry) {
		if (arry == null) {
			return null;
		}
		int[] res = new int[arry.length];
		for (int i = 0; i < arry.length; i++) {
			res[i] = arry[i];
		}

		return res;

	}
	
	//打印数组
	
	public void printArray(int[] arr){
		for(int i:arr){
			System.out.print(i+"\t");
		}
		System.out.println("***********************************");
		
	}
	
//	适用Array的自带的排序算法
	
	public void comparator(int[] arr){
		Arrays.sort(arr);
	}
	
//	判断两个数组是否相等
	public boolean isEqual(int[] arr1, int[] arr2) {
		if ((arr1 == null) || (arr2 == null)) {
			return false;
		}
		if(arr1==null&&arr2==null){
			return true;
		}
		if (arr1.length != arr2.length) {
			return false;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[1] != arr2[i]) {
				return false;
			}

		}
		return true;

	}
	

}
