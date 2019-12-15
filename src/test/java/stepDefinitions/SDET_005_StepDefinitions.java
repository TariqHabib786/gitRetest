package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Utility;

public class SDET_005_StepDefinitions extends Base {
	
	@When("^User click on the Tablets$")
	public void user_click_on_the_Tablets() throws Throwable {
		Utility.screenshot(driver);
		SDET_005_StepDefinitions.clickOntheTablets();
	  
	}


	private static void clickOntheTablets() {
		
	}


	@When("^User click on image of product the product detailed list should appear and on the right side of the page$")
	public void user_click_on_image_of_product_the_product_detailed_list_should_appear_and_on_the_right_side_of_the_page() throws Throwable {
		Utility.screenshot(driver);
		SDET_005_StepDefinitions.clickOnimage();
	}
	
	private static void clickOnimage() {
		
		
	}

	@When("^User should click on Samsung Galaxy Tab product$")
	public void user_should_click_on_Samsung_Galaxy_Tab_product() throws Throwable {
		Utility.screenshot(driver);
		SDET_005_StepDefinitions.clickOnSamsungGalaxyTab();
	   
	}

	private static void clickOnSamsungGalaxyTab() {
		
	}

	@When("^User should be able to see the blue button with label Add to Cart$")
	public void user_should_be_able_to_see_the_blue_button_with_label_Add_to_Cart() throws Throwable {
		Utility.screenshot(driver);
		SDET_005_StepDefinitions.clickOnbluebuttonwithlabelAddToCart();
	}

	private static void clickOnbluebuttonwithlabelAddToCart() {
		
		
	}

	@Then("^User should be able to see a scuccess message that products are added to the cart$")
	public void user_should_be_able_to_a_scuccess_message_that_products_are_added_to_the_cart() throws Throwable {
		
		
	}
	
// @SDET_006================================================================================================================
	
	
	@When("^User click on the Cameras$")
	public void user_click_on_the_Cameras() throws Throwable {
	 
	}

	@When("^User should be able to add product in the  Add to Cart$")
	public void user_should_be_able_to_add_product_in_the_Add_to_Cart() throws Throwable {
	   
	}

	@When("^User is able to remove product from the  Add to Cart$")
	public void user_is_able_to_remove_product_from_the_Add_to_Cart() throws Throwable {
	    
	}

	@Then("^User click on Shopping Cart menu on top of the page, the list of items added should be displayed and there should be a Red X button for each item$")
	public void user_click_on_Shopping_Cart_menu_on_top_of_the_page_the_list_of_items_added_should_be_displayed_and_there_should_be_a_Red_X_button_for_each_item() throws Throwable {
	  
	}
	
}
