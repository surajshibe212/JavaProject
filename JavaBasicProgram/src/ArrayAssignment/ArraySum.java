package ArrayAssignment;

public class ArraySum {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int sum=0;
		System.out.println("Array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum=sum+arr[i];
		}
		System.out.println();
		System.out.println("Sum of elements in array is:"+sum);

	}

}
