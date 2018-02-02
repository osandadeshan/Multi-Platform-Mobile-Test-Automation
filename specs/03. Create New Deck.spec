Create New Deck Specification
=============================
Date Created    : 09/23/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: create_new_my_deck



Verify that the expected UI elements are visible on the create new deck page
----------------------------------------------------------------------------
* On My Decks page
* Verify that the page title is "My Decks"
* On Create New Deck page
* Verify that the page title is "Create Deck"
* Verify that the Deck title label is "Deck title *"
* Verify that the Deck title textbox is visible
* Verify that the Exam date label is "Exam Date"
* Verify that the Exam date textbox is visible
* Verify that the 'Remind me daily starting' label is "Remind me daily starting:"
* Verify that the 'Remind me daily starting' switch is visible



Verify that the 'Remind me daily starting' switch is in off status as default
-----------------------------------------------------------------------------
* Verify that the 'Remind me daily starting' switch is in "OFF" status
* Verify that the enable status of the frequency dropdown is "false"
* Verify that the enable status of the time picker is "false"



Verify that the 'Remind me daily starting' switch can switch on
---------------------------------------------------------------
* Tap on 'Remind me daily starting' switch
* Verify that the 'Remind me daily starting' switch is in "ON" status
* Verify that the enable status of the frequency dropdown is "true"
* Verify that the enable status of the time picker is "true"



Verify that the 'Remind me daily starting' switch can switch off
----------------------------------------------------------------
* Tap on 'Remind me daily starting' switch
* Verify that the 'Remind me daily starting' switch is in "OFF" status
* Verify that the enable status of the frequency dropdown is "false"
* Verify that the enable status of the time picker is "false"



Verify that a user can create a new deck with all fields
--------------------------------------------------------
* On My Decks page
* On Create New Deck page
Verify that the 'Remind me daily starting' switch is in "OFF" status
* Tap on 'Remind me daily starting' switch
Verify that the 'Remind me daily starting' switch is in "ON" status
* Create a new deck using the following details
   |Deck title|Exam date      |Frequency of notifications|Hour|Minutes|AM/PM|
   |----------|---------------|--------------------------|----|-------|-----|
   |TestNew   |30 October 2017|5 days before exam        |11  |35     |PM   |
* Verify the deck creation has completed successfully
* Verify that the newly added "TestNew" my deck is visible



Verify that a user can create a new deck using only deck title
--------------------------------------------------------------
* On Create New Deck page
* Create a new deck using the following details
   |Deck title|Exam date      |Frequency of notifications|Hour|Minutes|AM/PM|
   |----------|---------------|--------------------------|----|-------|-----|
   |TestNew   |               |                          |    |       |     |
* Verify the deck creation has completed successfully
* Verify that the newly added "TestNew" my deck is visible



Verify that a user can create a new deck using a "-" for the deck title
-----------------------------------------------------------------------
* On Create New Deck page
* Create a new deck using the following details
   |Deck title    |Exam date      |Frequency of notifications|Hour|Minutes|AM/PM|
   |--------------|---------------|--------------------------|----|-------|-----|
   |TestDeck-New  |               |                          |    |       |     |
* Verify the deck creation has completed successfully
* Verify that the newly added "TestDeck-New" my deck is visible



Verify that a user can create a new deck using a ":" for the deck title
-----------------------------------------------------------------------
* On Create New Deck page
* Create a new deck using the following details
   |Deck title    |Exam date      |Frequency of notifications|Hour|Minutes|AM/PM|
   |--------------|---------------|--------------------------|----|-------|-----|
   |TestDeck:New  |               |                          |    |       |     |
* Verify the deck creation has completed successfully
* Verify that the newly added "TestDeck:New" my deck is visible



Verify that a user cannot create a new deck using a "@" for the deck title
--------------------------------------------------------------------------
* On Create New Deck page
* Create a new deck using the following details
   |Deck title    |Exam date      |Frequency of notifications|Hour|Minutes|AM/PM|
   |--------------|---------------|--------------------------|----|-------|-----|
   |TestDeck@New  |               |                          |    |       |     |
* Verify the deck creation has failed
* Navigate back to My Decks page
* Verify that the "TestDeck@New" my deck is not visible



Verify that a user can create a new deck using 50 characters for the deck title
-------------------------------------------------------------------------------
* On Create New Deck page
* Create a new deck using the following details
   |Deck title                                         |Exam date      |Frequency of notifications|Hour|Minutes|AM/PM|
   |---------------------------------------------------|---------------|--------------------------|----|-------|-----|
   |The maximum num of chars for the deck title is 50. |               |                          |    |       |     |
* Verify the deck creation has completed successfully
* Verify that the newly added "The maximum num of chars for the deck title is 50." my deck is visible



Verify that a user cannot create a new deck using 51 characters for the deck title
----------------------------------------------------------------------------------
* On Create New Deck page
* Create a new deck using the following details
   |Deck title                                          |Exam date      |Frequency of notifications|Hour|Minutes|AM/PM|
   |----------------------------------------------------|---------------|--------------------------|----|-------|-----|
   |The maximum num of chars for the deck title is 50.. |               |                          |    |       |     |
* Verify the deck creation has failed
* Verify that the "The maximum num of chars for the deck title is 50.." my deck is not visible



Verify that a user can create a new deck using deck title and exam date
-----------------------------------------------------------------------
* On Create New Deck page
* Create a new deck using the following details
   |Deck title|Exam date      |Frequency of notifications|Hour|Minutes|AM/PM|
   |----------|---------------|--------------------------|----|-------|-----|
   |QETest    |30 October 2017|                          |    |       |     |
* Verify the deck creation has completed successfully
* Verify that the newly added "QETest" my deck is visible



Verify that a user can create a new deck using deck title, exam date and frequency of notifications
---------------------------------------------------------------------------------------------------
* On Create New Deck page
* Tap on 'Remind me daily starting' switch
* Verify that the 'Remind me daily starting' switch is in "ON" status
* Create a new deck using the following details
   |Deck title|Exam date      |Frequency of notifications|Hour|Minutes|AM/PM|
   |----------|---------------|--------------------------|----|-------|-----|
   |QETest2   |28 October 2017|1 day before exam         |    |       |     |
* Verify the deck creation has completed successfully
* Verify that the newly added "QETest2" my deck is visible



Verify that a user cannot create a new deck without mandatory fields
--------------------------------------------------------------------
* On Create New Deck page
* Create a new deck using the following details
   |Deck title|Exam date      |Frequency of notifications|Hour|Minutes|AM/PM|
   |----------|---------------|--------------------------|----|-------|-----|
   |          |               |                          |    |       |     |
* Verify the deck creation has failed



Verify that a user can navigate back to My Decks page
-----------------------------------------------------
* On Create New Deck page
* Navigate back to My Decks page
* Verify that the page title is "My Decks"