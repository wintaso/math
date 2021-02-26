package Test;

import org.testng.annotations.Test;

public class DemoTwo {
	@Test(priority=1)
	void open() {
		System.out.println("open the browser");
}
	@Test(priority=3)
	void searchCustomer() {
		System.out.println("This is search customer");
	}
	@Test(priority=2)
	void addCustomer() {
		System.out.println("This is add customer");
}
	@Test(priority=4)
	void teardown() {
		System.out.println("closing browser");
	}
}