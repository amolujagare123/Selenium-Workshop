import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {

    @Test
    public void myTest1() throws InterruptedException {
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

        String expected = "POSNIC - Dashboard1";
        String actual = driver.getTitle();
        Thread.sleep(5000);
        driver.close();

        Assert.assertEquals("This is not a dashbord",expected,actual);

    }

    @Test
    public void myTest2() throws InterruptedException {
        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("gfgfg");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("fgfg");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        String expected = "https://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = driver.getCurrentUrl();

        Thread.sleep(5000);
        driver.close();

        Assert.assertEquals("we not on login page",expected,actual);

    }

    @Test // todays task
    public void myTest3() throws InterruptedException {
        // open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        Thread.sleep(5000);
        driver.close();
    }
}
