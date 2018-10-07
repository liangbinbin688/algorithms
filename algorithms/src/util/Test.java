package util;

import javax.xml.crypto.Data;

/**
 * @author lbb
 *  对数器
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataSortTemplate data=new DataSortTemplate();
		int[] arr=data.generateRandomArray(100, 100);
		
		//int min=minNum(arr);
		//System.out.println("最小值为："+min);
		shift(arr);
		data.printArray(arr);
		
		
	}
	//求最小值
	public static int minNum(int[] arr){
		
		int minNum=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<minNum){
				minNum=arr[i];
			}
		}
		return minNum;
	}
	
	
	public static void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	//大的交换到后面
	public static void shift(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i]>arr[i+1]){
				swap(arr,i,i+1);
			}	
		}
	}
	
	
	

}
