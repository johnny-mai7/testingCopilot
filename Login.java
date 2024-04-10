import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class Login {
    //1. Correct Password
    @Test(priority=1)
    void Corrected_Account()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("anhchangdemen019@gmail.com");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("Huynguyen19");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();
        sleep(10000);
        driver.quit();
    }
    //2. Wrong passwd
    @Test(priority=3)
    void Wrong_Password() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("anhchangdemen019@gmail.com");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("Huyhuy");
        sleep(1000);
        driver.quit();
    }
    //Github
    @Test(priority=4)
    void Github_Login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='middle']/div/div/div/div[2]/div/button/div[2]/div")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='tileList']/div[2]/div/button")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='login_field']")).sendKeys("dementonguyen1998@gmail.com");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Huyhuy1234$");
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='login']/div[3]/form/div/input[13]")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();
        sleep(10000);
        driver.quit();
    }


    //Testing the output with a predetermined budget.
}
