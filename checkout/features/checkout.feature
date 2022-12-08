Feature: Checkout
	Scenario: Checkout a banana
		Given the price of "banana" is 40c
		When I checkout 1 ·banana"
		Then the total price should be 40c
