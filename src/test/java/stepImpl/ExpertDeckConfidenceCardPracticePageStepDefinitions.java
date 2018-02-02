package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.ExpertDeckConfidenceCardPracticePage;
import util.DriverSetup;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;

public class ExpertDeckConfidenceCardPracticePageStepDefinitions {

    private ExpertDeckConfidenceCardPracticePage expertDeckConfidenceCardPracticePage;

    public ExpertDeckConfidenceCardPracticePage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            expertDeckConfidenceCardPracticePage = PageFactory.initElements(iosDriver, ExpertDeckConfidenceCardPracticePage.class);
            return expertDeckConfidenceCardPracticePage;
        } else {
            expertDeckConfidenceCardPracticePage = PageFactory.initElements(androidDriver, ExpertDeckConfidenceCardPracticePage.class);
            return expertDeckConfidenceCardPracticePage;
        }
    }

    @Step("Verify that the Expert Deck Practice Confidence card question is <question>")
    public void verifyQuestionIsVisible(String question) throws IOException {
        pageObject().verifyQuestionIsVisible(question);
    }

    @Step("Tap on Expert Deck Confidence Card View")
    public void tapOnCard() throws IOException {
        pageObject().flipCard();
    }

    @Step("Verify that the Expert Deck Practice Confidence card answer is <answer>")
    public void verifyAnswerIsVisible(String answer) throws IOException {
        pageObject().verifyAnswerIsVisible(answer);
    }

    @Step("Verify that the answer can be given to the Expert Deck Practice Confidence card")
    public void verifyAnswerButtons() throws IOException {
        pageObject().verifyAnswerButtons();
    }

    @Step("Answer for the Expert Deck Practice Confidence card is <isCorrect>")
    public void answerCardCorrectly(String isCorrect) throws IOException {
        if(isCorrect.toLowerCase().equals("correct")){
            pageObject().verifyAnswerCard(true);
        }else{
            pageObject().verifyAnswerCard(false);
        }
    }

    @Step("Navigate back from the practice view")
    public void navigateBack() throws IOException {
        pageObject().navigateBack();
    }


}
