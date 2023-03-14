package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
public class LunchApplication2 {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();  // incase of some bugs this will works
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(options);

        //We can Open the Browser by two way
        driver.get("https://www.google.com/");

        //by help navigate we can move forward and back
        driver.navigate().to("https://www.google.com/");


    }
}
