Notifications Specification
===========================
Date Created    : 09/23/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: settings



Verify that "2 weeks before exam" should be already selected as the default notification frequency
--------------------------------------------------------------------------------------------------
tags: notifications, settings

* On Settings page
* Verify that the page title is "Settings"
* On Notifications page
* Verify that the page title is "Notifications"
* Reminder frequency and verify its active status
    |Notification Frequency|Is Radio Button Active|
    |----------------------|----------------------|
    |2 weeks before exam   |true                  |
    |1 week before exam    |false                 |
    |5 days before exam    |false                 |
    |1 day before exam     |false                 |



Verify that a user can select any notification frequency
--------------------------------------------------------
tags: notifications, settings

* Select reminder frequency and verify its active status
    |Notification Frequency|Is Radio Button Active|
    |----------------------|----------------------|
    |2 weeks before exam   |true                  |
    |1 week before exam    |true                  |
    |5 days before exam    |true                  |
    |1 day before exam     |true                  |



Verify that a user can select any time
--------------------------------------
tags: notifications, settings

* Set timer using the following details
    |Hour|Minutes|AM/PM|
    |11  |35     |PM   |
* Verify the default reminder time should be "11:35 PM"



Verify that a user can navigate back to Settings page
-----------------------------------------------------
tags: notifications, settings

* Navigate back from notifications page
* Verify that the page title is "Settings"