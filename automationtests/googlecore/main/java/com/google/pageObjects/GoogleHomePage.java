package com.google.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends AbstractBasePage {

    @FindBy(name = "q")
    WebElement searchFieldInput;

    @FindBy(linkText = "[href='https://mail.google.com/mail/&ogbl']")
    WebElement gmailLink;

    @FindBy(linkText = "[href='https://www.google.pl/imghp?hl=en&ogbl']")
    WebElement imagesLink;

    @FindBy(name = "gb_Pe")
    WebElement googleAppsButton;

    @FindBy(name = "gb_3")
    WebElement LogInButton;

    @FindBy(name = "GVqCqe")
    WebElement shareButton;

}

