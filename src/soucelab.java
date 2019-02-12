import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class soucelabtest {



    public static final String USERNAME = "cynwebservices";
    public static final String ACCESS_KEY = "9502a7b9-dca2-44e0-b288-4c45ed42a7f4";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";


    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "37.0");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps );
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
