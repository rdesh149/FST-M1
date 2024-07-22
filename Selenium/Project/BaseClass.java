import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {

    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void Launch(){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://alchemy.hguy.co/crm");
        wait=new WebDriverWait(driver, Duration.ofSeconds(50));

    }
    @AfterMethod
    public void close(){
        driver.close();

    }
}
