package AppTests;
import Steps.AmamzonSteps ;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AmazonTest {

    @Steps
    AmamzonSteps amz = new AmamzonSteps();
    @Managed(driver = "chrome")
    WebDriver browser;

    @Test
    private void accTest() {

        amz.seach();
        amz.seach();

    }


}
