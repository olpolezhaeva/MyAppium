package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class StartScreen extends BaseScreen{

    public StartScreen(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
    private MobileElement nameField;

    public StartScreen click() {
        nameField.click();
        return this;
    }
}
