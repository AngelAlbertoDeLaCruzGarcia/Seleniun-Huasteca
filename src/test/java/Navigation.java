import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Convenient
        driver.manage().window().maximize();
        driver.get("http://192.168.0.5:8000/");
        driver.getTitle();
        driver.findElement(By.linkText("ACERCA DE")).click();
        driver.findElement(By.linkText("> Carrito")).click();
        driver.findElement(By.linkText("CONTACTO")).click();
        driver.findElement(By.linkText("AYUDA")).click();
        driver.findElement(By.linkText("CHAT")).click();
        ///driver.navigate().to("http://192.168.0.5:8000/contacto");
        ///driver.quit();
    }
}
