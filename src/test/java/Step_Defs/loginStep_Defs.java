package Step_Defs;

import com.sparta.owh.BBCSite.BBCPages.BBCSignInPage;
import com.sparta.owh.BBCSite.BBCSite;
import com.sparta.owh.Selenium_Config.SeleniumDriverConfig;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sparta.owh.*;
public class loginStep_Defs {

    ChromeDriver chromeDriver;
    BBCSite bbcSite;

    public loginStep_Defs(){

        SeleniumDriverConfig driverConfig = new SeleniumDriverConfig("chrome");
        bbcSite = new BBCSite(driverConfig.getDriver());
    }

    @Given("^I am able to access the sign in page$")
    public void i_am_able_to_access_the_sign_in_page() throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        bbcSite.bbcSignInPage().goToSignInPage();
        Assert.assertEquals(bbcSite.bbcSignInPage().getSignInUrl(),bbcSite.getCurrentUrl());
        //throw new PendingException();
    }

    @When("^I use incorrect credentials to login$")
    public void i_use_incorrect_credentials_to_login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        bbcSite.bbcSignInPage().inputPassword("0000");
        bbcSite.bbcSignInPage().inputUserName("email@email.com");
        bbcSite.bbcSignInPage().clickSubmitButton();
    }

    @Then("^I receive a viable error$")
    public void i_receive_a_viable_error() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //Assert.assertEquals(bbcSite.bbcSignInPage().);
        throw new PendingException();
    }



}
