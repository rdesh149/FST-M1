import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity2 extends BaseClass{
    @Test
    public void headerURL(){
        String headerurl=driver.findElement(By.tagName("img")).getAttribute("src");
        System.out.println("Header URL: "+headerurl);
    }
}
