package ArrayPrograms;

public class Array9 {
public static void min(int arr[]) {
	int min=arr[0];
	System.out.println("Array is:");
	for(int i=1;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.println("\nMin value in array:"+min);
}
	public static void main(String[] args) {
		int a[]=new int[] {23,10,3,11,1,3,0,8};
		Array9.min(a);

	}

}
