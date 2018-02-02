package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.FeedbackPage;
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


public class FeedbackPageStepDefinitions {

    private FeedbackPage feedbackPage;
    private static final String FEEDBACK_PAGE_TITLE = "Feedback";
    private static final String SETTINGS_PAGE_TITLE = "Settings";

    public FeedbackPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            feedbackPage = PageFactory.initElements(iosDriver, FeedbackPage.class);
            return feedbackPage;
        } else {
            feedbackPage = PageFactory.initElements(androidDriver, FeedbackPage.class);
            return feedbackPage;
        }
    }

    @Step("Select the emoji of <emojiName>")
    public void setEmoji(String emojiName) throws IOException {
        pageObject().setEmoji(emojiName);
    }

    @Step("Enter a comment as <commentText>")
    public void addComment(String commentText) throws IOException {
        pageObject().addComment(commentText);
    }

    @Step("Click send button")
    public void clickSendButton() throws IOException {
        pageObject().clickSendButton();
    }

    @Step("Click email send button")
    public void clickEmailSendButton() throws IOException {
        pageObject().clickEmailSendButton();
    }

    @Step("Verify the feedback is not sent")
    public void verifyFeedbackFailed() throws IOException {
        pageObject().freeze(2);
        pageObject().isPageTitleEqualTo(FEEDBACK_PAGE, FEEDBACK_PAGE_TITLE_TEXTVIEW, FEEDBACK_PAGE_TITLE);
    }

    @Step("Verify the feedback has sent")
    public void verifyFeedbackSuccess() throws IOException {
        pageObject().freeze(2);
        pageObject().isPageTitleEqualTo(SETTINGS_PAGE, SETTINGS_TITLE_TEXTVIEW, SETTINGS_PAGE_TITLE);
    }

    @Step("Navigate back from Feedback page")
    public void navigateBackFromFeedbackPage() throws IOException {
        pageObject().navigateBackFromFeedbackPage();
    }


}
