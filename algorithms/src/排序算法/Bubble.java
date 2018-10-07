package ≈≈–ÚÀ„∑®;

 
/**
 * @author lbb
 *  √∞≈›≈≈–Ú
 */
public class Bubble {
	public void bubbleSort(int[] arr){
		if(arr==null||arr.length<2){
			return;
			
		}
		for(int e=arr.length-1;e>0;e--){
			for(int i=0;i<e;i++){
				if(arr[i+1]>arr[i]){
					swap(arr,i,i+1);
				}	
			}	
		}
	}

	private void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	

	

}
