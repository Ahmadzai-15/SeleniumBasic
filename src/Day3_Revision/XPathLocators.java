package Day3_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pakti\\IdeaProjects\\LearningSeleniumBasic\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("www.google.com");
    }
}
