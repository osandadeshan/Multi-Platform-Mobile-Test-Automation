Practice Summary For Fillin Cards Specification
===============================================
Date Created    : 01/29/2018
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: practice_summary, fillin_cards



Verify that the correct card count will be changed to 1 when a user correctly answered to a card
------------------------------------------------------------------------------------------------
* On My Decks page
* Verify that the user lands to the "My Decks" page
* Tap on "Mobile Automation" My Deck
* Verify that the Practice Button is visible after selecting a My Deck
* Verify that the View/Edit Cards Button is visible after selecting a My Deck
* Navigate to Practice of My Deck
* Verify that the Question TextView is visible
* Verify that the Answer TextBox is visible
* Set Answer as "An Automation Framework"
* Press Enter button on the Keyboard
* Close the current practice session
* Verify that the correct count is "1"
* Verify that the incorrect count is "0"



Verify that the incorrect card count will be changed to 1 when a user incorrectly answered to a card
----------------------------------------------------------------------------------------------------
* Navigate to Practice of My Deck
* Verify that the Question TextView is visible
* Verify that the Answer TextBox is visible
* Set Answer as "An Automation Framewor"
* Press Enter button on the Keyboard
* Close the current practice session
* Verify that the correct count is "0"
* Verify that the incorrect count is "1"



Verify that the correct card count and incorrect card count will be changed to 1 when a user correctly answered to a card and incorrectly answered to another card
------------------------------------------------------------------------------------------------------------------------------------------------------------------
* On My Decks page
* Verify that the user lands to the "My Decks" page
* Tap on "Mobile Automation" My Deck
* Navigate to Practice of My Deck
* Verify that the Question TextView is visible
* Verify that the Answer TextBox is visible
* Set Answer as "An Automation Framework"
* Press Enter button on the Keyboard
* Swipe the device screen horizontally right to left
* Set Answer as "Osa"
* Press Enter button on the Keyboard
* Close the current practice session
* Verify that the correct count is "1"
* Verify that the incorrect count is "1"



_____________________________________________

* Tap on Home button on Practice Summary page