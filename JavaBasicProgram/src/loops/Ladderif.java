package loops;

public class Ladderif {

	public static void main(String[] args) {
		int mark=33;
		if(mark<=35) {
			System.out.println("fail");
		}else if(mark>=36 && mark<=50) {
			System.out.println("D grade");
		}else if(mark>50&& mark<=75) {
			System.out.println("C grade");
		}else if (mark >75&&mark<=90) {
			System.out.println("B grade");
		}else if (mark >90&&mark<=100) {
			System.out.println("A grade");
		}else {
			System.out.println("Invalid");
		}

	}

}
