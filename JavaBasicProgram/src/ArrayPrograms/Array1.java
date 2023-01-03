package ArrayPrograms;

public class Array1 {

	public static void main(String[] args) {
		int[] array_var=new int[5];
		System.out.println("Array name:"+array_var);
		System.out.println("Total elements:"+array_var.length);
	    System.out.println("3 rd elements:"+array_var[2]);
	    //for array print
	    for (int i=0;i<array_var.length;i++) {
	    	System.out.println(i+" element is "+array_var[i]);
	    }
	    //using for each loop
	    for(int a:array_var) {
	    	System.out.println(a);
	    }

	}

}
