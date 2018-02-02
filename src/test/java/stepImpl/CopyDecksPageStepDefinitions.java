package stepImpl;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.support.PageFactory;
import pages.CopyDecksPage;
import pages.MyDecksPage;
import util.DriverSetup;

import java.io.IOException;
import java.util.List;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class CopyDecksPageStepDefinitions {

    private CopyDecksPage copyDecksPage;

    public CopyDecksPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            copyDecksPage = PageFactory.initElements(iosDriver, CopyDecksPage.class);
            return copyDecksPage;
        } else {
            copyDecksPage = PageFactory.initElements(androidDriver, CopyDecksPage.class);
            return copyDecksPage;
        }
    }

    @Step("Tap on Create New Deck button")
    public void tapOnCreateNewDeckButton() throws IOException {
        pageObject().tapOnCreateNewDeckButton();
    }

    @Step("Tap on Copy Now button")
    public void tapOnCopyNowButton() throws IOException {
        pageObject().tapOnCopyNowButton();
    }

    @Step("An Alert box should be visible")
    public void isAlertVisible() throws IOException {
        pageObject().isAlertVisible();
    }

    @Step("Alert message should be <alertMessage>")
    public void isAlertMessageEquals(String alertMessage) throws IOException {
        pageObject().isAlertMessageEquals(alertMessage);
    }

    @Step("Tap on Ok button")
    public void tapOnAlertOkButton() throws IOException {
        pageObject().tapOnAlertOkButton();
    }

}
