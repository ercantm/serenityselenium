package Steps;

import UIPages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginPageStes {

    private LoginPage loginPage= new LoginPage();
    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }
    @Step
    public void loginasUser(){
        loginPage.doLogin();

    }
    @Step
    public void verifyUserLogin(){
        Assert.assertTrue(loginPage.accountverifyVisibility());
    }


}
