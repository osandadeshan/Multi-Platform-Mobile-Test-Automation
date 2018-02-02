Privacy Policy Specification
============================
Date Created    : 09/23/2017
Version   		: 1.0.0
Owner      		: Osanda Deshan
Description  	: This is an executable specification file which follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.


tags: settings, privacy_policy



Verify that a user can navigate to the privacy policy page
----------------------------------------------------------
* On Settings page
* Verify that the page title is "Settings"
* On Privacy Policy page
* Verify that the page title is "Privacy Policy"



Verify that the content of privacy policy is equal to the expected
------------------------------------------------------------------
* Save Privacy Policy HTML Page Source in to the directory of "/resources/privacy_policy/actual_privacy_policy.txt"
 Compare Privacy Policy page content between expected file in "/resources/privacy_policy/expected_privacy_policy.txt" and actual file in "/resources/privacy_policy/actual_privacy_policy.txt"



Verify that a user can navigate back from privacy policy page
-------------------------------------------------------------
* Navigate back from Privacy Policy page
* Verify that the page title is "Settings"


