package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureURL {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
       String url=driver.getCurrentUrl();
        System.out.println("Page URL is: " +url);
    }
}
