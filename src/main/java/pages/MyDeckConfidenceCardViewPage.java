package pages;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class MyDeckConfidenceCardViewPage extends BasePage {

    public static final String MY_DECK_CONFIDENCE_CARD_VIEW_PAGE = "MyDeckConfCardViewPage";
    public static final String CARD_POSITION = "card_position";
    public static final String EDIT_CARD_BUTTON = "edit_card_button";
    public static final String FAVOURITE_BUTTON = "favourite_button";
    public static final String FAVOURITE_BUTTON_DEACTIVATED = "favourite_button_deactivated";
    public static final String QUESTION_TEXTVIEW = "question_textview";
    public static final String CORRECT_ANSWER_LABEL = "correct_answer_label";
    public static final String CORRECT_ANSWER_LABEL_VALUE = "Correct Answer";
    public static final String CORRECT_ANSWER_TEXTVIEW = "correct_answer_textview";
    public static final String CLOSE_BUTTON = "close_button";

    public MyDeckConfidenceCardViewPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyCardPosition(String cardPosition) throws IOException {
        verifyElementAccessibilityIdTextIsVisibleAs(MY_DECK_CONFIDENCE_CARD_VIEW_PAGE, CARD_POSITION, cardPosition);
    }

    public void verifyEditCardButtonIsVisible() throws IOException {
        isElementVisible(MY_DECK_CONFIDENCE_CARD_VIEW_PAGE, EDIT_CARD_BUTTON);
    }

    public void verifyQuestionIsVisible(String question) throws IOException {
        verifyElementAccessibilityIdTextIsVisibleAs(MY_DECK_CONFIDENCE_CARD_VIEW_PAGE, QUESTION_TEXTVIEW, question);
    }

    public void verifyFavouriteButtonIsVisible() throws IOException {
        if (PLATFORM.toLowerCase().equals("ios")) {
            isElementVisible(MY_DECK_CONFIDENCE_CARD_VIEW_PAGE, FAVOURITE_BUTTON_DEACTIVATED);
        } else {
            isElementVisible(MY_DECK_CONFIDENCE_CARD_VIEW_PAGE, FAVOURITE_BUTTON);
        }
    }

    public void verifyCorrectAnswerLabel() throws IOException {
        isElementNameEqualTo(MY_DECK_CONFIDENCE_CARD_VIEW_PAGE, CORRECT_ANSWER_LABEL, CORRECT_ANSWER_LABEL_VALUE);
    }

    public void verifyCorrectAnswerText(String correctAnswer) throws IOException {
        isElementNameEqualTo(MY_DECK_CONFIDENCE_CARD_VIEW_PAGE, CORRECT_ANSWER_TEXTVIEW, correctAnswer);
    }

    public void navigateToMyDeckCardListPage() throws IOException {
        tapElement(MY_DECK_CONFIDENCE_CARD_VIEW_PAGE, CLOSE_BUTTON);
    }


}
