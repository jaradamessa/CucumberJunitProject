package stepDefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import app.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefs {
	Calculator calc;
	int result;

	@Given("I have the calculator")
	public void i_have_the_calculator() {
		calc = new Calculator();
	}

	@When("I add {int} and {int}")
	public void i_add_and(int num1, int num2) {
		result = calc.Add(num1, num2);
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expResult) {
		Assert.assertEquals(expResult, result);
	}

	@When("I sub {int} and {int}")
	public void i_sub(int num1, int num2) {
		result = calc.Sub(num1, num2);
	}

	@When("I add multiple numbers")
	public void i_add_multiple_numbers(List<Integer> list) {
		for (int num : list) {

			System.out.println(result = calc.Add(num, result));
		}

	}

	@When("I buy items with given price")
	public void i_buy_items_with_given_price(Map<String, Integer> items) {
		for (int value : items.values()) {

			System.out.println(result = calc.Add(value, result));
		}
	}

	@Then("I should get result as {int}")
	public void i_should_get_result_as(Integer int1) {

	}

	@When("I buy items with given price and quantitiy")
	public void i_buy_items_with_given_price_and_quantitiy(io.cucumber.datatable.DataTable dataTable) {
		int rows = dataTable.height();

		for (int i = 0; i < rows; i++) {

			int qnt = Integer.parseInt(dataTable.cell(i, 1));
			int price = Integer.parseInt(dataTable.cell(i, 2));

			System.out.println(result = calc.Add(qnt * price, result));

		}
	}

}