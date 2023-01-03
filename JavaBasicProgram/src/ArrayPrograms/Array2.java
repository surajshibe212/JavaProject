package ArrayPrograms;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
    int []var=new int[4];
    var [0]=78;
    var[1]=23;
    var[2]=(int)43.23;
    var[3]=99;
    for (int var1:var) {
    	System.out.println(var1);
    }
    System.out.println();
    //using simple for loop
   /* for(int i=0;i<var.length;i++)
    {
    	System.out.println(var[i]);
    }
*/
    int[] nvar= {10,12,45};
    for(int i=0;i<nvar.length;i++) {
    System.out.println(nvar[i]);
    }
    
    int var3[]=Arrays.copyOf(nvar, 6);
    System.out.println("Length of new array:"+var3.length);
    System.out.println("New Array:");
    for(int i=0;i<var3.length;i++) {
    	
    	System.out.println(var3[i]);
    }
    System.out.println("Updated of arrays valus");
    var3[3]=3;
    var3[5]=45;
 for(int i=0;i<var3.length;i++) {
    	
    	System.out.println(var3[i]);
    }
   
	}

}
