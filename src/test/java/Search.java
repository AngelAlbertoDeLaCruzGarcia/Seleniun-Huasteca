////import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Convenient
        driver.manage().window().maximize();
        driver.get("http://192.168.0.5:8000/");
        driver.getTitle();
        WebElement searchInput = driver.findElement(By.id("input-10"));
        ///driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchInput.sendKeys("blusa");
        searchInput.sendKeys(Keys.ENTER);
        searchInput.clear();;
    }
}
