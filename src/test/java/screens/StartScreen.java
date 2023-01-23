package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class StartScreen extends BaseScreen{

    public StartScreen(AndroidDriver<? extends WebElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id="ll_code")
    private MobileElement phoneCodeField;

    @AndroidFindBy(id = "btn_search")
    private MobileElement searchButton;

    @AndroidFindBy(id ="et_search")
    private MobileElement searchField;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]")
    private MobileElement ru;

    public StartScreen clickPhoneCode() {
        phoneCodeField.click();
        return this;
    }

    public StartScreen clickSearch() {
        searchButton.click();
        return this;
    }

    public StartScreen inputSearchField() {
        searchField.click();
        searchField.sendKeys("ru");
        return this;
    }

    public StartScreen clickRu() {
        ru.click();
    }
}
