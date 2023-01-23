package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseScreen {

    private AndroidDriver<? extends WebElement> driver;

    protected AndroidDriver<? extends WebElement> getDriver() {
        return driver;
    }

    public BaseScreen(AndroidDriver<? extends WebElement> driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
