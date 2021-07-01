import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        // open a browser

       /* WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();*/

        /*WebDriverManager.operadriver().setup();
        WebDriver driver = new OperaDriver();*/

       /* WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();*/

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

    }
}
