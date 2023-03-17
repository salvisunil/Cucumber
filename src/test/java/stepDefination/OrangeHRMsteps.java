package stepDefination;


import Drivers.DriversPath;
import Locaters.DriverLocator;
import PreLoaders.DriverLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OrangeHRMsteps {


   DriversPath div = new DriversPath();
   DriverLocator d1 = new DriverLocator();
   DriverLoader d2 = new DriverLoader();



    @Given("I launch chrome browser")
    public void i_launch_chrome_browser(){
        div.chromePath();
        d2.path();
    }
    @When("I open chrome  hrm homepage")
    public void i_open_chrome_hrm_homepage()
    {
        d2.driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page()
    {
        boolean webElement;
        //webElement = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        webElement = d2.driver.findElement(By.xpath(d1.login)).isDisplayed();
        Assert.assertEquals(true,webElement);
    }
    @And("close browser")
    public void close_browser()
    {
        d2.driver.quit();

    }

}
