import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InecoBank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String Url = "https://www.inecobank.am/hy/Individual";
        driver.get(Url);
        WebElement fidLink = driver.findElement(By.linkText("ԲԻԶՆԵՍ"));
        WebElement languages = driver.findElement(By.cssSelector(".languageDropDown"));
        WebElement enLanguage = driver.findElement(By.cssSelector(".languageDropDownList.languageDropDownList--alignToRight.languageDropDownList"));
        WebElement textLanguage = driver.findElement(By.xpath("//*[text()='English']"));
        fidLink.click();
        Thread.sleep(1000);
        languages.click();
        Thread.sleep(1000);
        enLanguage.click();
        Thread.sleep(1000);
        textLanguage.click();
        Thread.sleep(1000);
        driver.quit();

    }
}
