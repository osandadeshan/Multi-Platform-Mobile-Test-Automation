Expert Deck MCQ Card View Specification
=======================================
Date Created    : 12/12/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: expert_deck_mcq_card_view



Verify that a user can navigate to MCQ card view by tapping on card preview text on the card list
-------------------------------------------------------------------------------------------------
* Navigate to "Accounting: A Faster Way" Expert Deck Card list page
* Verify that the Expert Deck title is "Accounting: A Faster Way"
* Verify that the Expert Deck card titles are visible
* Tap on "This is multiple choice question 1" Card
* Verify that the "This is multiple choice question 1" MCQ Question is visible



Verify that the question and the answer choices of the MCQ Card are visible
---------------------------------------------------------------------------
* Verify that the "This is multiple choice question 1" MCQ Question is visible
* Verify that the MCQ Card contains "4" answer choices



Verify that the card number and the number of cards in a deck should be visible
------------------------------------------------------------------------------
* Verify that the position of the card is "2 / 6"



Verify that the edit card button should be visible
--------------------------------------------------
* Verify that the Edit Card Button is visible



Verify that the Star button should be visible
---------------------------------------------
* Verify that the Favourite button is visible



Verify that a user can swipe to view the next card
--------------------------------------------------
* Swipe the device screen horizontally right to left
* Verify that the position of the card is "3 / 6"



Verify that a user can swipe to view the previous card
------------------------------------------------------
* Swipe the device screen horizontally left to right
* Verify that the position of the card is "2 / 6"



Verify that a user can view a MCQ card with web view
----------------------------------------------------
* Swipe the device screen horizontally right to left
* Swipe the device screen horizontally right to left
* Swipe the device screen horizontally right to left
* Verify that the position of the card is "5 / 6"
* Verify the webview contains the following text
    |Text in WebView                                    |
    |---------------------------------------------------|
    |Answer the question using bellow table data.       |
    |What is the average mark of Sameera?               |
    |ID                                                 |
    |Name                                               |



Verify that a user can scroll down and navigate to the bottom of the card
-------------------------------------------------------------------------
* Swipe the device screen horizontally right to left
* Verify that the position of the card is "6 / 6"
* Scroll to the text of "Option 4"



Verify that a user can navigate to expert deck cards list page by tapping on X button
-------------------------------------------------------------------------------------
* Navigate back from MCQ Card View page
* Verify that the Expert Deck title is "Accounting: A Faster Way"



Verify that a user can navigate back to Expert Decks page
---------------------------------------------------------
* Navigate back from Expert Deck Card List page
* Verify that the Expert Deck title showing here is "Accounting: A Faster Way"
* Verify that the user can navigate back from Selected Expert Deck page
* Verify that the page title is "Expert Decks"