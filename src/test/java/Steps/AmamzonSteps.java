package Steps;

import UIPages.AmazonLoginPage;
import net.thucydides.core.annotations.Step;

public class AmamzonSteps {
    private AmazonLoginPage pg;

    @Step
    public void validateLogin() {
        pg.open();
        pg.isLogoExist();
    }
    @Step
    public void seach(){
        pg.doSearch("car");
    }

}
