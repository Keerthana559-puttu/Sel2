Feature: PDPs-Carts

Scenario: Add the products to carts

Given when user opens AjioUrl1
When user search for product
And click on product from PLP
And click on Add To Bag button from PDP
Then product is successfully added to cart1