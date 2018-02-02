package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.ExpertDeckMCQCardPracticePage;
import util.DriverSetup;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class ExpertDeckMCQCardPracticePageStepDefinitions {

    private ExpertDeckMCQCardPracticePage expertDeckMCQCardPracticePage;

    public ExpertDeckMCQCardPracticePage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            expertDeckMCQCardPracticePage = PageFactory.initElements(iosDriver, ExpertDeckMCQCardPracticePage.class);
            return expertDeckMCQCardPracticePage;
        } else {
            expertDeckMCQCardPracticePage = PageFactory.initElements(androidDriver, ExpertDeckMCQCardPracticePage.class);
            return expertDeckMCQCardPracticePage;
        }
    }

    @Step("Navigate back from MCQ practice page")
    public void navigateToMyDeckCardListPage() throws IOException {
        pageObject().navigateToMyDeckCardListPage();
    }

    @Step("Tap on <answer> as the answer choice")
    public void tapOnAnswer(String answer) throws IOException {
        pageObject().tapOnAnswer(answer);
    }

    @Step("Verify that the answer choice is <result>")
    public void isAnswerCorrect(String result) throws IOException {
        boolean isCorrect = false;
                if (result.toLowerCase().equals("correct")) {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                }
        pageObject().isAnswerCorrect(isCorrect);
    }


}
