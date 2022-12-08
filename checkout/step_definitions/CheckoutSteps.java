package step_definitions;

import cucumber.api.java.en.*;
import implementation.Checkout;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckoutSteps {
	Map<String, Integer> prices = new HashMap<String, Integer>();
	Checkout checkout = new Checkout();;
	@Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
	public void thePriceOfIsC(String name, int price) throws Throwable {
		prices.put(name,price);
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckoutBanana(int itemCount, String itemName ) throws Throwable {
		checkout.add(itemCount,prices.get(itemName));
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int total) throws Throwable {
	    assertEquals(total, checkout.total());
	}
}
