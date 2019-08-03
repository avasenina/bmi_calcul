import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class test_Overweight {


    public static final String  Calculator_URL="https://healthunify.com/bmicalculator/";

    @Test
    public void categoryShouldBeCorrect5(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get(Calculator_URL);
        driver.findElement(By.name("wg")).sendKeys("43.1856");
        driver.findElement(By.name("ht")).sendKeys("120");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals("Your category is Overweight", category);
        driver.quit();
    }
}
