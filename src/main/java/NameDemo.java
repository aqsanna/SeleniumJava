import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NameDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "http://demo.guru99.com/test/ajax.html";
        driver.get(baseUrl);
        //driver.findElement(By.linkText("click here")).click();
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements: " + elements.size());
        Thread.sleep(1000);
        for(int i=0; i<elements.size(); i++){
            System.out.println("Radio button text: " + elements.get(i).getAttribute("value"));
        }
        driver.quit();
    }

}
