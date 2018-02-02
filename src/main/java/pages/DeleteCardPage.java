package pages;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


public class DeleteCardPage extends BasePage {

    public static final String DELETE_CARD_PAGE = "DeleteCardPage";
    public static final String YES_BUTTON = "alert_box_ok_button";
    public static final String NO_BUTTON = "alert_box_cancel_button";
    public static final String ALERTBOX_TITLE = "alert_box_title";
    public static final String ALERTBOX_MESSAGE = "alert_box_message";

    public DeleteCardPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void confirmDelete() throws IOException {
        freeze(2);
        tapElement(DELETE_CARD_PAGE, YES_BUTTON);
        freeze(2);
    }

    public void cancelDelete() throws IOException {
        freeze(2);
        tapElement(DELETE_CARD_PAGE, NO_BUTTON);
    }

    public void verifyAlertTitle(String alertTitle) throws IOException {
        freeze(2);
        if (PLATFORM.toLowerCase().equals("ios")) {
            verifyElementAccessibilityIdTextIsVisibleAs(DELETE_CARD_PAGE, ALERTBOX_TITLE, alertTitle);
        } else {
            isElementTextEquals(DELETE_CARD_PAGE, ALERTBOX_TITLE, alertTitle);
        }
    }

    public void verifyAlertMessage(String alertMessage) throws IOException {
        freeze(2);
        if (PLATFORM.toLowerCase().equals("ios")) {
            verifyElementAccessibilityIdTextIsVisibleAs(DELETE_CARD_PAGE, ALERTBOX_MESSAGE, alertMessage);
        } else {
            isElementTextEquals(DELETE_CARD_PAGE, ALERTBOX_MESSAGE, alertMessage);
        }
    }
}
