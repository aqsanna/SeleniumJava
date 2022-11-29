import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

// Launch website
        driver.navigate().to("https://yandex.com/");

        driver.manage().window().maximize();
        WebElement searchFiled =  driver.findElement(By.id("text"));
        WebElement clickSearch =  driver.findElement(By.cssSelector(".search2__button"));
        // Click on the search text box and send value
       searchFiled.sendKeys("javatpoint tutorials");

        // Click on the search button
       clickSearch.click();
        Thread.sleep(2000);
        driver.quit();
    }

}