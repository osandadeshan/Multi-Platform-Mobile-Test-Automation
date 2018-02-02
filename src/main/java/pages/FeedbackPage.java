package pages;

import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class FeedbackPage extends BasePage {

    public static final String FEEDBACK_PAGE = "FeedbackPage";
    public static final String FEEDBACK_PAGE_TITLE_TEXTVIEW = "feedback_page_title_textview";
    public static final String AWESOME = "awesome";
    public static final String AWESOME_ICON = "awesome_icon";
    public static final String PRETTY_GOOD = "pretty good";
    public static final String PRETTY_GOOD_ICON = "pretty_good_icon";
    public static final String TERRIBLE = "terrible";
    public static final String TERRIBLE_ICON = "terrible_icon";
    public static final String COMMENT_TEXTBOX = "comment_textbox";
    public static final String SEND_BUTTON = "send_button";
    public static final String EMAIL_SEND_BUTTON = "email_send_button";
    public static final String BACK_BUTTON = "back_button";

    public FeedbackPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void setEmoji(String emojiName) throws IOException {
        if (emojiName.toLowerCase().equals(AWESOME)){
                getElement(FEEDBACK_PAGE, AWESOME_ICON).click();
        } else if (emojiName.toLowerCase().equals(PRETTY_GOOD)) {
            getElement(FEEDBACK_PAGE, PRETTY_GOOD_ICON).click();
        } else if (emojiName.toLowerCase().equals(TERRIBLE)) {
            getElement(FEEDBACK_PAGE, TERRIBLE_ICON).click();
        } else {
            emojiName = "";
        }
    }

    public void addComment(String commentText) throws IOException {
        getElement(FEEDBACK_PAGE, COMMENT_TEXTBOX).sendKeys(commentText);
    }

    public void clickSendButton() throws IOException {
        scrollDown();
        getElement(FEEDBACK_PAGE, SEND_BUTTON).click();
    }

    public void clickEmailSendButton() throws IOException {
        tapElement(FEEDBACK_PAGE, EMAIL_SEND_BUTTON);
        freeze(3);
    }

    public void navigateBackFromFeedbackPage() throws IOException {
        getElement(FEEDBACK_PAGE, BACK_BUTTON).click();
    }


}
