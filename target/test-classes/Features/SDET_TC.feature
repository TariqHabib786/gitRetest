Feature: SDET Test Cases

 Background: 
    Given User is on TekSchool page
    And User Click on Test Environment link
    And User should see Test Environment page
    
     @SDET_005
  Scenario: SDET_005_Execution
    When User click on the Tablets
    And User click on image of product the product detailed list should appear and on the right side of the page
    And User should click on Samsung Galaxy Tab product
    And User should be able to see the blue button with label Add to Cart
    Then User should be able to see a scuccess message that products are added to the cart
    
    
    
         @SDET_006
  Scenario: SDET_006_Execution
    When User click on the Cameras
    And User should be able to add product in the  Add to Cart
    And User is able to remove product from the  Add to Cart
    And  User fill register form with below information
    |Cameras|SelectQauntity|2|
    Then User click on Shopping Cart menu on top of the page, the list of items added should be displayed and there should be a Red X button for each item
    
    
    
    
    