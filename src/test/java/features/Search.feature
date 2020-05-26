Feature: Search and place order for vegetables

@SmokeTest
  Scenario Outline: Search for items and validate results
    Given User is GreenKart langing page
    When User searches for <Name>
    Then <Name> results are displayed
    
     Examples: 
      | Name   |
      | Carrot |
      | Beans  |
      | Potato |
    
@RegressionTest
  Scenario: Search for items and then move to checkout page
    Given User is GreenKart langing page
    When User searches for "Brinjal"
		And Add items to cart
		And User proceeds to checkout page for purchase
		Then Verify selected "Brinjal" item displays in check out page
