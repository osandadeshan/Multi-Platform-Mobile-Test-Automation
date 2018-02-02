package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.TermsOfServicePage;
import util.CompareTextFiles;
import util.DriverSetup;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class TermsOfServicePageStepDefinitions {

    private TermsOfServicePage termsOfServicePage;

    public TermsOfServicePage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            termsOfServicePage = PageFactory.initElements(iosDriver, TermsOfServicePage.class);
            return termsOfServicePage;
        } else {
            termsOfServicePage = PageFactory.initElements(androidDriver, TermsOfServicePage.class);
            return termsOfServicePage;
        }
    }

    @Step("On Terms Of Service page")
    public void navigateToTermsOfServicePage() throws IOException {
        pageObject().navigateToTermsOfServicePage();
    }

    @Step("Save Terms Of Service HTML Page Source in to the directory of <filePath>")
    public void saveTermsOfServicePageContent(String filePath) throws IOException {
        pageObject().saveTermsOfServicePageContent(filePath);
    }

    @Step("Compare Terms Of Service page content between expected file in <filePathForExpectedContent> and actual file in <filePathForActualContent>")
    public void verifyTermsOfServicePageContent(String filePathForExpectedContent, String filePathForActualContent) throws IOException {
        CompareTextFiles.compare(filePathForExpectedContent, filePathForActualContent);
    }

    @Step("Navigate back from Terms Of Service page")
    public void navigateBackFromPrivacyPolicyPage() throws IOException {
        pageObject().navigateBackFromTermsOfServicePage();
    }


}
