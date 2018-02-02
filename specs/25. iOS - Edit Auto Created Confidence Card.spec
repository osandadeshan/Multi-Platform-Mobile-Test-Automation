Edit Auto Created Confidence Card Specification
===============================================
Date Created    : 12/29/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: edit_auto_created_confidence_card



Verify that a user can navigate to the Edit Card page of a card
---------------------------------------------------------------
* Navigate to "MaxSoft" My Deck Card list page
* Tap on card index = "1" Options button
* Tap on Card Edit Option
* Verify that the page title is "Edit Card"



Verify that the Front tab is selected as default
------------------------------------------------
* Verify that the Front tab is selected as default
* Verify that the Question text box is visible



Verify that a user can manually edit a card with text by providing a question and answer
----------------------------------------------------------------------------------------
* Edit the question as follows "test question6"
* Navigate to Back tab
* Verify that the Back tab is selected
* Verify that the Answer text box is visible
* Select the answer as follows
* Save the card
* Verify that the Card title is "test question6"



Verify that the last modified card should be in the top of the card list
------------------------------------------------------------------------
* Tap on card index = "1" Options button
* Tap on Card Edit Option
* Verify that the page title is "Edit Card"
* Verify that the question is "test question6"
* Navigate back from Edit Confidence Card Page
* Verify that the My Deck title is "MaxSoft"



Verify that a user cannot manually edit a card with text without providing the question and the answer
------------------------------------------------------------------------------------------------------
* Tap on card index = "1" Options button
* Tap on Card Edit Option
* Verify that the page title is "Edit Card"
* Clear the question text field
* Navigate to Back tab
* Clear the answer text field
* Save the card
* Verify that the card was not edited successfully
* Navigate back from Edit Confidence Card Page
* Verify that the My Deck title is "MaxSoft"



Verify that a user cannot manually edit a card with text by providing only the question
---------------------------------------------------------------------------------------
* Tap on card index = "1" Options button
* Tap on Card Edit Option
* Verify that the page title is "Edit Card"
* Edit the question as follows "test question3"
* Navigate to Back tab
* Clear the answer text field
* Save the card
* Verify that the card was not edited successfully
* Navigate back from Edit Confidence Card Page
* Verify that the My Deck title is "MaxSoft"



Verify that a user cannot manually edit a card with text by providing only the answer
-------------------------------------------------------------------------------------
* Tap on card index = "1" Options button
* Tap on Card Edit Option
* Verify that the page title is "Edit Card"
* Clear the question text field
* Navigate to Back tab
* Edit the answer as follows "test answer4"
* Save the card
* Verify that the card was not edited successfully



Verify that a user can navigate back from Manually Created Edit Card Page
-------------------------------------------------------------------------
* Navigate back from Edit Confidence Card Page
* Verify that the My Deck title is "MaxSoft"



Verify that a user can navigate to the Edit Card page of an auto created card
-----------------------------------------------------------------------------
* Tap on card index = "6" Options button
* Tap on Card Edit Option
* Verify that the page title is "Edit Card"
* Edit the question as follows "This question is editing by an automated program"
* Navigate to Back tab
* Edit the answer as follows "This answer is editing by an automated program"



Verify that a user can navigate back from Auto Created Edit Card Page
---------------------------------------------------------------------
* Navigate back from Edit Confidence Card Page
* Verify that the My Deck title is "MaxSoft"



Verify that a user can revert the changes of the edit card
----------------------------------------------------------
* Tap on card index = "1" Options button
* Tap on Card Edit Option
* Verify that the page title is "Edit Card"
* Edit the question as follows "test question4"
* Navigate to Back tab
* Verify that the Back tab is selected
* Verify that the Answer text box is visible
* Edit the answer as follows "test answer4"
* Save the card
* Verify that the Card title is "test question4"



Verify that a user can navigate back to My Decks page
-----------------------------------------------------
* Navigate back from My Deck Card List page
* Verify that the My Deck title showing here is "MaxSoft"
* Verify that the user can navigate back from Selected My Deck page
* Verify that the page title is "My Decks"