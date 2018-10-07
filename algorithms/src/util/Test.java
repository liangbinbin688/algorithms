package util;

import javax.xml.crypto.Data;

/**
 * @author lbb
 *  ¶ÔÊýÆ÷
 */
public class Test {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataSortTemplate data=new DataSortTemplate();
		int[] arr=data.generateRandomArray(100, 100);
		
		for(int i:arr){
			System.out.print(i+"\t");
			
		}
		System.out.println(arr.hashCode());
	}

}
