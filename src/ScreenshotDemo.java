import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo {

    @Test
    public void myTest() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://facebook.com/");

        // 1. create an object reference of TakesScreenshot, assign a driver to it
        // typecast driver into  TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() and assign it to a file object
       File scrFile =  ts.getScreenshotAs(OutputType.FILE);

       Date date = new Date();

       String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(date);

       String fileName = "IMG"+timeStamp+".png";

       // 3. create a real image
        FileUtils.copyFile(scrFile,new File("D:\\screenshots\\"+fileName));
    }
}
