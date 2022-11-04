package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

@DefaultUrl("https://www.facebook.com")
public class LoginPage extends PageObject {

    public void doLogin(){
        $("#email").sendKeys("ercantm@hotmail.com");
        $("#pass").sendKeys("!!Amerika254");
//        $("#pass").isDisabled();
        $("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]").click();

    }
    public Boolean accountverifyVisibility () {
//      return   $("//input[@id='pass']").isDisabled() && $("//input[@id='email']").isDisabled() ;
  return (!$("//*[@id=\"mount_0_0_Qp\"]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/ul/li/div/a/div[1]/div[2]/div/div/div/div/span/span").isVisible());
    }



}
