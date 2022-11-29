import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "https://www.instagram.com/";
        driver.get(baseUrl);
        WebElement forgotPassword = driver.findElement(By.linkText("Forgot password?"));//By.xpath("//*[text()='Forgot password?']")
        Thread.sleep(1000);
        forgotPassword.click();
        Thread.sleep(1000);
        if(driver.getTitle().equals("Reset Password • Instagram")){
            System.out.println("We are go to forgot password page");
        }
        else{
            System.out.println("We are go to wrong age");
        }
        driver.quit();
    }
}
