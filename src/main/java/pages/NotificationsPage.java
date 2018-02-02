package pages;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class NotificationsPage extends BasePage {

    public static final String NOTIFICATIONS_PAGE = "NotificationsPage";
    public static final String NOTIFICATIONS_TITLE_TEXTVIEW = "notifications_title_textview";
    public static final String FREQUENCY_DROPDOWN_VALUES_LIST = "frequency_dropdown_values_list";
    public static final String TIMER = "timer_icon";
    public static final String HOUR = "hour";
    public static final String MINUTE = "minute";
    public static final String OK_BUTTON = "ok_button";
    public static final String AM_LABEL = "am_label";
    public static final String PM_LABEL = "pm_label";
    public static final String SAVE_BUTTON = "save_button";
    public static final String BACK_BUTTON = "back_button";

    public NotificationsPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void selectFrequency(String frequency) throws IOException {
        if (!frequency.isEmpty()){
            replaceXpathContentAndClickElement(NOTIFICATIONS_PAGE, FREQUENCY_DROPDOWN_VALUES_LIST, "frequency", frequency);
        }
    }

    public void verifyFrequencyIsChecked(String frequency, Boolean expectedStatus) throws IOException {
        isRadioButtonActive(NOTIFICATIONS_PAGE, FREQUENCY_DROPDOWN_VALUES_LIST, "frequency", frequency, expectedStatus);
    }

    public void selectTime(String hour, String minutes, String amPm) throws IOException {
        saveValueForScenario("hour", hour);
        saveValueForScenario("minutes", minutes);
        saveValueForScenario("amPm", amPm);
        if (!hour.isEmpty() && !minutes.isEmpty() && !amPm.isEmpty()){
            setTimePickerAndroid(NOTIFICATIONS_PAGE, TIMER, AM_LABEL, PM_LABEL, hour, minutes, amPm, OK_BUTTON);
        }
    }

    public void verifySetTime(String expectedTimeString) throws IOException {
        String hour = getSavedValueForScenario("hour");
        String zero = "0";
        if (Integer.valueOf(hour) < 10) {
            hour = zero.concat(hour);
        }
        String minutes = getSavedValueForScenario("minutes");
        String amPm = getSavedValueForScenario("amPm");
        expectedTimeString = hour + ":" + minutes + " " + amPm.toUpperCase();
        System.out.println("********** " + expectedTimeString);
        verifyElementAccessibilityIdTextIsVisibleAs(NOTIFICATIONS_PAGE, TIMER, expectedTimeString);
    }

    public void navigateBackFromNotificationsPage() throws IOException {
        getElement(NOTIFICATIONS_PAGE, BACK_BUTTON).click();
    }

}
