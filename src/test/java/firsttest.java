import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class firsttest {

    WebDriver driver;

    @FindBy(id = "test")

    @Before
        public  void  Setup()
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Pozostałe\\Java\\app\\FirstTest\\src\\test\\java\\chromedriver.exe");
            driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://accounts.google.com/signin/v2/identifier?hl=pl&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

    @Test
        public void Ftest() throws InterruptedException {
            driver.findElement(By.id("identifierId")).sendKeys("test@test.gmail.com");
            Thread.sleep(5000);
        }
    @After
        public void AfterTest()
        {
            driver.quit();
        }
}
