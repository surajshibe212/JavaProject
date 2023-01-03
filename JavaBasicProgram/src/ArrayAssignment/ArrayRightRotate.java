package ArrayAssignment;

public class ArrayRightRotate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=3;
		int j,last;
		System.out.println("Original Array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
        //System.out.println();
        for(int i=0;i<n;i++) {
        	last=arr[arr.length-1];
        	for(j=arr.length-1;j>0;j--) {
        		arr[j]=arr[j-1];
        	}
        	arr[0]=last;
        }
        System.out.println();
        System.out.println("After Right Rotate:");
        for(int i:arr) {
        	System.out.print(i+" ");
        }
	}

}
