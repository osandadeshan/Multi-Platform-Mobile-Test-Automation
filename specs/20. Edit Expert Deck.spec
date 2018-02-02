Edit Expert Deck Specification
==============================
Date Created    : 11/10/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: edit_expert_deck



Verify that a user can navigate to Edit Deck page
-------------------------------------------------
* On Expert Decks page
* Verify that the page title is "Expert Decks"
* Tap on Edit Deck Info menu item of "Accounting: A Faster Way" Expert Deck
* Verify that the page title is "Deck Info"



Verify that the expected UI elements are visible on the Edit Deck page
----------------------------------------------------------------------
* Verify that the Deck title label is "Deck title *"
* Verify that the Deck title textbox is visible
* Verify that the Exam date label is "Exam Date"
* Verify that the Exam date textbox is visible
* Verify that the 'Remind me daily starting' label is "Remind me daily starting:"
* Verify that the 'Remind me daily starting' switch is visible



Verify the deck info showing on the screen
------------------------------------------
* Verify the deck info as follows
    |Input Field                |Value                    |
    |---------------------------|-------------------------|
    |deck_title_textfield       |Accounting: A Faster Way |
    |exam_date_date_picker      |Exam Date                |
* Verify that the enable status of the frequency dropdown is "false"
* Verify that the enable status of the time picker is "false"
* Verify that the 'Remind me daily starting' switch is in "OFF" status



Verify that the 'Remind me daily starting' switch can switch on
---------------------------------------------------------------
* Set exam date as "20 November 2017"
* Tap on 'Remind me daily starting' switch
* Verify that the 'Remind me daily starting' switch is in "OFF" status
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



Verify that a user can edit the deck with all fields
----------------------------------------------------
* Verify that the 'Remind me daily starting' switch is in "OFF" status
* Tap on 'Remind me daily starting' switch
* Verify that the 'Remind me daily starting' switch is in "ON" status
* Edit expert deck using the following details
   |Deck title|Exam date       |Frequency of notifications|Hour|Minutes|AM/PM|
   |----------|----------------|--------------------------|----|-------|-----|
   |Deck1     |30 November 2017|5 days before exam        |10  |35     |PM   |
* Verify that the expert deck has successfully updated
* Verify that the newly updated "Deck1" expert deck is visible
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Verify the deck info as follows
    |Input Field                |Value                  |
    |---------------------------|-----------------------|
    |deck_title_textfield       |Deck1                  |
    |exam_date_date_picker      |2017/11/30             |
    |selected_frequency_value   |5 days before exam     |
    |timer_icon                 |10:35 PM               |
* Navigate back to Expert Decks page



Verify that a deck cannot be able to save without deck title
------------------------------------------------------------
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Remove deck title
* Tap on Save button
* Verify that the updating deck has failed
* Navigate back to Expert Decks page



Verify that a user can remove the exam date in a deck which already has an exam date
------------------------------------------------------------------------------------
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Remove exam date
* Tap on Save button
* Verify that the expert deck has successfully updated
* Verify that the newly updated "Deck1" expert deck is visible
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Verify the deck info as follows
    |Input Field                |Value                  |
    |---------------------------|-----------------------|
    |deck_title_textfield       |Deck1                  |
    |exam_date_date_picker      |Exam Date              |
    |selected_frequency_value   |2 weeks before exam    |
    |timer_icon                 |08:30 AM               |
* Verify the status of Frequency Dropdown is "disabled"
* Verify the status of timer is "disabled"
* Navigate back to Expert Decks page



Verify that a user can add an exam date to a deck which has no exam date
------------------------------------------------------------------------
* On Expert Decks page
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Edit expert deck using the following details
   |Deck title    |Exam date       |Frequency of notifications|Hour|Minutes|AM/PM|
   |--------------|--------------- |--------------------------|----|-------|-----|
   |              |30 November 2017|                          |    |       |     |
* Verify that the expert deck has successfully updated
* Verify that the newly updated "Deck1" expert deck is visible
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Verify the deck info as follows
    |Input Field                |Value                  |
    |---------------------------|-----------------------|
    |deck_title_textfield       |Deck1                  |
    |exam_date_date_picker      |2017/11/30             |
    |selected_frequency_value   |2 weeks before exam    |
    |timer_icon                 |08:30 AM               |
* Navigate back to Expert Decks page



Verify that a user can turn off the notification toggle in a deck which has an exam date
----------------------------------------------------------------------------------------
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Tap on 'Remind me daily starting' switch
* Verify that the 'Remind me daily starting' switch is in "OFF" status
* Tap on Save button
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Verify that the 'Remind me daily starting' switch is in "OFF" status
* Navigate back to Expert Decks page



Verify that a user can turn on the notification toggle of the above deck
------------------------------------------------------------------------
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Tap on 'Remind me daily starting' switch
* Verify that the 'Remind me daily starting' switch is in "ON" status
* Tap on Save button
* Verify that the expert deck has successfully updated
* Verify that the newly updated "Deck1" expert deck is visible
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Verify that the 'Remind me daily starting' switch is in "ON" status
* Navigate back to Expert Decks page



Verify that a user can change frequency of the default notification in a deck which has an exam date
----------------------------------------------------------------------------------------------------
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Change frequency into "5 days before exam"
* Tap on Save button
* Verify that the expert deck has successfully updated
* Verify that the newly updated "Deck1" expert deck is visible
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Verify that the frequency is "5 days before exam"
* Navigate back to Expert Decks page



Verify that a user cannot provide reminder frequency and reminder time without the exam date
--------------------------------------------------------------------------------------------
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Remove exam date
* Verify the status of Frequency Dropdown is "disabled"
* Verify the status of timer is "disabled"
* Navigate back to Expert Decks page



Verify that a user can edit the above deck with previous deck details
---------------------------------------------------------------------
* Tap on Edit Deck Info menu item of "Deck1" Expert Deck
* Set expert deck title as "Accounting: A Faster Way"
* Remove exam date
* Tap on Save button
* Verify that the expert deck has successfully updated
* Verify that the newly updated "Accounting: A Faster Way" expert deck is visible
* Tap on Edit Deck Info menu item of "Accounting: A Faster Way" Expert Deck
* Verify the deck info as follows
    |Input Field                |Value                    |
    |---------------------------|-------------------------|
    |deck_title_textfield       |Accounting: A Faster Way |
    |exam_date_date_picker      |Exam Date                |
* Verify that the enable status of the frequency dropdown is "false"
* Verify that the enable status of the time picker is "false"
* Verify that the 'Remind me daily starting' switch is in "OFF" status
* Navigate back to Expert Decks page



Verify that a user can navigate back to Expert Decks page
-----------------------------------------------------
* Tap on Edit Deck Info menu item of "Accounting: A Faster Way" Expert Deck
* Navigate back to Expert Decks page
* Verify that the page title is "Expert Decks"