package pages;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


//TODO created by supun
public class MyDeckMCQCardViewPage extends BasePage{

    public static final String MY_DECK_MCQ_CARD_VIEW_PAGE = "MyDeckMCQCardViewPage";
    public static final String CARD_POSITION = "card_position";
    public static final String EDIT_CARD_BUTTON = "edit_card_button";
    public static final String FAVOURITE_BUTTON = "favourite_button";
    public static final String QUESTION_TEXTVIEW = "question_textview";
    public static final String QUESTION_WEBVIEW = "question_webview";
    public static final String ANSWER_CONTAINER = "correct_answer_label";
    public static final String ANSWER_TEXTVIEW = "correct_answer_textview";
    public static final String CLOSE_BUTTON = "close_button";

    public MyDeckMCQCardViewPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyCardPosition(String cardPosition) throws IOException {
        verifyElementAccessibilityIdTextIsVisibleAs(MY_DECK_MCQ_CARD_VIEW_PAGE, CARD_POSITION, cardPosition);
    }

    public void verifyEditCardButtonIsVisible() throws IOException {
        isElementVisible(MY_DECK_MCQ_CARD_VIEW_PAGE, EDIT_CARD_BUTTON);
    }

    public void verifyQuestionIsVisible(String question) throws IOException {
        verifyElementAccessibilityIdTextIsVisibleAs(MY_DECK_MCQ_CARD_VIEW_PAGE, QUESTION_TEXTVIEW, question);
    }

    public void verifyFavouriteButtonIsVisible() throws IOException {
        isElementVisible(MY_DECK_MCQ_CARD_VIEW_PAGE, FAVOURITE_BUTTON);
    }

    public void navigateToMyDeckCardListPage() throws IOException {
        tapElement(MY_DECK_MCQ_CARD_VIEW_PAGE, CLOSE_BUTTON);
    }

}
