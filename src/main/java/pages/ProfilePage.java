package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage{

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "main-header")
    public WebElement headerProfile;

    @FindBy(xpath = "//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div[2]")
    public WebElement deleteAccount;

}
