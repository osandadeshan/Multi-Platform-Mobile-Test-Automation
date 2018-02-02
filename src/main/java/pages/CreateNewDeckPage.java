package pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class CreateNewDeckPage extends BasePage {

    public static final String CREATE_NEW_DECK_PAGE = "CreateNewDeckPage";
    public static final String CREATE_NEW_DECK_TITLE_TEXTVIEW = "create_new_deck_title_textview";
    public static final String CREATE_NEW_DECK = "Create Deck";
    public static final String DECK_TITLE_LABEL = "deck_title_label";
    public static final String DECK_TITLE_TEXTFIELD = "deck_title_textfield";
    public static final String EXAM_DATE_LABEL = "exam_date_label";
    public static final String EXAM_DATE_DATE_PICKER = "exam_date_date_picker";
    public static final String EXAM_DATE_ELEMENT = "exam_date_element";
    public static final String EXAM_DATE_DATE_PICKER_OK_BUTTON = "exam_date_date_picker_ok_button";
    public static final String REMIND_ME_LABEL = "remind_me_label";
    public static final String REMIND_ME_SWITCH = "remind_me_switch";
    public static final String FREQUENCY_DROPDOWN = "frequency_dropdown";
    public static final String FREQUENCY_DROPDOWN_VALUES_LIST = "frequency_dropdown_values_list";
    public static final String TIMER = "timer_icon";
    public static final String HOUR = "hour";
    public static final String MINUTE = "minute";
    public static final String OK_BUTTON = "ok_button";
    public static final String AM_LABEL = "am_label";
    public static final String PM_LABEL = "pm_label";
    public static final String SAVE_BUTTON = "save_button";
    public static final String BACK_BUTTON = "back_button";

    public CreateNewDeckPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void navigateBackFromCreateNewDecksPage() throws IOException {
        tapElement(CREATE_NEW_DECK_PAGE, BACK_BUTTON);
    }

    public void remindMeSwitchStatus(String status) throws IOException {
        isElementTextEquals(CREATE_NEW_DECK_PAGE, REMIND_ME_SWITCH, status);
    }

    public void createNewDeck(String deckTitle, String examDate, String frequency, String hour, String minutes, String amPm) throws IOException {
        setDatePickerIOS();
        if (!deckTitle.isEmpty()){
            setTextAs(CREATE_NEW_DECK_PAGE, DECK_TITLE_TEXTFIELD, deckTitle);
        }
            if (!examDate.isEmpty()){
                setDatePickerAndroid(CREATE_NEW_DECK_PAGE, EXAM_DATE_DATE_PICKER, EXAM_DATE_ELEMENT, examDate, EXAM_DATE_DATE_PICKER_OK_BUTTON);
            }
                if (!frequency.isEmpty()){
                    tapElement(CREATE_NEW_DECK_PAGE, FREQUENCY_DROPDOWN);
                    replaceXpathContentAndClickElement(CREATE_NEW_DECK_PAGE, FREQUENCY_DROPDOWN_VALUES_LIST, "frequency", frequency);
                }

        saveValueForScenario("hour", hour);
        saveValueForScenario("minutes", minutes);
        saveValueForScenario("amPm", amPm);

        if (!hour.isEmpty() && !minutes.isEmpty() && !amPm.isEmpty()){
            setTimePickerAndroid(CREATE_NEW_DECK_PAGE, TIMER, AM_LABEL, PM_LABEL, hour, minutes, amPm, OK_BUTTON);
        }
        tapElement(CREATE_NEW_DECK_PAGE, SAVE_BUTTON);
    }

    public void createDeck(String deckTitle, String frequency, String hour, String minutes, String amPm) throws IOException {
       if (PLATFORM.toLowerCase().equals(IOS)) {
           setDatePickerIOS();
       } else {
           if (!deckTitle.isEmpty()) {
               setTextAs(CREATE_NEW_DECK_PAGE, DECK_TITLE_TEXTFIELD, deckTitle);
           }
           if (!frequency.isEmpty()) {
               tapElement(CREATE_NEW_DECK_PAGE, FREQUENCY_DROPDOWN);
               switch (frequency.toLowerCase()){
                   case "2 weeks before exam":
                       frequency = "1";
                       break;
                   case "1 week before exam":
                       frequency = "2";
                       break;
                   case "5 days before exam":
                       frequency = "3";
                       break;
                   case "1 day before exam":
                       frequency = "4";
                       break;
                   default:
                       Assert.fail("Frequency is not defined");
                       break;
               }
               replaceXpathContentAndClickElement(CREATE_NEW_DECK_PAGE, FREQUENCY_DROPDOWN_VALUES_LIST, "frequency", frequency);
           }

           saveValueForScenario("hour", hour);
           saveValueForScenario("minutes", minutes);
           saveValueForScenario("amPm", amPm);

           if (!hour.isEmpty() && !minutes.isEmpty() && !amPm.isEmpty()) {
               setTimePickerAndroid(CREATE_NEW_DECK_PAGE, TIMER, AM_LABEL, PM_LABEL, hour, minutes, amPm, OK_BUTTON);
           }
           tapElement(CREATE_NEW_DECK_PAGE, SAVE_BUTTON);
       }
    }

    public void setExamDate(String examDate) throws IOException {
        setDatePickerAndroid(CREATE_NEW_DECK_PAGE, EXAM_DATE_DATE_PICKER, EXAM_DATE_ELEMENT, examDate, EXAM_DATE_DATE_PICKER_OK_BUTTON);
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
        verifyElementAccessibilityIdTextIsVisibleAs(CREATE_NEW_DECK_PAGE, TIMER, expectedTimeString);
    }

    public void resetTextFields() throws IOException {
        clearText(CREATE_NEW_DECK_PAGE, DECK_TITLE_TEXTFIELD);
    }


}
