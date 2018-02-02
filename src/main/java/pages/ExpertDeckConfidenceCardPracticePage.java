package pages;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


public class ExpertDeckConfidenceCardPracticePage extends BasePage {

    public static final String EXPERT_DECK_CONFIDENCE_CARD_PRACTICE_PAGE = "ExDeckConfCardPractPage";
    public static final String QUESTION_TEXTVIEW = "question_textview";
    public static final String ANSWER_TEXTVIEW = "answer_textview";
    public static final String CARD_VIEW = "card_flipview";
    public static final String CORRECT_BUTTON = "correct_button";
    public static final String INCORRECT_BUTTON = "incorrect_button";
    public static final String BACK_BUTTON = "back_button";

    public ExpertDeckConfidenceCardPracticePage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyQuestionIsVisible(String question) throws IOException {
        isElementNameEqualTo(EXPERT_DECK_CONFIDENCE_CARD_PRACTICE_PAGE, QUESTION_TEXTVIEW, question);
    }

    public void flipCard() throws IOException {
        tapElement(EXPERT_DECK_CONFIDENCE_CARD_PRACTICE_PAGE, CARD_VIEW);
    }

    public void verifyAnswerIsVisible(String answer) throws IOException {
        isElementNameEqualTo(EXPERT_DECK_CONFIDENCE_CARD_PRACTICE_PAGE, ANSWER_TEXTVIEW, answer);
    }

    public void verifyAnswerCard(boolean isCorrect) throws IOException {
        if (isCorrect){
            tapElement(EXPERT_DECK_CONFIDENCE_CARD_PRACTICE_PAGE, CORRECT_BUTTON);
        }else{
            tapElement(EXPERT_DECK_CONFIDENCE_CARD_PRACTICE_PAGE, INCORRECT_BUTTON);
        }
    }

    public void verifyAnswerButtons() throws IOException {
        isElementVisible(EXPERT_DECK_CONFIDENCE_CARD_PRACTICE_PAGE, CORRECT_BUTTON );
        isElementVisible(EXPERT_DECK_CONFIDENCE_CARD_PRACTICE_PAGE, INCORRECT_BUTTON );
    }

    public void navigateBack() throws IOException {
        tapElement(EXPERT_DECK_CONFIDENCE_CARD_PRACTICE_PAGE, BACK_BUTTON);
    }

}