package StringAssignment;

public class StringRevPerSpace {
	
	public static void reverse(String input) {
		char[] inputA=input.toCharArray();
		char[] result=new char[inputA.length];
		for(int i=0;i<inputA.length;i++) {
			if(inputA[i]==' ') {
				result[i]=' ';
			}
		}
		int j=result.length-1;
		for(int i=0;i<inputA.length;i++) {
			if(inputA[i]!=' ') {
				if(result[j]==' ') {
					j--;
				}
				result[j]=inputA[i];
				j--;
			}
			
		}
		System.out.println(input+"----> "+String.valueOf(result));
	}

	public static void main(String[] args) {
		StringRevPerSpace.reverse("india is my country");

	}

}
