package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.SettingsPage;
import util.DriverSetup;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class SettingsPageStepDefinitions {

    private SettingsPage settingsPage;

    public SettingsPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            settingsPage = PageFactory.initElements(iosDriver, SettingsPage.class);
            return settingsPage;
        } else {
            settingsPage = PageFactory.initElements(androidDriver, SettingsPage.class);
            return settingsPage;
        }
    }

    @Step("On Notifications page")
    public void navigateToNotifications() throws IOException {
        pageObject().navigateToNotifications();
    }

    @Step("On Change Password page")
    public void navigateToChangePassword() throws IOException {
        pageObject().navigateToChangePassword();
    }

    @Step("On Give Us Feedback page")
    public void navigateToGiveUsFeedback() throws IOException {
        pageObject().navigateToGiveUsFeedback();
    }

    @Step("On FAQs page")
    public void navigateToFAQs() throws IOException {
        pageObject().navigateToFAQs();
    }

    @Step("Verify all the elements on Settings page")
    public void verifySettingsPageElements() throws IOException{
        pageObject().verifyAllElements();
    }

    @Step("Verify the username is <expectedUsername>")
    public void verifyUsername(String expectedUsername) throws IOException{
        pageObject().verifyUsername(expectedUsername);
    }

    @Step("Tap on Sign out button")
    public void tapOnSignOutButton() throws IOException{
        pageObject().tapOnSignOutButton();
    }

    @Step("Verify that the Sign out confirmation Alert box is visible")
    public void isAlertVisible() throws IOException{
        pageObject().isAlertVisible();
    }

    @Step("Verify that the Sign out confirmation Alert title is <alertTitle>")
    public void verifyAlertTitle(String alertTitle) throws IOException{
        pageObject().verifyAlertTitle(alertTitle);
    }

    @Step("Verify that the Sign out confirmation Alert message is <alertMessage>")
    public void verifyAlertMessage(String alertMessage) throws IOException{
        pageObject().verifyAlertMessage(alertMessage);
    }

    @Step("Tap on Yes button for the Sign out confirmation Alert")
    public void tapAlertYesButton() throws IOException{
        pageObject().tapAlertYesButton();
    }

    @Step("Tap on Cancel button for the Sign out confirmation Alert")
    public void tapAlertCancelButton() throws IOException{
        pageObject().tapAlertCancelButton();
    }


}
