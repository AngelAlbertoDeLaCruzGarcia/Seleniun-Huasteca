import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class showProduct {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Convenient
        driver.manage().window().maximize();
        driver.get("http://192.168.0.5:8000/");
        System.out.println(driver.getTitle());
        WebElement producto = driver.findElement(By.name("52"));
        producto.click();
    }
}
