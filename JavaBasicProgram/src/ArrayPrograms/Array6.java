package ArrayPrograms;

class Demo{
	//create method that retuns array
	static int[] getArray() {
		int num[]=new int[3];
		num[0]=1;
		num[1]=29;
		num[2]=4;
		return num;
	}
	static int[] getA() {
		return new int[] {88,0,1,58,0,2};
	}
	
}
public class Array6 {

	public static void main(String[] args) {
		int a[]=Demo.getArray();
        for(int i:a) {
        	System.out.println(i);
        }
        int c[]=Demo.getA();
        for (int i:c) {
        	System.out.println(i);
        }
	}

}
