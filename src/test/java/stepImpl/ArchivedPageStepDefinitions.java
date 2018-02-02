package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.ArchivedPage;
import util.DriverSetup;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class ArchivedPageStepDefinitions {

    private ArchivedPage archivedPage;

    public ArchivedPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            archivedPage = PageFactory.initElements(iosDriver, ArchivedPage.class);
            return archivedPage;
        } else {
            archivedPage = PageFactory.initElements(androidDriver, ArchivedPage.class);
            return archivedPage;
        }
    }


}
