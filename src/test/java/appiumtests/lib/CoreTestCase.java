package appiumtests.lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CoreTestCase extends TestCase {

    protected AppiumDriver driver;
    private static String AppiumURL = "http://127.0.0.1:4723/wd/hub";

    @Override
    protected void setUp() throws  Exception {

        super.setUp();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","AndroidTestDevice");
        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("app","/Users/ilya_markelov/Downloads/webinar_v2.1.8rc1.apk");

        driver = new AndroidDriver(new URL(AppiumURL), capabilities);
    }

    @Override
    public void tearDown() throws  Exception {

        super.tearDown();
        driver.quit();
    }
}
