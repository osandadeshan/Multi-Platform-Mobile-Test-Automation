package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.FeedbackPage;
import pages.PracticeFillinCardPage;
import util.DriverSetup;

import java.io.IOException;

import static pages.FeedbackPage.FEEDBACK_PAGE;
import static pages.FeedbackPage.FEEDBACK_PAGE_TITLE_TEXTVIEW;
import static pages.SettingsPage.SETTINGS_PAGE;
import static pages.SettingsPage.SETTINGS_TITLE_TEXTVIEW;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class PracticeFillinCardPageStepDefinitions {

    private PracticeFillinCardPage practiceFillinCardPage;
    private static final String FEEDBACK_PAGE_TITLE = "Feedback";
    private static final String SETTINGS_PAGE_TITLE = "Settings";

    public PracticeFillinCardPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            practiceFillinCardPage = PageFactory.initElements(iosDriver, PracticeFillinCardPage.class);
            return practiceFillinCardPage;
        } else {
            practiceFillinCardPage = PageFactory.initElements(androidDriver, PracticeFillinCardPage.class);
            return practiceFillinCardPage;
        }
    }

    @Step("Verify that the Question TextView is visible")
    public void isQuestionTextViewVisible() throws IOException {
        pageObject().isQuestionTextViewVisible();
    }

    @Step("Verify that the Answer TextBox is visible")
    public void isAnswerTextBoxVisible() throws IOException {
        pageObject().isAnswerTextBoxVisible();
    }

    @Step("Set Answer as <answer>")
    public void setAnswer(String answer) throws IOException {
        pageObject().setAnswer(answer);
    }

    @Step("Close the current practice session")
    public void closeSession() throws IOException {
        pageObject().closeSession();
    }


}
