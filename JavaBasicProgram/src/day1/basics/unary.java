package day1.basics;

public class unary {

	public static void main(String[] args) {
		
		
		int a=0,b;
		b=a++ + ++a + ++a +a;
		System.out.println(a);
		System.out.println(b);

		a=0;
		b=a-- + --a + --a + a;
		System.out.println(a);
		System.out.println(b);
		
		a=0;
		b=--a + --a + --a + a + ++a + a++;
		System.out.println(a);
		System.out.println(b);
		
		a=0;
		b=a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println(a);
		System.out.println(b);
	}

}
