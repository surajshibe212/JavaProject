package Regular;

class Stud{
	int roll;
	float fee;
	Stud(int roll){
		this.roll=roll;
	}
	Stud(int roll,float fee){
		this(roll);
		this.fee=fee;
	}
	void dis() {
		System.out.println(roll+" "+fee);
	}
}


public class This2 {

	public static void main(String[] args) {
Stud s=new Stud(110);
System.out.println(s.roll+" "+s.fee);
Stud s1=new Stud(250,25f);
System.out.println(s1.roll+" "+s1.fee);
s.dis();
s1.dis();
	}

}
