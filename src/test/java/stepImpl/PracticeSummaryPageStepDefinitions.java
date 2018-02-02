package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.PracticeFillinCardPage;
import pages.PracticeSummaryPage;
import util.DriverSetup;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class PracticeSummaryPageStepDefinitions {

    private PracticeSummaryPage practiceSummaryPage;

    public PracticeSummaryPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            practiceSummaryPage = PageFactory.initElements(iosDriver, PracticeSummaryPage.class);
            return practiceSummaryPage;
        } else {
            practiceSummaryPage = PageFactory.initElements(androidDriver, PracticeSummaryPage.class);
            return practiceSummaryPage;
        }
    }

    @Step("Verify that the correct count is <correctCount>")
    public void isCorrectCountEqualTo(String correctCount) throws IOException {
        pageObject().isCorrectCountEqualTo(correctCount);
    }

    @Step("Verify that the incorrect count is <incorrectCount>")
    public void isIncorrectCountEqualTo(String incorrectCount) throws IOException {
        pageObject().isIncorrectCountEqualTo(incorrectCount);
    }

    @Step("Tap on Home button on Practice Summary page")
    public void tapOnHomeButton() throws IOException {
        pageObject().tapOnHomeButton();
    }


}
