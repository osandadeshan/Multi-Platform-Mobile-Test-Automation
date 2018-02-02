package stepImpl;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.testng.Assert;
import pages.BasePage;
import util.DriverSetup;
import util.ToastMessage;
import java.io.IOException;
import java.util.List;

import static pages.SettingsPage.SETTINGS_PAGE;
import static pages.SettingsPage.SETTINGS_TITLE_TEXTVIEW;


/**
 * Created by Osanda on 4/29/2017.
 */


public class CommonStepDefinitions {

    private String PLATFORM = DriverSetup.PLATFORM.toLowerCase();
    private String ANDROID = "android";
    private String IOS = "ios";
    private BasePage basePageObj = new BasePage();

    @Step("Testing platform information")
    public void platformInfo(){
        if (PLATFORM.equals(ANDROID)) {
            Gauge.writeMessage("Targeted Platform: Android");
            Gauge.writeMessage("Targeted Android Version: v" + DriverSetup.ANDROID_VERSION);
            Gauge.writeMessage("Targeted Android Device: " + DriverSetup.ANDROID_DEVICE_NAME);
            Gauge.writeMessage("Targeted Android App Package Name: " + DriverSetup.ANDROID_APP_PACKAGE);
            Gauge.writeMessage("Targeted Appium Host: " + DriverSetup.APPIUM_HOST);
            Gauge.writeMessage("Targeted Appium Port: " + DriverSetup.APPIUM_PORT);
        } else if (PLATFORM.equals(IOS)) {
            Gauge.writeMessage("Targeted platform is: iOS");
            Gauge.writeMessage("Targeted iOS Version: v" + DriverSetup.IOS_VERSION);
            Gauge.writeMessage("Targeted iOS Device: " + DriverSetup.IOS_DEVICE_NAME);
            Gauge.writeMessage("Targeted iOS App Package Name: " + DriverSetup.BUNDLE_ID);
            Gauge.writeMessage("Targeted Appium Host: " + DriverSetup.APPIUM_HOST);
            Gauge.writeMessage("Targeted Appium Port: " + DriverSetup.APPIUM_PORT);
        } else {
            Gauge.writeMessage("Targeted platform is not supported");
        }
    }

    @Step("Launch the application")
    public void openApp() throws IOException {
        DriverSetup.setupDriver();
    }

    @Step("Verify that the toast message is <toastMessage>")
    public void verifyToastMessage(String toastMessage) throws Exception {
        //Assert.assertTrue(ToastMessage.getToastMessage().contains(toastMessage), "Invalid Toast Message");
        Assert.assertEquals(ToastMessage.getToastMessageContent(), toastMessage, "Invalid toast message!");
    }

    @Step("Wait <seconds> seconds")
    public void wait(int seconds) throws Exception {
       Thread.sleep(seconds*1000);
    }

    @Step("Verify that the page title is <pageTitle>")
    public void verifyPageTitle(String pageTitle) throws IOException {
        if (PLATFORM.equals(ANDROID)) {
            basePageObj.isPageTitleEqualTo(SETTINGS_PAGE, SETTINGS_TITLE_TEXTVIEW, pageTitle);
        }
    }

    @Step("Swipe the device screen horizontally right to left")
    public void swipeHorizontallyRightToLeft() throws InterruptedException {
        basePageObj.swipeHorizontallyRightToLeft();
    }

    @Step("Swipe the device screen horizontally left to right")
    public void swipeHorizontallyLeftToRight() throws InterruptedException {
        basePageObj.swipeHorizontallyLeftToRight();
    }

    @Step("Swipe the device screen vertically top to bottom")
    public void swipeVerticallyTopToBottom() throws InterruptedException {
        basePageObj.swipeVerticallyTopToBottom();
    }

    @Step("Swipe the device screen vertically bottom to top")
    public void swipeVerticallyBottomToTop() throws InterruptedException {
        basePageObj.swipeVerticallyBottomToTop();
    }

    @Step("Scroll down to the bottom of the screen")
    public void scrollDownToBottom() throws InterruptedException {
        basePageObj.scrollDown();
    }

    @Step("Scroll to the text of <text>")
    public void scrollTo(String text) throws InterruptedException {
        basePageObj.scrollTo(text);
    }

    @Step("Navigate back from the device")
    public void navigateBackFromDevice() throws InterruptedException {
        basePageObj.navigateBackFromDevice();
    }

    @Step("Verify the webview contains <text>")
    public void isWebViewTextEquals(String text) throws InterruptedException {
        basePageObj.isWebViewTextEquals(text);
    }

    @Step("Verify the webview contains the following text <table>")
    public void isWebViewTextEquals(Table table) throws InterruptedException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            basePageObj.isWebViewTextEquals(row.getCell(columnNames.get(0)));
        }
    }

    @Step("Tap on <text>")
    public void tapOnVisibleText(String text){
        basePageObj.scrollAndClick(text);
    }

    @Step("Press Enter button on the Keyboard")
    public void pressKeyboardEnter() {
        basePageObj.pressKeyboardEnter();
    }

    @Step("Hide keyboard")
    public void hideKeyboard() {
        basePageObj.hideKeyboard();
    }

    @Step("Show keyboard")
    public void showKeyboard() {
        basePageObj.hideKeyboard();
    }

    @Step("Quit from the application")
    public void quit() {
        DriverSetup.tearDown();
    }


}
