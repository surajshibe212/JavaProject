package ArrayPrograms;

public class Array3 {

	public static void main(String[] args) {
		//String[] cars;
		//cars=new String[4];  or
		String[] cars=new String[4];
		cars[0]="Innova";
		cars[1]="Mercedes";
		cars[2]="Audi";
		cars[3]="BMW";
		
		// or
			//	String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
	System.out.println("Array:\n");
	for(int i=0;i<cars.length;i++) {
		System.out.println(cars[i]);
	}
	System.out.println();
	System.out.println(cars[3]);
	cars[2]="Thar";
	cars[0]="Porche";
	System.out.println("Updated array:\n");
	for(int i=0;i<cars.length;i++) {
		System.out.println(cars[i]);
	}
	}

}
