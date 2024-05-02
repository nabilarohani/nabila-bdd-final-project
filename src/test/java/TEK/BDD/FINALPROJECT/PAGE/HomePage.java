package TEK.BDD.FINALPROJECT.PAGE;

import org.openqa.selenium.By;

import java.util.Random;

public class HomePage {



        public static final By CreatePrimaryAccountButton  = By.linkText("Create Primary Account");
        public static final By LoginButtonInHomePage = By.xpath("//*[@id='root']/div/div[1]/div/a[2]");

        public static final By LetsGetYouStartedText = By.xpath("//h2[contains (text(), 'Lets get you started')]");
        public static final By TitleOfHomePage = By.xpath("//h2[text()='TEK Insurance App']");
        public static final By CustomerServicePortal = By.xpath("//h2[contains(text(),'Customer Service Portal')]");





    }
