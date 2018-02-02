package pages;

import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class NavigationBar extends BasePage {

    public static final String NAVIGATION_BAR = "NavigationBar";
    public static final String EXPERT_DECKS_NAV_BAR_ICON = "expert_decks_nav_bar_icon";
    public static final String MY_DECKS_NAV_BAR_ICON = "my_decks_nav_bar_icon";
    public static final String ARCHIVED_NAV_BAR_ICON = "archived_nav_bar_icon";
    public static final String SETTINGS_NAV_BAR_ICON = "settings_nav_bar_icon";

    public NavigationBar() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }

    public void navigateToExpertDecks() throws IOException {
        tapElement(NAVIGATION_BAR, EXPERT_DECKS_NAV_BAR_ICON);
    }

    public void navigateToMyDecks() throws IOException {
        tapElement(NAVIGATION_BAR, MY_DECKS_NAV_BAR_ICON);
    }

    public void navigateToArchivedPage() throws IOException {
        tapElement(NAVIGATION_BAR, ARCHIVED_NAV_BAR_ICON);
    }

    public void navigateToSettingsPage() throws IOException {
        tapElement(NAVIGATION_BAR, SETTINGS_NAV_BAR_ICON);
    }


}
