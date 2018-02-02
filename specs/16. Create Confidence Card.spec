Create Confidence Card Specification
====================================
Date Created    : 09/16/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: create_confidence_card



Verify that the Front tab is selected as default
------------------------------------------------
* Navigate to "MaxSoft" My Deck Card list page
* Tap on Add Card button
* Navigate to Create Confidence Card page
* Verify that the page title is "Create Card"
* Verify that the Front tab is selected as default
* Verify that the Question text box is visible



Verify that a user can manually create a card with text by providing a question and answer
------------------------------------------------------------------------------------------
* Enter a question as follows "test question6"
* Navigate to Back tab
* Verify that the Back tab is selected
* Verify that the Answer text box is visible
* Enter an answer as follows "test answer6"
* Save the card
* Verify that the Card title is "test question6"



Verify that a user cannot manually create a card with text without providing the question and the answer
--------------------------------------------------------------------------------------------------------
* Tap on Add Card button
* Navigate to Create Confidence Card page
* Save the card
* Verify that the card was not saved successfully



Verify that a user can navigate back from Create Card Page
----------------------------------------------------------
* Navigate back from Create Confidence Card Page
* Verify that the My Deck title is "MaxSoft"



Verify that a user cannot manually create a card with text by providing only the question
-----------------------------------------------------------------------------------------
* Tap on Add Card button
* Navigate to Create Confidence Card page
* Enter a question as follows "test question3"
* Save the card
* Verify that the card was not saved successfully
* Navigate back from Create Confidence Card Page
* Verify that the My Deck title is "MaxSoft"



Verify that a user cannot manually create a card with text by providing only the answer
---------------------------------------------------------------------------------------
* Tap on Add Card button
* Navigate to Create Confidence Card page
* Navigate to Back tab
* Enter an answer as follows "test answer4"
* Save the card
* Verify that the card was not saved successfully