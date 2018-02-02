package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.ExpertDeckConfidenceCardPracticePage;
import pages.MyDeckConfidenceCardPracticePage;
import util.DriverSetup;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


public class MyDeckConfidenceCardPracticePageStepDefinitions {

    private MyDeckConfidenceCardPracticePage myDeckConfidenceCardPracticePage;

    public MyDeckConfidenceCardPracticePage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            myDeckConfidenceCardPracticePage = PageFactory.initElements(iosDriver, MyDeckConfidenceCardPracticePage.class);
            return myDeckConfidenceCardPracticePage;
        } else {
            myDeckConfidenceCardPracticePage = PageFactory.initElements(androidDriver, MyDeckConfidenceCardPracticePage.class);
            return myDeckConfidenceCardPracticePage;
        }
    }

    @Step("Verify that the My Deck Practice Confidence card question is <question>")
    public void verifyQuestionIsVisible(String question) throws IOException {
        pageObject().verifyQuestionIsVisible(question);
    }

    @Step("Tap on My Deck Confidence Card View")
    public void tapOnCard() throws IOException {
        pageObject().flipCard();
    }

    @Step("Verify that the My Deck Practice Confidence card answer is <answer>")
    public void verifyAnswerIsVisible(String answer) throws IOException {
        pageObject().verifyAnswerIsVisible(answer);
    }

    @Step("Verify that the answer can be given to the My Deck Practice Confidence card")
    public void verifyAnswerButtons() throws IOException {
        pageObject().verifyAnswerButtons();
    }

    @Step("Answer for the My Deck Practice Confidence card is <isCorrect>")
    public void answerCardCorrectly(String isCorrect) throws IOException {
        if(isCorrect.toLowerCase().equals("correct")){
            pageObject().verifyAnswerCard(true);
        }else{
            pageObject().verifyAnswerCard(false);
        }
    }


}
