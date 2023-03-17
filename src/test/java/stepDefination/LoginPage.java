//package stepDefination;
//
//import Drivers.DriversPath;
//import Locaters.DriverLocator;
//import PreLoaders.DriverLoader;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//
//public class LoginPage {
//
//    DriversPath d2 = new DriversPath();
//    DriverLoader d3 = new DriverLoader();
//
//
//
//    @Given("User Launch Chrome browser")
//    public void user_launch_chrome_browser() {
//        d2.chromePath();
//        d3.path();
//
//    }
//
//    @When("User open URL {string}")
//    public void user_open_url(String string) {
//        d3.driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
//
//    }
//
//    @And("User enters Email as {string} and Password as {string}")
//    public void user_enters_email_as_and_password_as(String string, String string2) {
//        d3.driver.findElement(By.xpath("id"));
//
//
//
//    }
//
//    @And("Click on Login")
//    public void click_on_login() {
//
//    }
//
//    @Then("Page Title should  be {string}")
//    public void page_title_should_be(String string) {
//           }
//
//    @When("User click on Log out link")
//    public void user_click_on_log_out_link() {
//    }
//
//    @Then("page Title should be Login")
//    public void page_title_should_be() {
//
//    }
//    @And("close browser")
//    public void close_browser(){
//
//    }
//}
