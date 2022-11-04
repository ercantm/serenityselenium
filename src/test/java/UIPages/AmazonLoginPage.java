package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.amazon.com")
public class AmazonLoginPage extends PageObject {
   public void isLogoExist(){

       shouldBeVisible(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
       shouldBeDisplayed();
   }

   public void doSearch(String key){
       typeInto($("//*[@id=\"twotabsearchtextbox\"]"),key);
       waitForTextToAppear(key);
       clickOn($("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div[5]/div/div/span"));
   }
}
