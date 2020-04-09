package practicepackage;

import org.testng.annotations.Test;

public class GroupTestCase {

	@Test(groups = { "cars" })
	public void printPeugeot() {
		System.out.println("Peugeot");
	}

	@Test(groups = { "cars" })
	public void printFiat() {
		System.out.println("Fiats");
	}

	@Test(groups = { "animals" })
	public void printCats() {
		System.out.println("cats");
	}

	@Test(groups = { "animals" })
	public void printDogs() {
		System.out.println("dogs");
	}
}
