package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


public class ExpertDeckMCQCardViewPage extends BasePage {

    WebElement mcqAnswer1 = getElementByReplacingXpathContent(EXPERT_DECK_MCQ_CARD_VIEW_PAGE, ANSWER_TEXTVIEW, "#id", "1");
    WebElement mcqAnswer2 = getElementByReplacingXpathContent(EXPERT_DECK_MCQ_CARD_VIEW_PAGE, ANSWER_TEXTVIEW, "#id", "2");
    WebElement mcqAnswer3 = getElementByReplacingXpathContent(EXPERT_DECK_MCQ_CARD_VIEW_PAGE, ANSWER_TEXTVIEW, "#id", "3");
    WebElement mcqAnswer4 = getElementByReplacingXpathContent(EXPERT_DECK_MCQ_CARD_VIEW_PAGE, ANSWER_TEXTVIEW, "#id", "4");

    public static final String EXPERT_DECK_MCQ_CARD_VIEW_PAGE = "ExDeckMCQCardViewPage";
    public static final String QUESTION_TEXTVIEW = "question_textview";
    public static final String ANSWER_TEXTVIEW = "answer_textview";
    public static final String CLOSE_BUTTON = "close_button";
    public static final String CORRECT_ICON = "correct_icon";

    public ExpertDeckMCQCardViewPage() throws IOException {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyQuestionIsVisible(String question) throws IOException {
        isElementNameEqualTo(EXPERT_DECK_MCQ_CARD_VIEW_PAGE, QUESTION_TEXTVIEW, question);
    }

    public void verifyAnswersAreVisible(int answerChoices) throws IOException {
        for (int i = 1; i<=answerChoices; i++){
            isElementVisible(getElementByReplacingXpathContent(EXPERT_DECK_MCQ_CARD_VIEW_PAGE, ANSWER_TEXTVIEW, "#id", String.valueOf(i)));
        }
    }

    public void navigateToExpertDeckCardListPage() throws IOException {
        tapElement(EXPERT_DECK_MCQ_CARD_VIEW_PAGE, CLOSE_BUTTON);
    }


}