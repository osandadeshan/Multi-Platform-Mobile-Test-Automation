package pages;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


public class PracticeFillinCardPage extends BasePage {

    public static final String PRACTICE_FILLIN_CARD_PAGE = "PracticeFillinCardPage";
    public static final String QUESTION_TEXTVIEW = "question_textview";
    public static final String ANSWER_TEXTBOX = "answer_textbox";
    public static final String CLOSE_BUTTON = "close_button";

    public PracticeFillinCardPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void isQuestionTextViewVisible() throws IOException {
        isElementVisible(PRACTICE_FILLIN_CARD_PAGE, QUESTION_TEXTVIEW);
    }

    public void isAnswerTextBoxVisible() throws IOException {
        isElementVisible(PRACTICE_FILLIN_CARD_PAGE, ANSWER_TEXTBOX);
    }

    public void setAnswer(String answer) throws IOException {
        setTextAs(PRACTICE_FILLIN_CARD_PAGE, ANSWER_TEXTBOX, answer);
    }

    public void closeSession() throws IOException {
        tapElement(PRACTICE_FILLIN_CARD_PAGE, CLOSE_BUTTON);
    }



}
