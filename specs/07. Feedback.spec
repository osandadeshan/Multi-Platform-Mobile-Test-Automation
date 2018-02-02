Feedback Specification
======================
Date Created    : 09/23/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: settings



Verify that a user can send a feedback with emoji and comment
-------------------------------------------------------------
tags: feedback, settings

* On Settings page
* Verify that the page title is "Settings"
* On Give Us Feedback page
* Verify that the page title is "Feedback"
* Select the emoji of "Pretty Good"
* Enter a comment as "Good"
* Click send button
* Click email send button
Verify the feedback has sent



Verify that a user will be navigated back to Settings page after sending a feedback
-----------------------------------------------------------------------------------
tags: feedback, settings

* Navigate back from Feedback page
* Verify that the page title is "Settings"



Verify that a user can send a feedback with emoji and 50 characters comment
---------------------------------------------------------------------------
tags: feedback, settings

* On Give Us Feedback page
* Verify that the page title is "Feedback"
* Select the emoji of "Awesome"
* Enter a comment as <file:/resources/comments/50 characters comment.txt>
* Click send button
* Click email send button
Verify the feedback has sent
* Navigate back from Feedback page



Verify that a user can send a feedback with emoji and 100 characters comment
----------------------------------------------------------------------------
tags: feedback, settings

* On Give Us Feedback page
* Verify that the page title is "Feedback"
* Select the emoji of "Awesome"
* Enter a comment as <file:/resources/comments/100 characters comment.txt>
* Click send button
* Click email send button
Verify the feedback has sent
* Navigate back from Feedback page



Verify that a user can send a feedback with emoji and 1000 characters comment
-----------------------------------------------------------------------------
tags: feedback, settings

* On Give Us Feedback page
* Verify that the page title is "Feedback"
* Select the emoji of "Awesome"
* Enter a comment as <file:/resources/comments/1000 characters comment.txt>
* Click send button
* Click email send button
Verify the feedback has sent
* Navigate back from Feedback page



Verify that a user cannot send a feedback only with emoji
---------------------------------------------------------
tags: feedback, settings

* On Give Us Feedback page
* Select the emoji of "Pretty Good"
* Click send button
* Verify the feedback is not sent
* Navigate back from Feedback page
* Verify that the page title is "Settings"



Verify that a user cannot send a feedback only with comment
-----------------------------------------------------------
tags: feedback, settings

* On Give Us Feedback page
* Select the emoji of ""
* Enter a comment as "Good"
* Click send button
* Verify the feedback is not sent
* Navigate back from Feedback page
* Verify that the page title is "Settings"



Verify that a user cannot send a feedback without an emoji and a comment
------------------------------------------------------------------------
tags: feedback, settings

* On Give Us Feedback page
* Select the emoji of ""
* Enter a comment as ""
* Click send button
* Verify the feedback is not sent
* Navigate back from Feedback page
* Verify that the page title is "Settings"


