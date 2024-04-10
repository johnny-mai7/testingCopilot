import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Vacation_Function {

    SearchContext Vacation_Click(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-conversation-main > cib-side-panel"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("div.main > div.non-scroller > div > div > cib-free-sydney-persona:nth-child(3)"));
        SearchContext shadowRootThree=shadowContentTwo.getShadowRoot();
        return shadowRootThree;
    }
    SearchContext Text_Area(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-action-bar-main"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("div > div.main-container > div > div.input-row > cib-text-input"));
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

    @Test
    void Test_Predetermined_Budget() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        Vacation_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("3 days in Tokyo with 300$");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(20000);
        driver.quit();
    }

    @Test
    void Test_Unrealistic_Itinerary() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        Vacation_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("I want to go to Vietnam and US travel in 1 day");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(20000);
        driver.quit();
    }

    @Test
    void Test_Availability_Accuracy() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        Vacation_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("I want to go to teamLab Borderless in Odaiba");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(20000);
        driver.quit();
    }

    @Test
    void Test_External_Link() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        Vacation_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Flight tickets from Fort Myers to Atlanta");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(70000);
        Submit_Button(driver).findElement(By.cssSelector("#cib-chat-main > cib-chat-turn:nth-child(9)")).getShadowRoot().findElement(By.cssSelector("cib-message:nth-child(2)")).getShadowRoot().findElement(By.cssSelector("#adf")).click();
        sleep(20000);
        driver.quit();
    }

}
