package pages;

import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


public class ExpertDeckMCQCardPracticePage extends BasePage {

    public static final String MY_DECK_MCQ_PRACTICE_PAGE = "ExDeckMCQPracticePage";
    public static final String QUESTION_TEXTVIEW = "question_textview";
    public static final String ANSWER_TEXTVIEW = "answer_textview";
    public static final String CARD_VIEW = "card_flipview";
    public static final String CORRECT_ICON = "correct_icon";
    public static final String INCORRECT_ICON = "incorrect_icon";
    public static final String CLOSE_BUTTON = "close_button";

    public ExpertDeckMCQCardPracticePage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyQuestionIsVisible(String question) throws IOException {
        isElementNameEqualTo(MY_DECK_MCQ_PRACTICE_PAGE, QUESTION_TEXTVIEW, question);
    }

    public void tapOnAnswer(String answer) throws IOException {
        scrollAndClick(answer);
    }

    public void isAnswerCorrect(boolean isCorrect) throws IOException {
        if (isCorrect){
            isElementVisible(MY_DECK_MCQ_PRACTICE_PAGE, CORRECT_ICON);
        }else{
            isElementVisible(MY_DECK_MCQ_PRACTICE_PAGE, INCORRECT_ICON);
        }
    }

    public void navigateToMyDeckCardListPage() throws IOException {
        tapElement(MY_DECK_MCQ_PRACTICE_PAGE, CLOSE_BUTTON);
    }


}