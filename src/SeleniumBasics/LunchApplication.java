package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchApplication {
    public static void main(String[] args) {
        //Open the browser

    System.setProperty("webdriver.chrome.driver","C:\\Users\\pakti\\IdeaProjects\\LearningSeleniumBasic\\Drivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    }
}
