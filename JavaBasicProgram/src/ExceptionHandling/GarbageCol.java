package ExceptionHandling;

public class GarbageCol {

	public static void main(String[] args) {
		GarbageCol g=new GarbageCol();
		System.out.println("Object of GC:"+g);
		System.out.println("Address of GC:"+g.hashCode());
		g=null;
		System.gc();
		
	}
	protected void finalize() {
		System.out.println("hii finalizze ()");
	}

}
