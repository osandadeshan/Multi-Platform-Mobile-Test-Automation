package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.CreateConfidenceCardPage;
import util.DriverSetup;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class CreateConfidenceCardPageStepDefinitions {

    private CreateConfidenceCardPage createConfidenceCardPage;

    public CreateConfidenceCardPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            createConfidenceCardPage = PageFactory.initElements(iosDriver, CreateConfidenceCardPage.class);
            return createConfidenceCardPage;
        } else {
            createConfidenceCardPage = PageFactory.initElements(androidDriver, CreateConfidenceCardPage.class);
            return createConfidenceCardPage;
        }
    }

    @Step("Navigate to Create Confidence Card page")
    public void navigateToCreateCardPage() throws IOException {
        pageObject().tapOnNewCardButton();
    }

    @Step("Verify that the Front tab is selected as default")
    public void verifyFrontTabIsSelected() throws IOException {
        pageObject().verifyFrontTabIsSelected();
    }

    @Step("Verify that the Question text box is visible")
    public void verifyQuestionTextBoxIsVisible() throws IOException {
        pageObject().verifyQuestionTextBoxIsVisible();
    }

    @Step("Enter a question as follows <question>")
    public void enterQuestion(String question) throws IOException {
        pageObject().enterQuestion(question);
    }

    @Step("Navigate to Back tab")
    public void navigateToBackTab() throws IOException {
        pageObject().navigateToBackTab();
    }

    @Step("Verify that the Back tab is selected")
    public void verifyBackTabIsSelected() throws IOException {
        pageObject().verifyBackTabIsSelected();
    }

    @Step("Verify that the Answer text box is visible")
    public void verifyAnswerTextBoxIsVisible() throws IOException {
        pageObject().verifyAnswerTextBoxIsVisible();
    }

    @Step("Enter an answer as follows <answer>")
    public void enterAnswer(String answer) throws IOException {
        pageObject().enterAnswer(answer);
    }

    @Step("Navigate to Front tab")
    public void navigateToFrontTab() throws IOException {
        pageObject().navigateToFrontTab();
    }

    @Step("Save the card")
    public void tapOnSaveButton() throws IOException {
        pageObject().tapOnSaveButton();
    }

    @Step("Verify that the card was not saved successfully")
    public void verifyFailure() throws IOException {
        pageObject().verifyFailure();
    }

    @Step("Navigate back from Create Confidence Card Page")
    public void navigateBackFromCreateCardPage() throws IOException {
        pageObject().navigateBackFromCreateCardPage();
    }


}
