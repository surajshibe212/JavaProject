package assignment;

public class SwitchOp {
	static void cal(int a,int b,char op) {
		int res;
		switch(op) {
		case '+':
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;
		case '-':
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;
		case '*':
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
		case '/':
			res=a/b;
			System.out.println(a+"/"+b+"="+res);
			break;
		default :
			System.out.println("Invalid operator");
		}
	}

	public static void main(String[] args) {
     SwitchOp.cal(15, 10, '+');
     SwitchOp.cal(15, 10, '%');
     SwitchOp.cal(15, 30, '*');

	}

}
