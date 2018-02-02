package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.NavigationBar;
import util.DriverSetup;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class NavigationBarStepDefinitions {

    private NavigationBar navigationBar;

    public NavigationBar pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            navigationBar = PageFactory.initElements(iosDriver, NavigationBar.class);
            return navigationBar;
        } else {
            navigationBar = PageFactory.initElements(androidDriver, NavigationBar.class);
            return navigationBar;
        }
    }

    @Step("On Expert Decks page")
    public void navigateToExpertDecks() throws IOException {
        pageObject().navigateToExpertDecks();
    }

    @Step("On My Decks page")
    public void navigateToMyDecks() throws IOException {
        pageObject().navigateToMyDecks();
    }

    @Step("On Archived page")
    public void navigateToArchivedPage() throws IOException {
        pageObject().navigateToArchivedPage();
    }

    @Step("On Settings page")
    public void navigateToSettingsPage() throws IOException {
        pageObject().navigateToSettingsPage();
    }


}
