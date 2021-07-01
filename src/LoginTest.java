import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {
        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.close();

        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser1 = driver.findElement(By.id("login-username"));
        txtUser1.sendKeys("sdsd");

        WebElement txtPass1 = driver.findElement(By.id("login-password"));
        txtPass1.sendKeys("dsds");

        WebElement btnLogin1 = driver.findElement(By.name("submit"));
        btnLogin1.click();

        driver1.close();

        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser2 = driver.findElement(By.id("login-username"));
        txtUser2.sendKeys("");

        WebElement txtPass2 = driver.findElement(By.id("login-password"));
        txtPass2.sendKeys("");

        WebElement btnLogin2 = driver.findElement(By.name("submit"));
        btnLogin2.click();

        driver.close();
    }
}
