import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;


//import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestSelenium {

@Test
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //final String reportLocation = "C:\\temp\\test1\\test.html";
        // final String attach;

        //System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");


        //testClass test = new testClass();

        //test.testCaseVerifyHomePage();
        WebDriver driver = new ChromeDriver();

        //Actions builder = new Actions(Cdriver);

        //builder.moveToElement(target)

        driver.get("http://www.ynet.co.il");

        WebElement title = driver.findElement(By.className("subtitle"));

        title.click();
    }
}
