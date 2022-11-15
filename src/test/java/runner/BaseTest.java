package runner;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public abstract class BaseTest {

    private static AndroidDriver driver;

    protected AndroidDriver getDriver() {
        return driver;
    }

    public static void setUp() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4_API_30");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:/Users/allsp/Desktop/79265cf3-0b3e-423c-ae64-1a76f0cea513.apk");

//            desiredCapabilities.setCapability("deviceName", "Pixel_4_API_30");
//            desiredCapabilities.setCapability("platformName", "Android");
//            desiredCapabilities.setCapability("app", "androidApp");
//            desiredCapabilities.setCapability("appPackage", "com.skylexit.skylex_app");
//            desiredCapabilities.setCapability("appActivity", "com.skylexit.skylex_app.develop");
//
//            desiredCapabilities.setCapability("noReset", "true");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    protected void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
