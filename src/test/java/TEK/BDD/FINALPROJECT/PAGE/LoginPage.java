package TEK.BDD.FINALPROJECT.PAGE;

import org.openqa.selenium.By;

public class LoginPage {


    public static final By USERNAME_INPUT = By.xpath("//input[@id='username']");

    public static final By PASSWORD_INPUT = By.xpath ("//input [@id='password']");

    public static final By SIGN_IN_BUTTON = By.xpath ("// button[contains(text(),'Sign In')]");

    public static final By ERROR_MESSAGE = By.xpath("//div[@role='alert']");
    public static final By CREATE_ACCOUNT_LINK = By.linkText("Create New Account");


}
