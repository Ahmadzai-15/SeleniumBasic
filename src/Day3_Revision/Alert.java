package Day3_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Alert {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();  // incase of some bugs this will works
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.switchTo().frame(1);

    }
}
