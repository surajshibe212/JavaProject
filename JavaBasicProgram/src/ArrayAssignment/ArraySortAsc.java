package ArrayAssignment;

//import java.util.Arrays;

public class ArraySortAsc {

	public static void main(String[] args) {
		int []arr= {10,23,1,3,9,33};
		System.out.println("Original Array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
       //by using arrays
		/*
		Arrays.sort(arr);
		System.out.println();
		System.out.println("Array after sort:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		*/
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Ascending order:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
