package ArrayAssignment;

public class LeftRotate {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=3;
		System.out.println("Before rotating Array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
        for(int i=0;i<n;i++) {
        	int j,first;
        	first=arr[0];
        	for(j=0;j<arr.length-1;j++) {
        		arr[j]=arr[j+1];
        		
        	}
        	arr[j]=first;
        	
        }
        System.out.println();
        System.out.println("After ratating array:");
        for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	

}
