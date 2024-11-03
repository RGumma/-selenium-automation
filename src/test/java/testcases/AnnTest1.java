package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnTest1 {

	@BeforeMethod()

	public void Login() {

		System.out.println("Login to the application");

	}

	@Test(priority =1)

	public void search() {

		System.out.println("serching");

	}

	@Test(priority=2)

	public void AdvanceSearch() {

		System.out.println("Avance Search");
	}

	@AfterMethod

	public void Logout() {

		System.out.println("My Logout test");

	}

}
