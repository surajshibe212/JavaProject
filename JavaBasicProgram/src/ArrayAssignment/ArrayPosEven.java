package ArrayAssignment;

public class ArrayPosEven {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		System.out.println("Array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
       System.out.println();
       System.out.println("Array elements at Even Position:");
       for(int i=1;i<arr.length;i=i+2) {
    	   System.out.print(arr[i]+" ");
       }
	}

}
