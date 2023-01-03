package assignment;

public class Ascii {
	public void asc(char b1) {
		int ai=b1;
		System.out.println("Ascii valu of Char using method:"+ai);
	}

	public static void main(String[] args) {
		char a1='B';
		int toAsc=a1;
		Ascii q=new Ascii();
		System.out.println("Ascii valu of Character:"+toAsc);
        q.asc('a');
        q.asc('z');
	}

}
