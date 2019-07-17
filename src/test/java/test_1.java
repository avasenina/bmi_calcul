import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class test_1 {

    public static final String  Calculator_URL="https://healthunify.com/bmicalculator/";


    @Test
    public void categoryShouldBeCorrect(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get(Calculator_URL);
        driver.findElement(By.name("wg")).sendKeys("55");
        driver.findElement(By.name("ht")).sendKeys("169");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals("Your category is Normal", category);
        driver.quit();
    }
}
