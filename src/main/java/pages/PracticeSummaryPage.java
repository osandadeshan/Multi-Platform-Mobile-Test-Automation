package pages;

import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


public class PracticeSummaryPage extends BasePage {

    public static final String PRACTICE_SUMMARY_PAGE = "PracticeSummaryPage";
    public static final String CORRECT_COUNT = "correct_count";
    public static final String INCORRECT_COUNT = "incorrect_count";
    public static final String HOME_BUTTON = "home_button";
    public static final String CLOSE_BUTTON = "close_button";

    public PracticeSummaryPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void isCorrectCountEqualTo(String correctCount) throws IOException {
        isElementTextEquals(PRACTICE_SUMMARY_PAGE, CORRECT_COUNT, correctCount);
    }

    public void isIncorrectCountEqualTo(String incorrectCount) throws IOException {
        isElementTextEquals(PRACTICE_SUMMARY_PAGE, INCORRECT_COUNT, incorrectCount);
    }

    public void tapOnHomeButton() throws IOException {
        tapElement(PRACTICE_SUMMARY_PAGE, HOME_BUTTON);
    }

    public void closeSession() throws IOException {
        tapElement(PRACTICE_SUMMARY_PAGE, CLOSE_BUTTON);
    }



}
