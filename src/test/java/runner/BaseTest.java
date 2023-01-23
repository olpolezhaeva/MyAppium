package runner;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public abstract class BaseTest {
    private static AndroidDriver<? extends WebElement> driver;

    @BeforeMethod
    public static AndroidDriver<? extends WebElement> getDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "Pixel_4_API_30");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:automationName", "UIAotomator2");
        desiredCapabilities.setCapability("appium:appActivity", "com.skylexit.skylex_app.features.main");
        desiredCapabilities.setCapability("appium:appPackage", "com.skylexit.skylex_app.develop");
        desiredCapabilities.setCapability("appium:app", "C:/Users/allsp/IdeaProjects/MyAppium/src/test/resources/79265cf3-0b3e-423c-ae64-1a76f0cea513.apk");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }

    @AfterMethod
    protected void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
