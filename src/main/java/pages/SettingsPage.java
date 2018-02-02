package pages;

import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class SettingsPage extends BasePage {

    public static final String SETTINGS_PAGE = "SettingsPage";
    public static final String SETTINGS_TITLE_TEXTVIEW = "settings_title_textview";
    public static final String USERNAME_TEXTVIEW = "username_textview";
    public static final String NOTIFICATIONS_MENU = "notifications_menu";
    public static final String NOTIFICATIONS_LABEL = "Notifications";
    public static final String CHANGE_PASSWORD_MENU = "change_password_menu";
    public static final String CHANGE_PASSWORD_LABEL = "Change Password";
    public static final String GIVE_US_FEEDBACK_MENU = "give_us_feedback_menu";
    public static final String GIVE_US_FEEDBACK_LABEL = "Give Us Feedback";
    public static final String FAQS_MENU = "faqs_menu";
    public static final String FAQS_LABEL = "FAQs";
    public static final String TERMS_OF_SERVICE_MENU = "terms_of_service_menu";
    public static final String TERMS_OF_SERVICE_LABEL = "Terms of Service";
    public static final String PRIVACY_POLICY_MENU = "privacy_policy_menu";
    public static final String PRIVACY_POLICY_LABEL = "Privacy Policy";
    public static final String SIGN_OUT_BUTTON = "sign_out_button";
    public static final String SIGN_OUT_LABEL = "Sign out";
    public static final String SFC_VERSION_TEXTVIEW = "smart_flashcards_version_textview";
    public static final String SFC_VERSION_TEXT = "Smart Flashcards: Version 1.0.0";
    public static final String COPYRIGHTS_TEXTVIEW = "copyrights_textview";
    public static final String COPYRIGHTS_TEXT = "Copyright © 2017 Pearson Education Inc. All rights reserved.";
    public static final String SIGN_OUT_ALERT_TITLE = "sign_out_alert_title";
    public static final String SIGN_OUT_ALERT_TITLE_TEXT = "Sign out";
    public static final String SIGN_OUT_ALERT_MESSAGE = "sign_out_alert_message";
    public static final String SIGN_OUT_ALERT_MESSAGE_TEXT = "Are you sure you want to sign out?";
    public static final String SIGN_OUT_ALERT_YES_BUTTON = "sign_out_alert_yes_button";
    public static final String SIGN_OUT_ALERT_CANCEL_BUTTON = "sign_out_alert_cancel_button";

    public SettingsPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyAllElements() throws IOException {
        isElementVisible(SETTINGS_PAGE, USERNAME_TEXTVIEW);
        isElementNameEqualTo(SETTINGS_PAGE, NOTIFICATIONS_MENU, NOTIFICATIONS_LABEL);
        isElementNameEqualTo(SETTINGS_PAGE, CHANGE_PASSWORD_MENU, CHANGE_PASSWORD_LABEL);
        isElementNameEqualTo(SETTINGS_PAGE, GIVE_US_FEEDBACK_MENU, GIVE_US_FEEDBACK_LABEL);
        isElementNameEqualTo(SETTINGS_PAGE, FAQS_MENU, FAQS_LABEL);
        isElementNameEqualTo(SETTINGS_PAGE, TERMS_OF_SERVICE_MENU, TERMS_OF_SERVICE_LABEL);
        isElementNameEqualTo(SETTINGS_PAGE, PRIVACY_POLICY_MENU, PRIVACY_POLICY_LABEL);
        isElementNameEqualTo(SETTINGS_PAGE, SIGN_OUT_BUTTON, SIGN_OUT_LABEL);
        scrollDown();
        isElementNameEqualTo(SETTINGS_PAGE, SFC_VERSION_TEXTVIEW, SFC_VERSION_TEXT);
        isElementNameEqualTo(SETTINGS_PAGE, COPYRIGHTS_TEXTVIEW, COPYRIGHTS_TEXT);
    }

    public void navigateToNotifications() throws IOException {
        tapElement(SETTINGS_PAGE, NOTIFICATIONS_MENU);
    }

    public void navigateToChangePassword() throws IOException {
        tapElement(SETTINGS_PAGE, CHANGE_PASSWORD_MENU);
    }

    public void navigateToGiveUsFeedback() throws IOException {
        tapElement(SETTINGS_PAGE, GIVE_US_FEEDBACK_MENU);
    }

    public void navigateToFAQs() throws IOException {
        tapElement(SETTINGS_PAGE, FAQS_MENU);
    }

    public void verifyUsername(String expectedUsername) throws IOException {
        scrollTo(expectedUsername);
        isElementNameEqualTo(SETTINGS_PAGE, USERNAME_TEXTVIEW, expectedUsername);
    }

    public void tapOnSignOutButton() throws IOException {
        tapElement(SETTINGS_PAGE, SIGN_OUT_BUTTON);
    }

    public void verifyAlertTitle(String alertTitle) throws IOException {
        isElementTextEquals(SETTINGS_PAGE, SIGN_OUT_ALERT_TITLE, alertTitle);
    }

    public void isAlertVisible() throws IOException {
        isElementVisible(SETTINGS_PAGE, SIGN_OUT_ALERT_TITLE);
    }

    public void verifyAlertMessage(String alertMessage) throws IOException {
        isElementTextEquals(SETTINGS_PAGE, SIGN_OUT_ALERT_MESSAGE, alertMessage);
    }

    public void tapAlertYesButton() throws IOException {
        tapElement(SETTINGS_PAGE, SIGN_OUT_ALERT_YES_BUTTON);
    }

    public void tapAlertCancelButton() throws IOException {
        tapElement(SETTINGS_PAGE, SIGN_OUT_ALERT_CANCEL_BUTTON);
    }


}
