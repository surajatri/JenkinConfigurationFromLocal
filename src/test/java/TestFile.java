import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestFile {


    @Test
    public void firstTest() throws MalformedURLException, InterruptedException {

        Assert.assertEquals("", "");
        System.out.println("Test executed");
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setBrowserName(BrowserType.CHROME);
        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"),cap);
        //driver.get("https://www.gmail.com/");
        //driver.quit();

    }

}
