package Regular;

public class ThisPr {
	int num;
	float fee;
	ThisPr(int num,float fee){
		System.out.println("Local var :"+num);
		System.out.println("Local var2 :"+fee);
		System.out.println("Global var :"+this.num);
		System.out.println("Global var2 :"+this.fee);
		this.num=num;
		this.fee=fee;
		System.out.println("Local var :"+num);
		System.out.println("Local var2 :"+fee);
		System.out.println("Global var :"+this.num);
		System.out.println("Global var2 :"+this.fee);
		
	}
	void dis() {
		System.out.println(num +" "+fee);
		System.out.println("oi:"+this);
	}
}
class ABC{
	public static void main(String[] args) {
		ThisPr p1=new ThisPr(100,102f);
		p1.dis();
		//ThisPr p2=new ThisPr(120,152f);
		//p2.dis();
System.out.println("id:"+p1);
	}

}
