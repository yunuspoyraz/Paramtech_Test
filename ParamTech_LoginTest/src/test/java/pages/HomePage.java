package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.ReusableMethods.driver;

public class HomePage  {
    @FindBy(id ="menu_login")
    public WebElement girisYapButon1;

    public HomePage() {
        PageFactory.initElements(driver,this);
    }



}
