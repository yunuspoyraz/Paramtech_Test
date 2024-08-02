package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ReusableMethods;


public class CreateAccountPage extends ReusableMethods {
    @FindBy(xpath = "//*[@id=\"form1\"]/section[3]/div/div/div[1]/div/div[2]/a")
    public WebElement kurumsalGirisButon;


    public  CreateAccountPage() {
            PageFactory.initElements(driver,this);
        }


    }

