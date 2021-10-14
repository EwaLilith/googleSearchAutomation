package steps;

import com.google.pageObjects.GoogleHomePage;
import io.qameta.allure.Step;

import static com.google.threadsafedriver.LocalDriverManager.getDriver;
import static com.google.threadsafedriver.LocalDriverManager.getEnvironment;

public class GoogleHomeSteps {

    GoogleHomePage homePage = new GoogleHomePage();

    @Step("Open Google Homepage")
    public GoogleHomePage openHomepage() {
        getDriver().get(getEnvironment().getBaseUrl());
        return new GoogleHomePage();
    }
}
