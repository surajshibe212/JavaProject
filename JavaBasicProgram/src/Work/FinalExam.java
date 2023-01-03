package Work;

public class FinalExam {
	final int speed;
	FinalExam(){
	speed = 125;
	
		
	}

	public static void main(String[] args) {
		final int a=10;
	FinalExam f=new FinalExam();
	System.out.println("Speed:"+f.speed);
	System.out.println(a);
			
	}

}
