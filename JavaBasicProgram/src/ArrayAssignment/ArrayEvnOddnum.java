package ArrayAssignment;

public class ArrayEvnOddnum {

	public static void main(String[] args) {
		int a[]= {10,21,11,9,4,5,6};
		System.out.println("Array:");
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("\nOdd Numbers in array :");
      for(int i=0;i<a.length;i++) {
    	  if(a[i]%2!=0) {
    		  System.out.print(a[i]+" ");
    	  }
      }
      System.out.println();
      System.out.println("\nEven Numbers in array:");
      for(int i=0;i<a.length;i++) {
    	  if(a[i]%2==0) {
    		  System.out.print(a[i]+" ");
    	  }
      }
	}

}
