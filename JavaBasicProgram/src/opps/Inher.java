package opps;
class Fruit{
	Fruit(){
		System.out.println("Friut class Conc");
	}
	public void taste() {
		System.out.println("Taste is sweet");
	}
}
class Apple extends Fruit{
	Apple(){
		//super(); java compiler will write default super()
		System.out.println("Apple class conc");
	}
	public void shape() {
		System.out.println("Apple is round");
	}
}
public class Inher {

	public static void main(String[] args) {
		Apple f=new Apple();//child class object
		f.taste();
		f.shape();
		
		
		

	}

}
