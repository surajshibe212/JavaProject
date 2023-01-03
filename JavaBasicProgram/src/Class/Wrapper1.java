package Class;

public class Wrapper1 {

	public static void main(String[] args) {
		int age=20;
		System.out.println("Age:"+age);
        Integer obj=new Integer(age);  //explicit boxing
        System.out.println("Obj age:"+obj);
        Integer obj1=27;               //implicit /auto boxing
        System.out.println("Obj2 age:"+obj1);
        System.out.println(age==obj);
        
        char c1='z';
        Character obj22=c1;
        System.out.println(c1);
        System.out.println(obj22);
        System.out.println(c1==obj22);
        Character c=new Character('m');
        System.out.println(c);
	}

}
