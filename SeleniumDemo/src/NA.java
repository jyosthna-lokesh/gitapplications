import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NA {
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","D:\\Java-Eclipse\\SeleniumDemo\\resources//geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        String tagName = "";
        driver.get("https://www.google.com/");
       tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
       
       
		
	}

}
