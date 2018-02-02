package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.support.PageFactory;
import pages.PrivacyPolicyPage;
import util.CompareTextFiles;
import util.DriverSetup;
import java.io.IOException;
import static util.DriverSetup.androidDriver;
import static util.DriverSetup.iosDriver;


/**
 * Created by Osanda on 4/29/2017.
 */


public class PrivacyPolicyPageStepDefinitions {

    private PrivacyPolicyPage privacyPolicyPage;

    public PrivacyPolicyPage pageObject(){
        if(DriverSetup.PLATFORM.toLowerCase().equals(DriverSetup.IOS.toLowerCase())){
            privacyPolicyPage = PageFactory.initElements(iosDriver, PrivacyPolicyPage.class);
            return privacyPolicyPage;
        } else {
            privacyPolicyPage = PageFactory.initElements(androidDriver, PrivacyPolicyPage.class);
            return privacyPolicyPage;
        }
    }

    @Step("On Privacy Policy page")
    public void navigateToPrivacyPolicyPage() throws IOException {
        pageObject().navigateToPrivacyPolicyPage();
    }

    @Step("Save Privacy Policy HTML Page Source in to the directory of <filePath>")
    public void savePrivacyPolicyPageContent(String filePath) throws IOException {
        pageObject().savePrivacyPolicyPageContent(filePath);
    }

    @Step("Compare Privacy Policy page content between expected file in <filePathForExpectedContent> and actual file in <filePathForActualContent>")
    public void verifyPrivacyPolicyPageContent(String filePathForExpectedContent, String filePathForActualContent) throws IOException {
        CompareTextFiles.compare(filePathForExpectedContent, filePathForActualContent);
    }

    @Step("Navigate back from Privacy Policy page")
    public void navigateBackFromPrivacyPolicyPage() throws IOException {
        pageObject().navigateBackFromPrivacyPolicyPage();
    }


}
