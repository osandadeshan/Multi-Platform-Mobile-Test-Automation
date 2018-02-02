Terms of Service Specification
==============================
Date Created    : 09/23/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: settings, terms_of_service



Verify that a user can navigate to the terms of service page
------------------------------------------------------------
* On Settings page
* Verify that the page title is "Settings"
* On Terms Of Service page
* Verify that the page title is "Terms of Service"



Verify that the content of terms of service is equal to the expected
--------------------------------------------------------------------
* Save Terms Of Service HTML Page Source in to the directory of "/resources/terms_of_service/actual_terms_of_service.txt"
* Compare Terms Of Service page content between expected file in "/resources/terms_of_service/expected_terms_of_service.txt" and actual file in "/resources/terms_of_service/actual_terms_of_service.txt"



Verify that a user can navigate back from terms of service page
---------------------------------------------------------------
* Navigate back from Terms Of Service page
* Verify that the page title is "Settings"

