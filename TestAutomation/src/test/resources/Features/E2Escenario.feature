Feature: Fill out support form
Description: This feature is to enable the users to fill out the support form and request for the assisstance from Support team.

Scenario: Customer successfully navigates to ContactUs page.
  Given user is on google search page
  When he searches for SecurePay
  And selects the result with link "www.securepay.com.au" from search results page
  And clicks on the Support tab
  And selects the Contact Us box from support page
  Then Contact Us page is loaded successfully.

Scenario: E2E scenario Customer navigates to SecurePay website from google search and fills out the support form.
  Given user is on google search page
  When he searches for SecurePay
  And selects the result with link "www.securepay.com.au" from search results page
  And clicks on the Support tab
  And selects the Contact Us box from support page
  And fills out the support form with request details
  Then support form is ready for submission
  
 