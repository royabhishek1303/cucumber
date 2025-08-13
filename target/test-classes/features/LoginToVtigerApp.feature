#Author: Abhishek
 
Feature: Login to App
   
   
   Scenario: Login to Vtiger application
   Given Launch a browser
   And Navigate to URL
   When enter valid username
   And enter valid password
   And click to login button
   Then Verify whether home page is displayed