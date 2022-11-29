import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "http://demo.guru99.com/test/link.html";
        driver.get(baseUrl);
        //driver.findElement(By.linkText("click here")).click();
        driver.findElement(By.partialLinkText("here")).click();
        System.out.println("Title of page: " + driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }
}
