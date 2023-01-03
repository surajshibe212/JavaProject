package ArrayAssignment;

public class ArraySeconSm {
	public static int getSmall(int []a,int total) {
		int temp;
		System.out.println("Array Is:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		int a[]= {1,3,5,6,2,10};
		System.out.println("\nSecond Small Number in array:"+getSmall(a,6));

	}

}
