package stepImpl;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.support.PageFactory;
import pages.NotificationsPage;
import util.DriverSetup;
import java.io.IOException;
import java.util.List;

import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class NotificationsPageStepDefinitions {

    private NotificationsPage notificationsPage;

    public NotificationsPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            notificationsPage = PageFactory.initElements(iosDriver, NotificationsPage.class);
            return notificationsPage;
        } else {
            notificationsPage = PageFactory.initElements(androidDriver, NotificationsPage.class);
            return notificationsPage;
        }
    }

    @Step("Select reminder frequency <frequency>")
    public void selectReminderFrequency(String frequency) throws IOException {
        pageObject().selectFrequency(frequency);
    }

    @Step("Select reminder frequency and verify its active status <table>")
    public void selectReminderFrequencyAndVerifyActiveStatus(Table table) throws IOException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            pageObject().selectFrequency(row.getCell(columnNames.get(0)));
            pageObject().verifyFrequencyIsChecked(row.getCell(columnNames.get(0)), Boolean.valueOf(row.getCell(columnNames.get(1))));
        }
    }

    @Step("Active status of reminder frequency <frequency> should be <expectedStatus>")
    public void selectFrequencyIsChecked(String frequency, Boolean expectedStatus) throws IOException {
        pageObject().verifyFrequencyIsChecked(frequency, expectedStatus);
    }

    @Step("Reminder frequency and verify its active status <table>")
    public void reminderFrequencyAndVerifyActiveStatus(Table table) throws IOException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            pageObject().verifyFrequencyIsChecked(row.getCell(columnNames.get(0)), Boolean.valueOf(row.getCell(columnNames.get(1))));
        }
    }

    @Step("Set timer using the following details <table>")
    public void setTimer(Table table) throws IOException {
        List<TableRow> rows = table.getTableRows();
        List<String> columnNames = table.getColumnNames();
        for (TableRow row : rows) {
            pageObject().selectTime(row.getCell(columnNames.get(0)), row.getCell(columnNames.get(1)), row.getCell(columnNames.get(2)));
        }
    }

    @Step("Verify the default reminder time should be <expectedTimeString>")
    public void VerifySetTime(String expectedTimeString) throws IOException {
        pageObject().verifySetTime(expectedTimeString);
    }

    @Step("Navigate back from notifications page")
    public void navigateBackFromNotificationsPage() throws IOException {
        pageObject().navigateBackFromNotificationsPage();
    }


}
