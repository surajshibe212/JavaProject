package ArrayAssignment;

public class ArrayPosOdd {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println("Original Array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
        System.out.println();
        System.out.println("Array Elements at Odd Position:");
        for(int i=0;i<arr.length;i++) {
        	if(i%2==0) {
        		System.out.print(arr[i]+" ");
        	}
        }
        //or another way
        System.out.println();
        System.out.println("Odd Position Elements");
        for (int i=0;i<arr.length;i=i+2) {
        	System.out.print(arr[i]+" ");
        }
	}

}
