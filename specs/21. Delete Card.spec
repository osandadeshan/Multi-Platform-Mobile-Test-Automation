Delete Card Specification
=========================
Date Created    : 11/27/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: delete_card



Verify that a user can manually create a card with text by providing a question and answer
------------------------------------------------------------------------------------------
* Navigate to "MaxSoft" My Deck Card list page
* Tap on Add Card button
* Navigate to Create Confidence Card page
* Enter a question as follows "What is Gauge Framework?"
* Navigate to Back tab
* Verify that the Back tab is selected
* Verify that the Answer text box is visible
* Enter an answer as follows "It is an Automation Framework"
* Save the card
* Verify that the Card title is "What is Gauge Framework?"



Verify that the Card Delete Alert Box is visible when deleting a card
---------------------------------------------------------------------
* Tap on Card Options button
* Tap on Card Delete Option
* Verify Alert Box title is "Delete Card"
* Verify Alert Box Message is "Are you sure you want to permanently delete this card?"
* Tap on Cancel button in Delete Card Alert Box



Verify that card delete can be cancelled
----------------------------------------
* Tap on Card Options button
* Tap on Card Delete Option
* Tap on Cancel button in Delete Card Alert Box
* Verify that the Card title is "What is Gauge Framework?"



Verify that a card can be deleted
---------------------------------
* Tap on Card Options button
* Tap on Card Delete Option
* Tap on OK button in Delete Card Alert Box
* Verify that the Card title "What is Gauge Framework?" is not visible

