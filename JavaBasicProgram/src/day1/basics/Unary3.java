package day1.basics;

public class Unary3 {
	
		public static void main(String[] args) {
			int a = 0, b;
			b = a++ + ++a + ++a + a;//0+2+3+3
		 
			System.out.println("a: "+a);//3 
			System.out.println("b: "+b);// 8
			System.out.println("**********************");
			a = -5;
			b = a-- + --a + --a + a;//
		 
			System.out.println("a: "+a);//  -8
			System.out.println("b: "+b);//  -28

			a = 21;
			b = --a + --a + --a + a + ++a + a++;

			System.out.println(a);// 20
			System.out.println(b);// 

			a = -2;
			b = a-- + a + ++a + a++ + ++a + a++ + a;
			System.out.println(a);//
			System.out.println(b);//

	}
	

}
