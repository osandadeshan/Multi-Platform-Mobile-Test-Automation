package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.ExpertDeckConfidenceCardViewPage;
import pages.ExpertDeckMCQCardViewPage;
import util.DriverSetup;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class ExpertDeckMCQCardViewPageStepDefinitions {

    private ExpertDeckMCQCardViewPage expertDeckMCQCardViewPage;

    public ExpertDeckMCQCardViewPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            expertDeckMCQCardViewPage = PageFactory.initElements(iosDriver, ExpertDeckMCQCardViewPage.class);
            return expertDeckMCQCardViewPage;
        } else {
            expertDeckMCQCardViewPage = PageFactory.initElements(androidDriver, ExpertDeckMCQCardViewPage.class);
            return expertDeckMCQCardViewPage;
        }
    }

    @Step("Verify that the <question> MCQ Question is visible")
    public void verifyQuestionIsVisible(String question) throws IOException {
        pageObject().verifyQuestionIsVisible(question);
    }

    @Step("Navigate back from MCQ Card View page")
    public void navigateToExpertDeckCardListPage() throws IOException {
        pageObject().navigateToExpertDeckCardListPage();
    }

    @Step("Verify that the MCQ Card contains <answerChoices> answer choices")
    public void verifyAnswersAreVisible(String answerChoices) throws IOException {
        pageObject().verifyAnswersAreVisible(Integer.valueOf(answerChoices));
    }


}
