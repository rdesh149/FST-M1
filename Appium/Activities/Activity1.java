package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {

    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options caps = new UiAutomator2Options()
                .setPlatformName("android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.oneplus.calculator")
                .setAppActivity("com.android.calculator2.Calculator")
                .noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serverURL, caps);

    }

    @Test
    public void multiplyTest(){
        driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_7")).click();
        driver.findElement(AppiumBy.accessibilityId("Multiply")).click();
        driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_6")).click();
        driver.findElement(AppiumBy.accessibilityId("Equals")).click();
        String result = driver.findElement(AppiumBy.id("com.oneplus.calculator:id/result")).getText();
        Assert.assertEquals(Integer.valueOf(result), 42);
    }
}
