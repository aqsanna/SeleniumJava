import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyAndPast {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "https://www.tutorialspoint.com/index.htm";
        driver.get(baseUrl);
        WebElement el = driver.findElement(By.id("search-strings"));
        el.sendKeys("Selenium");
        el.sendKeys(Keys.CONTROL + "A");
        el.sendKeys(Keys.CONTROL + "C");
        el.sendKeys(Keys.CONTROL + "V");
        el.sendKeys(Keys.CONTROL + "V");
        Thread.sleep(1000);
        driver.quit();
    }
}
