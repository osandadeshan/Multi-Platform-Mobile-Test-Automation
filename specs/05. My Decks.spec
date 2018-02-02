My Decks Specification
======================
Date Created    : 09/23/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: my_decks



Verify that the expected elements are visible on the My Decks page
------------------------------------------------------------------
* On My Decks page
* Verify that the page title is "My Decks"
* Verify that the Last Modified button is visible on the My Decks page
* Verify that the Option button is visible on the My Decks page
* Verify that the Create New Deck button is visible on the My Decks page



Verify that the expected elements are visible on a My Deck
----------------------------------------------------------
* Verify that the Deck title label is visible
* Verify that the Days remaining label is visible
* Verify that the Progress bar is visible



Create a new deck as "Sample Deck"
----------------------------------
* Create new deck using the deck title as "Test Automation", exam date as "26 November 2017", frequency of notifications as "5 days before exam" and the reminder time as "10":"55" "PM"



Verify that a newly added my deck is visible
--------------------------------------------
* Verify that the newly added "Test Automation" my deck is visible



Verify that the newly added my decks are visible
------------------------------------------------
* Verify that the following my decks are visible
    |My Deck Title        |
    |---------------------|
    |Sample Deck          |
    |TestNew              |
    |Test Automation      |



Verify that the existing my decks are visible
---------------------------------------------
* Verify that the following my decks are visible
    |My Deck Title        |
    |---------------------|
    |TestNew              |
    |Sample Deck          |



Verify that the below my deck is not visible
--------------------------------------------
* Verify that the "Physics Basic" my deck is not visible



Verify that the below my decks are not visible
----------------------------------------------
* Verify that the following my decks are not visible
    |My Deck Title        |
    |---------------------|
    |Chemistry Basics     |
    |Combined Maths Basics|
    |Java Basics          |
    |Automation Basics    |



Verify that the option menu should be visible for my decks
----------------------------------------------------------
* Tap on Options button in "Test Automation" My Deck
* Verify that the "Test Automation" is visible as My Deck title on the top of the Option menu
* Verify that the My Deck Option menu items are visible