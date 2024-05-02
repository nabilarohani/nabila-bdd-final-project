package TEK.BDD.FINALPROJECT.STEPS;

import TEK.BDD.FINALPROJECT.PAGE.HomePage;
import TEK.BDD.FINALPROJECT.utility.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class HomePageSteps extends SeleniumUtilities {

    @Given("Validate Home page title Tek insurance UI is exist")
    public void validateHomePageTitle() {
        String actualTitle = getElementText(HomePage.TitleOfHomePage);
        Assert.assertEquals("TEK Insurance App", actualTitle);
    }
    @Then("Validate create Primary Account Button is exist")
    public void validateHomeCreatePrimaryAccount() {
        String actualTitle = getElementText(HomePage.CreatePrimaryAccountButton);
        Assert.assertEquals("Create Primary Account", actualTitle);
    }
    @Given("Click on Create Primary Account Button")
    public void clickOnCreatePrimaryAccount() {
        clickOnElement(HomePage.CreatePrimaryAccountButton);
    }
    @Given("Click on Login Button")
    public void clickOnLogin() {
        clickOnElement(HomePage.LoginButtonInHomePage);
    }
    @Then("Validate Lets get you started text on Home Page")
    public void validateLetsGetYouStartedText() {
        boolean isLetsGetYouStartedTextDisplayed = isElementEnabled(HomePage.LetsGetYouStartedText);
        Assert.assertTrue("Lets get you started text should be displayed ",
                isLetsGetYouStartedTextDisplayed);
    }

    }


