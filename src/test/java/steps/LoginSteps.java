package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;

import java.time.Duration;

public class LoginSteps {
    ChromeDriver driver;
        @Given("^User opens the page Login$")
    public void userOpensThePageLogin() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Irina Ovsianko\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/login");
    }

    @When("^User fills input username \"([^\"]*)\"$")
    public void userFillsInputUsername(String usernameValue){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userNameInputField.sendKeys(usernameValue);
    }

    @Then("^User fills input password \"([^\"]*)\"$")
    public void userFillsInputPassword(String passwordValue){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userFillsInputPassword.sendKeys(passwordValue);
    }

    @And("^User clicks on button Login$")
    public void userClicksOnButtonLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginButton.click();


    }
}
