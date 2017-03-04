import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Diamond on 3/3/2017.
 */
public class Firefoxlaunch{


    @Test
    public void test1()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
        driver.close();
    }
}

