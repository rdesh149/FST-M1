import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1 extends BaseClass{

    @Test
    public void Title(){
        String actual=driver.getTitle();
        String expected="SuiteCRM";
        Assert.assertEquals(actual,expected);
        System.out.println("Title of the page: "+actual);
    }
}
