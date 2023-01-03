package ArrayAssignment;

public class ArraySecondLarge {
	public static int getSec(int[] a,int total) {
		 System.out.println("Original Array: ");
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		 }
		 int temp;for(int i=0;i<total;i++) {
			 for(int j=i+1;j<total;j++) {
				 if(a[i]>a[j]) {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 return a[total-2];
	 }
		public static void main(String[] args) {
			int a[]= {44,10,12,5,98,2,76};
			System.out.println("\nSecond Largest number: "+getSec(a,7));

		}
}
