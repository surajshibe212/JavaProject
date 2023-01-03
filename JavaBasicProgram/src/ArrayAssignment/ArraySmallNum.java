package ArrayAssignment;

public class ArraySmallNum {

	public static void main(String[] args) {
		int[] arr= {11,12,1,9,4};
		System.out.println("Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
      System.out.println();
      int min=arr[0];
      for(int i=1;i<arr.length;i++) {
    	  if(arr[i]<min) {
    		  min=arr[i];
    	  }
      }
      System.out.println("Smallest Number in array is:"+min);
	}

}
