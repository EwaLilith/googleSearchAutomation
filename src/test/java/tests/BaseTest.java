package tests;

import com.google.constants.Browser;
import com.google.constants.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import static com.google.constants.TestParameters.PARAMETER_BROWSER;
import static com.google.constants.TestParameters.PARAMETER_ENVIRONMENT;
import static com.google.threadsafedriver.LocalDriverManager.setDriver;
import static com.google.threadsafedriver.LocalDriverManager.tearDown;

public class BaseTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    @BeforeMethod
    @Parameters({PARAMETER_BROWSER, PARAMETER_ENVIRONMENT})
    public void prepareDriver(String browser, String environment) {
        LOGGER.info("Preparing driver...");
        setDriver(Browser.lookupByDisplayName(browser),
                Environment.lookupByName(environment));
    }

    @AfterMethod
    public void cleanAfterTest() {
        tearDown();
    }
}



//        driver.manage().window().maximize();
//
//        driver.navigate().to("https://google.com/");
//
//
//        WebElement acceptCookieButton = driver.findElement(By.id("L2AGLb"));
//
//        Actions action = new Actions(driver);
//        action.moveToElement(acceptCookieButton).build().perform();
//        action.click(acceptCookieButton).build().perform();

