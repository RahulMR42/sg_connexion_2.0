import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {


    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
       // String baseUrl = "https://www.flipkart.com/";

     //   driver.wait(45001);
        driver.get("https://www.flipkart.com/");

        driver.close();
       
    }

}