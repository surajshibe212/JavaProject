package ArrayPrograms;

public class Array4 {

	public static void main(String[] args) {
		int[] age= {1,5,9,17,0};
		System.out.println("First Element:"+age[0]);
		System.out.println("Second Element:"+age[1]);
		System.out.println("Third Element:"+age[2]);
		System.out.println("Fourth Element:"+age[3]);
		System.out.println("Fifth Element:"+age[4]);
		System.out.println("Lenghth of array:"+age.length);
		
		for (int i=0;i<age.length;i++) {
			if(age[i]==17) {
				System.out.println("Age is "+age[i]);
				break;
			}else {
				System.out.println("Age is not 17");
			}
		}
	}

}
