import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Activity3 extends BaseClass{

    @Test
    public void footer(){
        String copyright=driver.findElement(By.xpath("//a[@id='admin_options']")).getText();
        System.out.println("Copyright text is: "+copyright);
    }
}
