package ArrayAssignment;

public class ArraySmallestEle {

	public static void main(String[] args) {
		int arr[]= {10,22,32,3,17,2,98};
		System.out.println("Original Array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
       System.out.println();
       int min=arr[0];
       for(int i=1;i<arr.length;i++) {
    	   if(arr[i]<min) {
    		   min=arr[i];
    	   }
       }
       System.out.println("Smallest Element in array is:"+min);
	}

}
