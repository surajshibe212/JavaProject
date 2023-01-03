package assignment;

public class Vovel {
	public static void vlco(char ch) {
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println(ch+" is Vovel");
		}else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println(ch+" is Consonant");
		}else {
			System.out.println("not an alphabet");
		}
	}

	public static void main(String[] args) {
		Vovel.vlco('a');
		Vovel.vlco('E');
		Vovel.vlco('D');
		Vovel.vlco('f');
		Vovel.vlco('3');
	}

}
