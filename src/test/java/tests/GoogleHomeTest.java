package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class GoogleHomeTest extends BaseTest {

    @Test
    public void googleHomeTest() {

//        driver.findElement(By.name("q")).sendKeys("Java");
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        List<WebElement> searchList = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='pcTkSc']"));
//
//        int searchListSize = 10;
//
//        Assert.assertEquals(searchList.size(), searchListSize);
//
//        String pageTitle = driver.getTitle();
//
//        assertTrue(pageTitle.contains("Google"));
    }
}

