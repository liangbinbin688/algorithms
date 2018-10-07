package ≈≈–ÚÀ„∑®;

/**
 * @author lbb
 * ≤Â»Î≈≈–Ú
 * 
 */
public class InsertionSort {
	
	public void insertionSort(int [] arr)
	{
		if(arr==null||arr.length<2){
			return;
			
		}
		for(int i=1;i<arr.length;i++){
			for(int j=i-1;j>=0;j--){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}	
			}
		}
	}
	
	private void swap(int[] arr, int j, int i) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;	
	}
}
