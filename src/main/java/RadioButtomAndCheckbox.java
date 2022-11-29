import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtomAndCheckbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "http://demo.guru99.com/test/radio.html";
        driver.get(baseUrl);
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio1.click();
        System.out.println("Radio Button Option 1 Selected");
        radio2.click();
        System.out.println("Radio Button Option 2 Selected");
        WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
        checkbox1.click();
        if(checkbox1.isSelected()){
            System.out.println("Checkbox is Toggled On");
        }
        else{
            System.out.println("Checkbox is Toggled Off");
        }
        driver.quit();

    }
}
