package assignment;

public class Leap {
	public static void lepy(int year) {
		if (((year %4==0)&&(year%100 !=0))||year%400==0) {
			System.out.println(year+" is Leap Year");
		}
		else {
		System.out.println(year+" is not Leap Year");	
		}
	}

	public static void main(String[] args) {
		Leap.lepy(2024);
		Leap.lepy(2014);
		Leap.lepy(1996);
		Leap.lepy(2019);
	}

}
