Copy Decks Specification
========================
Date Created    : 01/25/2018
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: copy_decks, deck_management



Verify that a user can create a new deck using Copy To wizard and copy all cards into it
----------------------------------------------------------------------------------------
* On My Decks page
* Verify that the user lands to the "My Decks" page
* Tap on Options button in "Gauge" My Deck
* Tap on Copy To button
* Tap on Create New Deck button
* Set exam date "30 January 2018"
* Verify that the 'Remind me daily starting' switch is in "ON" status
* Create a new deck
   |Deck title|Frequency of notifications|Hour|Minutes|AM/PM|
   |----------|--------------------------|----|-------|-----|
   |BDD       |5 days before exam        |11  |35     |PM   |
* An Alert box should be visible
* Alert message should be "New cards will appear in deck shortly"
* Tap on Ok button
* Tap on "BDD" My Deck
* Verify that the Practice Button is visible after selecting a My Deck
* Verify that the View/Edit Cards Button is visible after selecting a My Deck
* Navigate to cards list view of the My Deck
* Verify the Card contents of the My Deck
    |Card Content                                         |
    |-----------------------------------------------------|
    |Who is the owner of MaxSoft?                         |



Navigate back to My Decks page
------------------------------
* Navigate back from My Deck Card List page
* Verify that the My Deck title showing here is "BDD"
* Verify that the user can navigate back from Selected My Deck page
* Verify that the page title is "My Decks"



Verify that a user can copy all cards to an existing deck using Copy To wizard
------------------------------------------------------------------------------
* On My Decks page
* Verify that the user lands to the "My Decks" page
* Tap on Options button in "BDD" My Deck
* Tap on Copy To button
* Tap on "Mobile Automation"
* Tap on Copy Now button
* An Alert box should be visible
* Alert message should be "New cards will appear in deck shortly"
* Tap on Ok button
* Tap on "BDD" My Deck
* Verify that the Practice Button is visible after selecting a My Deck
* Verify that the View/Edit Cards Button is visible after selecting a My Deck
* Navigate to cards list view of the My Deck
* Verify the Card contents of the My Deck
    |Card Content                                         |
    |-----------------------------------------------------|
    |Who is the owner of MaxSoft?                         |