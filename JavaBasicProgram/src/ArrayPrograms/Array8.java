package ArrayPrograms;
class Demo1{
	static void min(int arr[]) {
		int min=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}
	System.out.println("Min value:"+min);
	}
}
public class Array8 {

	public static void main(String[] args) {
		int a[]= {1,56,5,8,9,6,54,0,3};
		Demo1.min(a);;

	}

}
