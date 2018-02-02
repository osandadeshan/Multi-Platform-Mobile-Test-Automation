Create Account Specification
============================
Date Created    : 09/23/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: create_account



Verify that the Create Account page contains expected elements
--------------------------------------------------------------
tags: create_account

* On Create Account Page
* Verify that the Create Account Page contains expected elements



Verify that a user can create an account with valid information
---------------------------------------------------------------
tags: create_account

* On Create Account Page
* Verify that the Create Account Page title is "Create Account"
* Create an account with following information
    |First Name|Last Name   |Email                  |Username       |Password   |Re-enter Password  |is Privacy Policy Confirmed |
    |----------|------------|-----------------------|---------------|-----------|-------------------|----------------------------|
    |Osanda    |Nimalarathna|osanda@gmail.com       |osandaw        |Qwerty12   |Qwerty12           |true                        |
* Click Create Account button
* Verify that the Account creation is completed successfully



Verify that the user will navigate back to Login page after successfully creating the new account
-------------------------------------------------------------------------------------------------
* Verify that the Login page title is "Login"



Verify that a user can create an account by filling the text fields with special characters
-------------------------------------------------------------------------------------------
tags: create_account

* On Create Account Page
* Verify that the Create Account Page title is "Create Account"
* Create an account with following information
    |First Name|Last Name   |Email                  |Username       |Password   |Re-enter Password  |is Privacy Policy Confirmed |
    |----------|------------|-----------------------|---------------|-----------|-------------------|----------------------------|
    |Osand@    |Nim#lar@thna|osanda@gmail.com       |os@ndaw        |Qwerty@12  |Qwerty@12          |true                        |
* Click Create Account button
* Verify that the Account creation is completed successfully



Verify that a user cannot create an account with an existing username
---------------------------------------------------------------------
tags: create_account

* On Create Account Page
* Verify that the Create Account Page title is "Create Account"
* Create an account with following information
    |First Name|Last Name   |Email                  |Username       |Password   |Re-enter Password  |is Privacy Policy Confirmed |
    |----------|------------|-----------------------|---------------|-----------|-------------------|----------------------------|
    |Osanda    |Nimalarathna|osanda@gmail.com       |osanda         |Qwerty12   |Qwerty12           |true                        |
* Click Create Account button
* Verify that the Account creation is failed



Clear First Name, Last Name, Email, Username, Password and Re-enter Password textbox contents
---------------------------------------------------------------------------------------------
* Clear text fields in Create Account page



Verify that a user cannot create an account with an invalid email
-----------------------------------------------------------------
tags: create_account

* On Create Account Page
* Verify that the Create Account Page title is "Create Account"
* Create an account with following information
    |First Name|Last Name   |Email                  |Username       |Password   |Re-enter Password  |is Privacy Policy Confirmed |
    |----------|------------|-----------------------|---------------|-----------|-------------------|----------------------------|
    |Osanda    |Nimalarathna|osanda_gmail.com       |osanda         |Qwerty12   |Qwerty12           |true                        |
* Click Create Account button
* Verify that the Account creation is failed
* Clear text fields in Create Account page



Verify that a user cannot create an account without filling any fields
----------------------------------------------------------------------
tags: create_account

* On Create Account Page
* Verify that the Create Account Page title is "Create Account"
* Create an account with following information
    |First Name|Last Name   |Email                  |Username       |Password   |Re-enter Password  |is Privacy Policy Confirmed |
    |----------|------------|-----------------------|---------------|-----------|-------------------|----------------------------|
    |          |            |                       |               |           |                   |                            |
* Click Create Account button
* Verify that the Account creation is failed



Verify that a user can navigate back to Login page
--------------------------------------------------
tags: create_account

* Navigate back from Create Account page
* Verify that the Login page title is "Login"