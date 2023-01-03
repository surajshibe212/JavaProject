package ArrayAssignment;

public class ArrayNumberEle {

	public static void main(String[] args) {
		int []arr= {10,20,30,3,8,9,0,1};
		System.out.println("Array is:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		int size =arr.length;
		System.out.println();
		System.out.println("Number of Elements in array is: "+size);

	}

}
