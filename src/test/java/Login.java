////import io.github.bonigarcia.wdm.WebDriverManager;
/*import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
*/
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDateTime;


public class Login {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Convenient
        driver.manage().window().maximize();
        driver.get("http://192.168.0.5:8000/");
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Iniciar sesion")).click();

        WebElement Email = driver.findElement(By.id("input-16"));
        WebElement Psw = driver.findElement(By.id("input-20"));
        Email.sendKeys("aadlcg1999@gmail.com");
        Psw.sendKeys("$Dolar20");
        Psw.sendKeys(Keys.ENTER);
        Email.clear();
        Psw.clear();
    }
}
