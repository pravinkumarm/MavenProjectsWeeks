Feature: Leaftaps CreateLead

Scenario: Positive Flow For Createlead
Given Open the Browser
And max Browser
And Set the Timeouts
And Load the URL
And Enter the Username 
And Enter the Password
And Click the Login Button
And Click CRM/SFA
And Click Create Lead
And Enter Companyname
And Enter Firstname
And Enter Lastname
When Click on CreateLeadButton
Then Verify Created Successfully 