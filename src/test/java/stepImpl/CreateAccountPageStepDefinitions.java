package stepImpl;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.CreateAccountPage;
import util.DriverSetup;
import java.io.IOException;
import java.util.List;
import static pages.CreateAccountPage.CREATE_ACCOUNT_PAGE;
import static pages.CreateAccountPage.CREATE_ACCOUNT_TITLE_TEXTVIEW;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class CreateAccountPageStepDefinitions {

    private CreateAccountPage createAccountPage;

    public CreateAccountPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            createAccountPage = PageFactory.initElements(iosDriver, CreateAccountPage.class);
            return createAccountPage;
        } else {
            createAccountPage = PageFactory.initElements(androidDriver, CreateAccountPage.class);
            return createAccountPage;
        }
    }

    @Step("Verify that the Create Account Page title is <pageTitle>")
    public void verifyCreateAccountPageTitle(String pageTitle) throws IOException {
        pageObject().isElementAttributeValueEqualTo(CREATE_ACCOUNT_PAGE, CREATE_ACCOUNT_TITLE_TEXTVIEW, "name", pageTitle);
    }

    @Step("Verify that the Create Account Page contains expected elements")
    public void verifyAllElements() throws IOException {
        pageObject().verifyAllElements();
    }

    @Step("Create an account with following information <table>")
    public void fillCreateAccountDetails(Table table) throws IOException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            pageObject().fillCreateAccountDetails(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(1)), row.getCell(columnNames.get(2)), row.getCell(columnNames.get(3)), row.getCell(columnNames.get(4)), row.getCell(columnNames.get(5)), row.getCell(columnNames.get(6)));
        }
    }

    @Step("Clear text fields in Create Account page")
    public void resetTextFields() throws IOException {
        pageObject().resetTextFields();
    }

    @Step("Click Create Account button")
    public void clickCreateAccountButton() throws IOException {
        pageObject().clickCreateAccountButton();
    }

    @Step("Verify that the Account creation is completed successfully")
    public void isAccountCreationSuccess() throws IOException {
        Assert.assertEquals(pageObject().isAccountCreationSuccess(), Boolean.TRUE, "Account creation is failed!");
    }

    @Step("Verify that the Account creation is failed")
    public void isAccountCreationFail() throws IOException {
        Assert.assertEquals(pageObject().isAccountCreationSuccess(), Boolean.FALSE, "Account creation is completed successfully!");
    }

    @Step("Navigate back from Create Account page")
    public void navigateBackFromNotificationsPage() throws IOException {
        pageObject().navigateBackFromCreateAccountPage();
    }


}
