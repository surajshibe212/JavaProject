package ArrayAssignment;

public class ArrayLargeNum {
	public static void main(String[] args) {
		int []arr= {90,10,5,100,110,1};
		System.out.println("Array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
      int max=arr[0];
      for(int i=1;i<arr.length;i++) {
    	  if(arr[i]>max) {
    		  max=arr[i];
    	  }
      }
      System.out.println();
      System.out.println("Largest number in array is:"+max);
      
	}


}
