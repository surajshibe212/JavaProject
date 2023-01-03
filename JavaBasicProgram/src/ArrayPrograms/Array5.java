package ArrayPrograms;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		int[] array= {5,3,9,99,20,1,10};
		for(int i:array) {
			System.out.println(i);
		}
      Arrays.sort(array);
      System.out.println("Array after sorting:");
      for(int i:array) {
    	  System.out.println(i);
      }
      System.out.println("Copy range array:");
      int[] num=Arrays.copyOfRange(array, 0, 9);
      for(int i:num) {
    	  System.out.println(i);
      }
	}

}
