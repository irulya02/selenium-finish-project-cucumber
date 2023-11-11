package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id= "userName")
    public WebElement userNameInputField;

    @FindBy (id="password")
    public WebElement userPasswordInputField;

    @FindBy(id="login")
    public WebElement loginButton;

    @FindBy(id="name")
    public WebElement errorMassage;
}

