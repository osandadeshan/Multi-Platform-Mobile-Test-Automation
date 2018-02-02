package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class CreateConfidenceCardPage extends BasePage {

    public static final String CREATE_CONFIDENCE_CARD_PAGE = "CreateConfidenceCardPage";
    public static final String CREATE_CARD_TITLE = "Create Card";
    public static final String NEW_CARD_BUTTON = "new_card_button";
    public static final String UOLOAD_FILE_BUTTON = "upload_file_button";
    public static final String CREATE_CARD_TEXTVIEW = "create_card_textview";
    public static final String FRONT_TAB = "front_tab";
    public static final String BACK_TAB = "back_tab";
    public static final String QUESTION_TEXTBOX = "question_textbox";
    public static final String ANSWER_TEXTBOX = "answer_textbox";
    public static final String SAVE_BUTTON = "save_button";
    public static final String BACK_BUTTON = "back_button";
    public static final String ALERT_OK_BUTTON = "alert_ok_button";

    public CreateConfidenceCardPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void tapOnNewCardButton() throws IOException {
        tapElement(CREATE_CONFIDENCE_CARD_PAGE, NEW_CARD_BUTTON);
    }

    public void verifyFrontTabIsSelected() throws IOException {
        if (PLATFORM.toLowerCase().equals("ios")) {
            //isElementValueEqualTo(CREATE_CONFIDENCE_CARD_PAGE, FRONT_TAB, "1");
        } else {
            isElementAttributeValueEqualTo(CREATE_CONFIDENCE_CARD_PAGE, FRONT_TAB, "selected", "true");
        }
    }

    public void verifyQuestionTextBoxIsVisible() throws IOException {
        freeze(2);
        isElementVisible(CREATE_CONFIDENCE_CARD_PAGE, QUESTION_TEXTBOX);
    }

    public void enterQuestion(String question) throws IOException {
        setTextAs(CREATE_CONFIDENCE_CARD_PAGE, QUESTION_TEXTBOX, question);
    }

    public void navigateToBackTab() throws IOException {
        tapElement(CREATE_CONFIDENCE_CARD_PAGE, BACK_TAB);
    }

    public void verifyBackTabIsSelected() throws IOException {
        if (PLATFORM.toLowerCase().equals("ios")){
            isElementValueEqualTo(CREATE_CONFIDENCE_CARD_PAGE, BACK_TAB, "1");
        } else {
            isElementAttributeValueEqualTo(CREATE_CONFIDENCE_CARD_PAGE, BACK_TAB, "selected", "true");
        }
    }

    public void verifyAnswerTextBoxIsVisible() throws IOException {
        isElementVisible(CREATE_CONFIDENCE_CARD_PAGE, ANSWER_TEXTBOX);
    }

    public void enterAnswer(String answer) throws IOException {
        setTextAs(CREATE_CONFIDENCE_CARD_PAGE, ANSWER_TEXTBOX, answer);
    }

    public void navigateToFrontTab() throws IOException {
        tapElement(CREATE_CONFIDENCE_CARD_PAGE, FRONT_TAB);
    }

    public void tapOnSaveButton() throws IOException {
        if (PLATFORM.toLowerCase().equals("ios")){
            tapElement(CREATE_CONFIDENCE_CARD_PAGE, SAVE_BUTTON);
            freeze(2);
            tapElement(CREATE_CONFIDENCE_CARD_PAGE, ALERT_OK_BUTTON);
        } else {
            tapElement(CREATE_CONFIDENCE_CARD_PAGE, SAVE_BUTTON);
        }
    }

    public void verifyFailure() throws IOException {
        isFailed(CREATE_CONFIDENCE_CARD_PAGE, CREATE_CARD_TEXTVIEW, CREATE_CARD_TITLE);
    }

    public void navigateBackFromCreateCardPage() throws IOException {
        tapElement(CREATE_CONFIDENCE_CARD_PAGE, BACK_BUTTON);
    }


}
