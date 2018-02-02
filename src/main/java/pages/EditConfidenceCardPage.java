package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class EditConfidenceCardPage extends BasePage {

    public static final String EDIT_CARD_PAGE = "CreateConfidenceCardPage";
    public static final String EDIT_CARD_TITLE = "Edit Card";
    public static final String NEW_CARD_BUTTON = "new_card_button";
    public static final String UOLOAD_FILE_BUTTON = "upload_file_button";
    public static final String EDIT_CARD_TEXTVIEW = "create_card_textview";
    public static final String FRONT_TAB = "front_tab";
    public static final String BACK_TAB = "back_tab";
    public static final String QUESTION_TEXTBOX = "question_textbox";
    public static final String ANSWER_TEXTBOX = "answer_textbox";
    public static final String SAVE_BUTTON = "save_button";
    public static final String BACK_BUTTON = "back_button";
    public static final String ALERT_OK_BUTTON = "alert_ok_button";

    public EditConfidenceCardPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyQuestion(String question) throws IOException {
        isElementTextEquals(EDIT_CARD_PAGE, QUESTION_TEXTBOX, question);
    }

    public void verifyAnswer(String answer) throws IOException {
        isElementTextEquals(EDIT_CARD_PAGE, ANSWER_TEXTBOX, answer);
    }

    public void editQuestion(String question) throws IOException {
        setTextAs(EDIT_CARD_PAGE, QUESTION_TEXTBOX, question);
    }

    public void editAnswer(String answer) throws IOException {
        setTextAs(EDIT_CARD_PAGE, ANSWER_TEXTBOX, answer);
    }

    public void selectAnswer() throws IOException {
//        MobileElement el = (MobileElement) getDriver().findElement(MobileBy.id("question4"));
//        getDriver().tap(1, el.getLocation().getX()+el.getSize().getWidth()-5, el.getLocation().getY() +5,200);
        scrollAndClick("question4");
        //setTextAs(EDIT_CARD_PAGE, ANSWER_TEXTBOX, answer);
    }

    public void clearQuestion() throws IOException {
        clearText(EDIT_CARD_PAGE, QUESTION_TEXTBOX);
    }

    public void clearAnswer() throws IOException {
        clearText(EDIT_CARD_PAGE, ANSWER_TEXTBOX);
    }

    public void verifyFailure() throws IOException {
        isFailed(EDIT_CARD_PAGE, EDIT_CARD_TEXTVIEW, EDIT_CARD_TITLE);
    }

    public void navigateBackFromEditCardPage() throws IOException {
        tapElement(EDIT_CARD_PAGE, BACK_BUTTON);
    }


}
