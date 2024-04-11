import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Notebook_Testing {
    SearchContext Text_Area(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-action-bar-main"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("div > div > div > div.input-row > cib-text-input"));
        SearchContext shadowRootThree=shadowContentTwo.getShadowRoot();
        return shadowRootThree;
    }
    SearchContext Submit_Button(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-action-bar-main"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        return shadowRootTwo;
    }

    void Search_NoteBook(WebDriver driver,String ques) throws InterruptedException {
        //Click into NoteBook
        driver.findElement(By.cssSelector("#b-scopeListItem-notebook > a")).click();
        sleep(1000);
        //Send text into search box
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys(ques);
        sleep(1000);
        //Click into submit
        Submit_Button(driver).findElement(By.cssSelector("div > div > div > div.bottom-controls > div.bottom-right-controls > div.control.submit.notebook-alt > button")).click();
        sleep(30000);
    }
    //Code in C++
    @Test(priority=1)
    void Code_In_C()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        Search_NoteBook(driver,"Add two number in C++ code");
        driver.quit();
    }

    //Code in Python
    @Test(priority=2)
    void Code_In_Python()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        Search_NoteBook(driver,"Add two number in Python code");
        driver.quit();
    }

    //Code in Java
    @Test(priority=3)
    void Code_In_Java()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        Search_NoteBook(driver,"Add two number in Java code");
        driver.quit();
    }

    //Explain Code
    @Test(priority=4)
    void Poorly_Written_Code()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");
        //Search poorly written code and make it explain
        Search_NoteBook(driver,"int mul(int a, int b) \n" +
                "{ int product = 0; \n" +
                "  for(int i=0;i<b;i++) \n" +
                "    product += a; \n" +
                "  return product; \n" +
                "}\n Explain the code");
        driver.quit();
    }
}
