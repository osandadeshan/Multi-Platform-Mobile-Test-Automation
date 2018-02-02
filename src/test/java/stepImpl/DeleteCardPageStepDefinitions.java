package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.DeleteCardPage;
import util.DriverSetup;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


public class DeleteCardPageStepDefinitions {

    private DeleteCardPage deleteCardPage;

    public DeleteCardPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            deleteCardPage = PageFactory.initElements(iosDriver, DeleteCardPage.class);
            return deleteCardPage;
        } else {
            deleteCardPage = PageFactory.initElements(androidDriver, DeleteCardPage.class);
            return deleteCardPage;
        }
    }

    @Step("Tap on OK button in Delete Card Alert Box")
    public void tapOnOK() throws IOException {
        pageObject().confirmDelete();
    }

    @Step("Tap on Cancel button in Delete Card Alert Box")
    public void tapOnCancel() throws IOException {
        pageObject().cancelDelete();
    }

    @Step("Verify Alert Box title is <alertTitle>")
    public void verifyAlertTitle(String alertTitle) throws IOException {
        pageObject().verifyAlertTitle(alertTitle);
    }

    @Step("Verify Alert Box Message is <alertMessage>")
    public void verifyAlertMessage(String alertMessage) throws IOException {
        pageObject().verifyAlertMessage(alertMessage);
    }


}
