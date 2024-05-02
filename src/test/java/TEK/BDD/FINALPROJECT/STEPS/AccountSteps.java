package TEK.BDD.FINALPROJECT.STEPS;

import TEK.BDD.FINALPROJECT.PAGE.AccountPage;
import TEK.BDD.FINALPROJECT.PAGE.AccountProfilePage;
import TEK.BDD.FINALPROJECT.PAGE.DashboardPage;
import TEK.BDD.FINALPROJECT.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AccountSteps extends SeleniumUtilities {



    @When("Verify the presence of all 5 rows")
    public void VerifyThePresenceOfAllFiveRows() {
        List<WebElement> rows = getDriver().findElements(AccountPage.AllRows);
        assertEquals(5, rows.size());
        for (WebElement row : rows) {
            assertTrue(row.isDisplayed());
        }
    }



    @Then("all five rows should be present")
    public void allFiveRowsShouldBePresent() {
        List<WebElement> rows = getDriver().findElements(AccountPage.AllRows);
        assertEquals("Expected exactly 5 rows", 5, rows.size());
        for (WebElement row : rows) {
            assertTrue("Row is not displayed", row.isDisplayed());
        }
    }
    @Then("Select Show {string} from page per show dropdown")
    public void clickPagePerShow(String Num) {
        WebElement element= getDriver().findElement(AccountPage.PageShow);
        Select select= new Select(element);
        select.selectByVisibleText(Num);
    }
    @Then("Verify the presence of all {string} per page")
    public void verifyThePresenceOfAllPerPage(String visibleRows) {
        int expectedRowCount = Integer.parseInt(visibleRows);
        List<WebElement> rows = getDriver().findElements(AccountPage.AllRows);
        assertEquals("Unexpected number of rows", expectedRowCount, rows.size());
    }

}
