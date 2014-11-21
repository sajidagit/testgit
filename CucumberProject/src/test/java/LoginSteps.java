import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


/**
 * Created by HashmiS on 21/11/14.
 */
public class LoginSteps {
    WebDriver driver;

    @Given("^navigate to \"([^\"]*)\"$")
    public void navigate_to(String url) throws Throwable {
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @When("^valid username and password is entered$")
    public void valid_username_and_password_is_entered(DataTable loginTable) throws Throwable {
        WebElement uname = driver.findElement(By.id("ssc-liu"));
        uname.sendKeys(loginTable.asMaps().get(0).get("userName"));

        WebElement pwd = driver.findElement(By.id("ssc-lipw"));
        pwd.sendKeys(loginTable.asMaps().get(0).get("passWord"));

        driver.findElement(By.id("ssc-lis")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^user should be successfully logged in$")
    public void user_should_be_successfully_logged_in() throws Throwable {
        //WebElement myAccount = driver.findElement(By.className("ssc-un"));
        Assert.assertTrue(driver.findElement(By.className("ssc-un")).isDisplayed());
        driver.quit();
    }

}
