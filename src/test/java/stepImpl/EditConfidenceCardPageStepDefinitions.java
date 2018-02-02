package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.CreateConfidenceCardPage;
import pages.EditConfidenceCardPage;
import util.DriverSetup;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class EditConfidenceCardPageStepDefinitions {

    private EditConfidenceCardPage editConfidenceCardPage;

    public EditConfidenceCardPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            editConfidenceCardPage = PageFactory.initElements(iosDriver, EditConfidenceCardPage.class);
            return editConfidenceCardPage;
        } else {
            editConfidenceCardPage = PageFactory.initElements(androidDriver, EditConfidenceCardPage.class);
            return editConfidenceCardPage;
        }
    }

    @Step("Verify that the question is <question>")
    public void verifyQuestion(String question) throws IOException {
        pageObject().verifyQuestion(question);
    }

    @Step("Verify that the answer is <answer>")
    public void verifyAnswer(String answer) throws IOException {
        pageObject().verifyAnswer(answer);
    }

    @Step("Edit the question as follows <question>")
    public void editQuestion(String question) throws IOException {
        pageObject().clearQuestion();
        pageObject().editQuestion(question);
    }

    @Step("Edit the answer as follows <answer>")
    public void editAnswer(String answer) throws IOException {
        pageObject().clearAnswer();
        pageObject().editAnswer(answer);
    }

    @Step("Select the answer as follows")
    public void selectAnswer() throws IOException {
        pageObject().selectAnswer();
    }

    @Step("Clear the question text field")
    public void clearQuestion() throws IOException {
        pageObject().clearQuestion();
    }

    @Step("Clear the answer text field")
    public void clearAnswer() throws IOException {
        pageObject().clearAnswer();
    }

    @Step("Verify that the card was not edited successfully")
    public void verifyFailure() throws IOException {
        pageObject().verifyFailure();
    }

    @Step("Navigate back from Edit Confidence Card Page")
    public void navigateBackFromEditCardPage() throws IOException {
        pageObject().navigateBackFromEditCardPage();
    }


}
