package lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.TestCase;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class IOSTestCore extends TestCase {

    protected AppiumDriver driver;
    private static final String Appium_URL = "http://127.0.0.1:4723/wd/hub";


    @Override
    protected void setUp() throws  Exception {

        super.setUp();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","IOS");
        capabilities.setCapability("deviceName","iPhone 11");
        capabilities.setCapability("platformVersion","14.1");
        capabilities.setCapability("app","/Users/ilya_markelov/Desktop/App.app");

        driver = new IOSDriver(new URL(Appium_URL), capabilities);
        this.rotateScreenPortrait();
    }

    @Override
    public void tearDown() throws  Exception {

        super.tearDown();
        driver.quit();
    }

    protected  void rotateScreenPortrait() {driver.rotate(ScreenOrientation.PORTRAIT); }
    protected  void rotateScreenLandscape() {driver.rotate(ScreenOrientation.LANDSCAPE);}
}
