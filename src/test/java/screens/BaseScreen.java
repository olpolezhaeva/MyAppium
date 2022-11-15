package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseScreen {

    private AndroidDriver driver;

    protected AndroidDriver getDriver() {
        return driver;
    }

    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
