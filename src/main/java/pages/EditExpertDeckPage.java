package pages;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static pages.ExpertDecksPage.EXPERT_DECKS_PAGE;
import static pages.MyDecksPage.ADDED_DECK_TITLE;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class EditExpertDeckPage extends BasePage {

    public static final String EDIT_EXPERT_DECK_PAGE = "EditExpertDeckPage";
    public static final String DECK_INFO_TITLE_TEXTVIEW = "deck_info_title_textview";
    public static final String DECK_INFO = "Deck Info";
    public static final String DECK_TITLE_LABEL = "deck_title_label";
    public static final String DECK_TITLE_TEXTFIELD = "deck_title_textfield";
    public static final String EXAM_DATE_LABEL = "exam_date_label";
    public static final String EXAM_DATE_DATE_PICKER = "exam_date_date_picker";
    public static final String REMOVE_EXAM_DATE = "remove_date";
    public static final String EXAM_DATE_ELEMENT = "exam_date_element";
    public static final String EXAM_DATE_DATE_PICKER_OK_BUTTON = "exam_date_date_picker_ok_button";
    public static final String REMIND_ME_LABEL = "remind_me_label";
    public static final String REMIND_ME_SWITCH = "remind_me_switch";
    public static final String FREQUENCY_DROPDOWN = "frequency_dropdown";
    public static final String FREQUENCY_DROPDOWN_VALUES_LIST = "frequency_dropdown_values_list";
    public static final String SELECTED_FREQUENCY_VALUE = "selected_frequency_value";
    public static final String TIMER = "timer_icon";
    public static final String HOUR = "hour";
    public static final String MINUTE = "minute";
    public static final String OK_BUTTON = "ok_button";
    public static final String AM_LABEL = "am_label";
    public static final String PM_LABEL = "pm_label";
    public static final String SAVE_BUTTON = "save_button";
    public static final String BACK_BUTTON = "back_button";

    public EditExpertDeckPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void navigateBackFromEditExpertDeckPage() throws IOException {
        tapElement(EDIT_EXPERT_DECK_PAGE, BACK_BUTTON);
    }

    public void remindMeSwitchStatus(String status) throws IOException {
        verifyElementAccessibilityIdTextIsVisibleAs(EDIT_EXPERT_DECK_PAGE, REMIND_ME_SWITCH, status);
    }

    public void editExpertDeck(String deckTitle, String examDate, String frequency, String hour, String minutes, String amPm) throws IOException {
        if (!deckTitle.isEmpty()){
            setTextAs(EDIT_EXPERT_DECK_PAGE, DECK_TITLE_TEXTFIELD, deckTitle);
        }
        if (!examDate.isEmpty()){
            setDatePickerAndroid(EDIT_EXPERT_DECK_PAGE, EXAM_DATE_DATE_PICKER, EXAM_DATE_ELEMENT, examDate, EXAM_DATE_DATE_PICKER_OK_BUTTON);
        }
        if (!frequency.isEmpty()){
            tapElement(EDIT_EXPERT_DECK_PAGE, FREQUENCY_DROPDOWN);
            replaceXpathContentAndClickElement(EDIT_EXPERT_DECK_PAGE, FREQUENCY_DROPDOWN_VALUES_LIST, "frequency", frequency);
        }

        saveValueForScenario("hour", hour);
        saveValueForScenario("minutes", minutes);
        saveValueForScenario("amPm", amPm);

        if (!hour.isEmpty() && !minutes.isEmpty() && !amPm.isEmpty()){
            setTimePickerAndroid(EDIT_EXPERT_DECK_PAGE, TIMER, AM_LABEL, PM_LABEL, hour, minutes, amPm, OK_BUTTON);
        }
        tapElement(EDIT_EXPERT_DECK_PAGE, SAVE_BUTTON);
    }

    public void setDeckTitle(String deckTitle) throws IOException {
        setTextAs(EDIT_EXPERT_DECK_PAGE, DECK_TITLE_TEXTFIELD, deckTitle);
    }

    public void setExamDate(String examDate) throws IOException {
        setDatePickerAndroid(EDIT_EXPERT_DECK_PAGE, EXAM_DATE_DATE_PICKER, EXAM_DATE_ELEMENT, examDate, EXAM_DATE_DATE_PICKER_OK_BUTTON);
    }

    public void removeExamDate() throws IOException {
        tapElement(EDIT_EXPERT_DECK_PAGE, REMOVE_EXAM_DATE);
    }

    public void removeDeckTitle() throws IOException {
        setTextAs(EDIT_EXPERT_DECK_PAGE, DECK_TITLE_TEXTFIELD, "");
    }

    public void changeFrequency(String frequency) throws IOException {
        tapElement(EDIT_EXPERT_DECK_PAGE, FREQUENCY_DROPDOWN);
        replaceXpathContentAndClickElement(EDIT_EXPERT_DECK_PAGE, FREQUENCY_DROPDOWN_VALUES_LIST, "frequency", frequency);
    }

    public void verifyDeckTitleIsVisible(String deckTitle) throws IOException {
        verifyElementAccessibilityIdTextIsVisibleAs(EXPERT_DECKS_PAGE, ADDED_DECK_TITLE, deckTitle);
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
        verifyElementAccessibilityIdTextIsVisibleAs(EDIT_EXPERT_DECK_PAGE, TIMER, expectedTimeString);
    }

    public void resetTextFields() throws IOException {
        clearText(EDIT_EXPERT_DECK_PAGE, DECK_TITLE_TEXTFIELD);
    }

    public void verifyInputFieldValue(String inputField, String text) throws IOException {
        isElementTextEquals(EDIT_EXPERT_DECK_PAGE, inputField, text);
    }

    public void tapSaveButton() throws IOException {
        tapElement(EDIT_EXPERT_DECK_PAGE, SAVE_BUTTON);
    }

    public void verifyFrequencyDropdownIsEnable(Boolean isEnabled) throws IOException {
        verifyElementIsEnable(EDIT_EXPERT_DECK_PAGE, FREQUENCY_DROPDOWN, isEnabled);
    }

    public void verifyTimerIsEnable(Boolean isEnabled) throws IOException {
        verifyElementIsEnable(EDIT_EXPERT_DECK_PAGE, TIMER, isEnabled);
    }

    public void verifyFrequencyValue(String expectedFrequency) throws IOException {
        isElementNameEqualTo(EDIT_EXPERT_DECK_PAGE, SELECTED_FREQUENCY_VALUE, expectedFrequency);
    }

}
