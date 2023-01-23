package tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import runner.BaseTest;
import screens.StartScreen;

import java.net.MalformedURLException;

public class FirstTest extends BaseTest {

    @Test
    public void testLoginApp() throws MalformedURLException {
        StartScreen start = new StartScreen(getDriver())
                .clickPhoneCode()
                .clickSearch()
                .inputSearchField()
                .clickRu();




    }


}