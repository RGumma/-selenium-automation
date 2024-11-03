package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependon {
	
@Test	
public void openapp() {

	Assert.assertTrue(true);
	
}
	
@Test(dependsOnMethods= {"openapp"})
public void login() {
	
	Assert.assertTrue(true);
	
}
	
@Test(dependsOnMethods= {"login"})
public void search() {
	
	
	Assert.assertTrue(false);
}


@Test(dependsOnMethods= {"login","search"})
public void AdvSearch() {

	Assert.assertTrue(true);
	
}


}
