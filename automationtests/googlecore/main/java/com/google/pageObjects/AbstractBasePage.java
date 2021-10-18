package com.google.pageObjects;

import static com.google.threadsafedriver.LocalDriverManager.getDriver;
import static org.openqa.selenium.support.PageFactory.initElements;

public class AbstractBasePage {
    public AbstractBasePage() {initElements(getDriver(), this);
    }
}
