package pages;

import org.openqa.selenium.support.PageFactory;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 5/14/2017.
 */


public class ArchivedPage extends BasePage {

    public static final String ARCHIVED_TITLE_TEXTVIEW = "archived_title_textview";
    public static final String ARCHIVED_PAGE = "ArchivedPage";

    public ArchivedPage() {
        PageFactory.initElements(androidDriver, this);
        PageFactory.initElements(iosDriver, this);
    }


}
