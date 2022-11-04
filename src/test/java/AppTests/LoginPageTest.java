package AppTests;

import Steps.LoginPageStes;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.openqa.selenium.WebDriver;
import Steps.AmamzonSteps;

@RunWith(SerenityRunner.class)
public class LoginPageTest {
    @Steps
    LoginPageStes  loginPageStes = new LoginPageStes();
    @Steps
    AmamzonSteps amz= new AmamzonSteps();


    @Managed(driver="chrome")
    WebDriver browser;
    @Test
    public void appLoginTest(){
        loginPageStes.isOnLoginPage();
        loginPageStes.loginasUser();
        loginPageStes.verifyUserLogin();
    }


}
