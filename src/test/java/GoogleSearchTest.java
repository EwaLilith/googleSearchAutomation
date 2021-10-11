import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class GoogleSearchTest {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void myFirstTest() {
        driver.navigate().to("https://google.com/");

        driver.manage().window().maximize();

        driver.findElement(By.name("[name='q']")).sendKeys("Java");
        driver.findElement(By.name("[name='q']")).submit();

        List<WebElement> searchList = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='pcTkSc']"));

        int searchListSize = 10;

        Assert.assertEquals(searchList.size(), searchListSize);

        String pageTitle = driver.getTitle();

        assertTrue(pageTitle.contains("GoogleSearch"));
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}

