package stepImpl;

import org.openqa.selenium.support.PageFactory;
import pages.MyDeckMCQCardViewPage;
import util.DriverSetup;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;

public class MyDeckMCQCardViewPageStepDefinitions {

    private MyDeckMCQCardViewPage myDeckMCQCardViewPage;

    public MyDeckMCQCardViewPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            myDeckMCQCardViewPage = PageFactory.initElements(iosDriver, MyDeckMCQCardViewPage.class);
            return myDeckMCQCardViewPage;
        } else {
            myDeckMCQCardViewPage = PageFactory.initElements(androidDriver, MyDeckMCQCardViewPage.class);
            return myDeckMCQCardViewPage;
        }
    }

  /*  @Step("Verify that the position of the card is <cardPosition>")
    public void verifyCardPosition(String cardPosition) throws IOException {
        pageObject().verifyCardPosition(cardPosition);
    }

    @Step("Verify that the Edit Card Button is visible")
    public void verifyEditCardButtonIsVisible() throws IOException {
        pageObject().verifyEditCardButtonIsVisible();
    }

    @Step("Verify that the <question> Question is visible")
    public void verifyQuestionIsVisible(String question) throws IOException {
        pageObject().verifyQuestionIsVisible(question);
    }

    @Step("Verify that the Favourite button is visible")
    public void verifyFavouriteButtonIsVisible() throws IOException {
        pageObject().verifyFavouriteButtonIsVisible();
    }

    @Step("Verify that the Correct Answer label is visible")
    public void verifyCorrectAnswerLabel() throws IOException {
        pageObject().verifyCorrectAnswerLabel();
    }

    @Step("Verify that the Correct Answer is <correctAnswer>")
    public void verifyCorrectAnswerText(String correctAnswer) throws IOException {
        pageObject().verifyCorrectAnswerText(correctAnswer);
    }

    @Step("Navigate back from My Deck Card View page")
    public void navigateToMyDeckCardListPage() throws IOException {
        pageObject().navigateToMyDeckCardListPage();
    }*/

}
