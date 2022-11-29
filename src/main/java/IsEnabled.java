import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "https://www.selenium.dev/selenium/web/inputs.html";
        driver.get(baseUrl);
        boolean isVisible = driver.findElement(By.name("email_input")).isDisplayed();
        boolean isSelected = driver.findElement(By.name("checkbox_input")).isSelected();
        boolean isEnabled = driver.findElement(By.name("color_input")).isEnabled();

        if(isVisible){
            System.out.println("true-Visible");
        }
        else{
            System.out.println("false -Visible");
        }
        if(isSelected){
            System.out.println("true-Selected");
        }
        else{
            System.out.println("false-Selected");
        }
        if(isEnabled){
            System.out.println("true-isEnabled");
        }
        else{
            System.out.println("false-isEnabled");
        }

        driver.quit();


    }
}
