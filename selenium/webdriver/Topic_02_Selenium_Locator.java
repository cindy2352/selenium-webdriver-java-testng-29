package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic_02_Selenium_Locator {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String osName = System.getProperty("os.name");

    @BeforeClass
    public void beforeClass() {
        if (osName.contains("Windows")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
        } else {
            System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
        }

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
   
    // TestNG sắp xếp theo alphabet (0-9 và A-Z)
    @Test
    public void TC_01_() {
    }
    @Test
    public void TC_02_() {}

    @Test
    public void TC_03_() {}

    @Test
    public void TC_04_() {}

    @Test
    public void TC_05_() {}

    @Test
    public void TC_06_() {}

    @Test
    public void TC_07_() {}

    @Test
    public void TC_08_() {}

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}