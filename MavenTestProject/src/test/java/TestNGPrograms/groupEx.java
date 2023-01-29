package TestNGPrograms;

import org.testng.annotations.Test;

public class groupEx {

	@Test(groups="Functional")
	public void login() {
		System.out.println("Login test");
	}
	@Test(groups="Functional")
	public void login1() {
		System.out.println("Login test1...");
	}
	
	@Test(groups="Non Functional")
	public void logout() {
		System.out.println("Logout test");
	}
	
}
