package pages;

import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class CreateAccountPage extends BasePage {

    public static final String CREATE_ACCOUNT_PAGE = "CreateAccountPage";
    public static final String CREATE_ACCOUNT_TITLE_TEXTVIEW = "create_account_page_title_textview";
    public static final String FIRST_NAME_TEXTBOX = "first_name_textbox";
    public static final String LAST_NAME_TEXTBOX = "last_name_textbox";
    public static final String EMAIL_TEXTBOX = "email_textbox";
    public static final String USERNAME_TEXTBOX = "username_textbox";
    public static final String PASSWORD_TEXTBOX = "password_textbox";
    public static final String RE_ENTER_PASSWORD_TEXTBOX = "re_enter_password_textbox";
    public static final String PRIVACY_POLICY_AND_TERMS_OF_USE_CHECK_BOX = "privacy_policy_and_terms_of_use_check_box";
    public static final String PRIVACY_POLICY_AND_TERMS_OF_USE_TEXTVIEW = "privacy_policy_and_terms_of_use_textview";
    public static final String AGE_CONFIRMATION_CHECK_BOX = "age_confirm_check_box";
    public static final String CREATE_ACCOUNT_BUTTON = "create_account_button";
    public static final String ALERT_TITLE = "alert_title";
    public static final String SUCCESS = "Success";
    public static final String SUCCESS_MESSAGE = "New user account created";
    public static final String ALERT_MESSAGE = "alert_message";
    public static final String OK_BUTTON = "ok_button";
    public static final String BACK_BUTTON = "back_button";

    public CreateAccountPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void verifyAllElements() throws IOException {
        isElementVisible(CREATE_ACCOUNT_PAGE, FIRST_NAME_TEXTBOX);
        isElementVisible(CREATE_ACCOUNT_PAGE, LAST_NAME_TEXTBOX);
        isElementVisible(CREATE_ACCOUNT_PAGE, EMAIL_TEXTBOX);
        isElementVisible(CREATE_ACCOUNT_PAGE, USERNAME_TEXTBOX);
        isElementVisible(CREATE_ACCOUNT_PAGE, PASSWORD_TEXTBOX);
        isElementVisible(CREATE_ACCOUNT_PAGE, RE_ENTER_PASSWORD_TEXTBOX);
        isElementVisible(CREATE_ACCOUNT_PAGE, PRIVACY_POLICY_AND_TERMS_OF_USE_CHECK_BOX);
        isElementVisible(CREATE_ACCOUNT_PAGE, PRIVACY_POLICY_AND_TERMS_OF_USE_TEXTVIEW);
        isElementVisible(CREATE_ACCOUNT_PAGE, CREATE_ACCOUNT_BUTTON);
    }

    public void fillCreateAccountDetails(String firstName, String lastName, String email, String username, String password, String reEnterPassword, String isPrivacyPolicyConfirmed) throws IOException {
        setTextAs(CREATE_ACCOUNT_PAGE, FIRST_NAME_TEXTBOX, firstName);
        setTextAs(CREATE_ACCOUNT_PAGE, LAST_NAME_TEXTBOX, lastName);
        setTextAs(CREATE_ACCOUNT_PAGE, EMAIL_TEXTBOX, email);
        setTextAs(CREATE_ACCOUNT_PAGE, USERNAME_TEXTBOX, username);
        setTextAs(CREATE_ACCOUNT_PAGE, PASSWORD_TEXTBOX, password);
        setTextAs(CREATE_ACCOUNT_PAGE, RE_ENTER_PASSWORD_TEXTBOX, reEnterPassword);
        if (Boolean.valueOf(isPrivacyPolicyConfirmed.toUpperCase()) == Boolean.TRUE){
            tapElement(CREATE_ACCOUNT_PAGE, PRIVACY_POLICY_AND_TERMS_OF_USE_CHECK_BOX);
        }
    }

    public void resetTextFields() throws IOException {
        clearText(CREATE_ACCOUNT_PAGE, FIRST_NAME_TEXTBOX);
        clearText(CREATE_ACCOUNT_PAGE, LAST_NAME_TEXTBOX);
        clearText(CREATE_ACCOUNT_PAGE, EMAIL_TEXTBOX);
        clearText(CREATE_ACCOUNT_PAGE, USERNAME_TEXTBOX);
        clearText(CREATE_ACCOUNT_PAGE, PASSWORD_TEXTBOX);
        clearText(CREATE_ACCOUNT_PAGE, RE_ENTER_PASSWORD_TEXTBOX);
    }

    public void clickCreateAccountButton() throws IOException {
        tapElement(CREATE_ACCOUNT_PAGE, CREATE_ACCOUNT_BUTTON);
    }

    public Boolean isAccountCreationSuccess() throws IOException {
        Boolean isSuccess;
        try {
            freeze(3);
            isElementNameEqualTo(CREATE_ACCOUNT_PAGE, ALERT_TITLE, SUCCESS);
            isElementNameEqualTo(CREATE_ACCOUNT_PAGE, ALERT_MESSAGE, SUCCESS_MESSAGE);
            tapElement(CREATE_ACCOUNT_PAGE, OK_BUTTON);
            isSuccess = Boolean.TRUE;
        } catch (Exception ex) {
            isSuccess = Boolean.FALSE;
        }
        return isSuccess;
    }

    public void navigateBackFromCreateAccountPage() throws IOException {
        tapElement(CREATE_ACCOUNT_PAGE, BACK_BUTTON);
    }


}
