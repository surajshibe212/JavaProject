package ArrayAssignment;

public class Duplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,1,5,6};
		System.out.println("Array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
   System.out.println();
   System.out.println("Duplicate Array:");
   for(int i=0;i<arr.length;i++) {
	   for(int j=i+1;j<arr.length;j++) {
		   if(arr[i]==arr[j]) {
			   System.out.println(arr[j]);
		   }
	   }
   }
	}

}
