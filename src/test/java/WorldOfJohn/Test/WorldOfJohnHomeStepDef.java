package WorldOfJohn.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import static junit.framework.Assert.*;

/**
 * Created by folive on 24/06/14.
 */
public class WorldOfJohnHomeStepDef {

    private FirefoxDriver driver = null;

    @Given("^I Navigate to the World of John Home Page$")
    public void I_Navigate_to_the_World_of_John_Home_Page() throws Throwable {
        driver = new FirefoxDriver(new FirefoxProfile());

        driver.navigate().to("http://www.bbc.co.uk/news/");
    }

    @When("^I Click the Contact Button$")
    public void I_Click_the_Contact_Button() throws Throwable {
        WebElement contactUs = driver.findElement(By.linkText("Contact the BBC"));

        assertNotNull(contactUs);

        contactUs.click();
    }

    @And("^I Click on the Breakfast Button$")
    public void I_Click_on_the_Breakfast_Button() throws Throwable {
        WebElement contactUs = driver.findElement(By.linkText("Breakfast"));

        assertNotNull(contactUs);

        contactUs.click();
    }

    @And("^I Click on the By Email Button$")
    public void I_Click_on_the_By_Email_Button() throws Throwable {
        WebElement contactUs = driver.findElement(By.linkText("By email"));

        assertNotNull(contactUs);

        contactUs.click();
    }

    @Then("^The Contact Page will Appear$")
    public void The_Contact_Page_will_Appear() throws Throwable {
        assertNotNull(driver.findElement(By.id("faq-p00-0")));
    }

    @Then("^Close the Browser$")
    public void Close_the_Browser() throws Throwable {
        driver.close();
    }
}
