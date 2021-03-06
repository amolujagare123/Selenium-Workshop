import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

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

        WebElement lnkAddCutomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCutomer.click();

        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys("Aishwarya");

        WebElement txtAdd = driver.findElement(By.name("address"));
        txtAdd.sendKeys("xyz");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("78787");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("178787");

        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();

         Thread.sleep(4000);

      driver.close();


    }
}
