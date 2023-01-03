package StringAssignment;

public class StringReverseWord {
public static String revW(String str) {
	String word[]=str.split("\\s");
	String rev="";
	for(String w:word) {
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
		rev+=sb.toString()+" ";
	}
	return rev.trim();
}
	public static void main(String[] args) {
		System.out.println(StringReverseWord.revW("my name is suraj"));

	}

}
