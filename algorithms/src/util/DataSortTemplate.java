package util;

import java.util.Arrays;

/**
 * @author lbb ����������кͼ�������㷨����ȷ��
 */
public class DataSortTemplate {
	// ������ɵ�����
	public int[] generateRandomArray(int Size, int maxValue) {

		int[] arr = new int[Size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) ((maxValue) * Math.random());
		}
		return arr;

	}

	// ����һ������
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
	
	//��ӡ����
	
	public void printArray(int[] arr){
		for(int i:arr){
			System.out.print(i+"\t");
		}
		System.out.println("***********************************");
		
	}
	
//	����Array���Դ��������㷨
	
	public void comparator(int[] arr){
		Arrays.sort(arr);
	}
	
//	�ж����������Ƿ����
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
