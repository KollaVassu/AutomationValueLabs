Feature: ValueLab Assignment

Scenario: Validate user enter already existing email address then error message should be displayed
Given navigate to the Url 'https://orikan-ui-automation-test.azurewebsites.net/'
And User enters "adam@orikan.com" and "Test@123"
Then Click on Next Button and Capture The Error Messege as 'Email address is already registered' and Verify


Scenario: Validate user is able to &quot;Fill the valid data in the Registration,Contact,Payment,Terms &amp; Conditions pages and click on Submit button&quot; then &quot;Success message&quot; is displayed.
Given navigate to the Url 'https://orikan-ui-automation-test.azurewebsites.net/'
And User enters "Vasu@orikan.com" and "Test@123"
Then Click on Next Button
Then Enter the Below Details
| firstName     | lastName     | addressLine1     | addressLine2     |postcode |city      |state  |
| Kolla 				| Vasu 				 |Bangalore					|Marthahalli			 |560037   |Bangalore |Karnataka|
Then Click on Next Button
Then Enter Card Details Below
|cardHolderName|cardNumber   |cardCVV|cardExpiryMonth|cardExpiryYear|
|Vasu          |10299390393  |897		 |November			 |2025					|
Then Click on Next Button
Then Scroll and Click on Agree Tearms and Conditions

