package ArrayPrograms;

public class Array7 {
 public static void main(String args[]) {
	   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
	   double avg;
	   int sum=0;
	   System.out.println("Array:");
	   for (int i:numbers) {
		   System.out.print(i+" ");
	   }
int len=numbers.length;
System.out.println("\nArray length:"+len);
for (int i:numbers) {
	   sum=sum+i;
}
System.out.println("Sum of array:"+sum);
avg=((double)sum/(double)len);
System.out.println("Average of array:"+avg);
 }

}
