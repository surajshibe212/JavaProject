package ArrayAssignment;

public class ArrayPrint {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,0,9};
		//by using for loop
		System.out.println("Array elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
      System.out.println();
      System.out.println("Array elements are using for each loop:");
      //by using for each loop
      for(int i:arr) {
    	  System.out.print(i+" ");
      }
	}

}
