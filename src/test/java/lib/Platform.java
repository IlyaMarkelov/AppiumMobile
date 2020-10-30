package lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Platform {
    private static final String PLATFORM_IOS = "IOS";
    private static final String PLATFORM_ANDROID = " Android";
    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    private static Platform instance;

    private Platform() {}

    public static Platform getInstance(){
        if (instance == null) {
            instance = new Platform();
        }
        return instance;
    }


    public AppiumDriver getDriver() throws Exception{
        URL URL = new  URL(APPIUM_URL);
        if(this.isAndroid()){
            return new AndroidDriver(URL, this.getAndroidDesiredCapabilities());
        } else if(this.isIOS()){
            return new IOSDriver(URL, this.getIOSDesiredCapabilities());
        } else {
            throw new Exception("Cannot detect type of the Driver. Platform value: " + this.getPlatformVar());
        }
    }

    public boolean isAndroid(){
        return isPlatform(PLATFORM_ANDROID);
    }

    public boolean isIOS(){
        return isPlatform(PLATFORM_IOS);
    }

    private DesiredCapabilities getAndroidDesiredCapabilities(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","AndroidTestDevice");
        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("app","/Users/ilya_markelov/Downloads/webinar_v2.1.8rc1.apk");
        return capabilities;
    }

    private DesiredCapabilities getIOSDesiredCapabilities(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","IOS");
        capabilities.setCapability("deviceName","iPhone 11");
        capabilities.setCapability("platformVersion","14.1");
        capabilities.setCapability("app","/Users/ilya_markelov/Desktop/App.app");
        return capabilities;
    }

    private boolean isPlatform(String my_platform){
        String platfrom = this.getPlatformVar();
        return my_platform.equals(platfrom);
    }

    private String getPlatformVar(){
        return System.getenv("PLATFORM");
    }
}