import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class testingFitnessTrainer {

    SearchContext Fitness_Click(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-conversation-main > cib-side-panel"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("div.main > div.non-scroller > div > div > cib-free-sydney-persona:nth-child(5)"));
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

    @Test (priority = 1)
    void Test_SpecificBodyTypes() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        Fitness_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("I'm 540 and I'm trying to lose around 5lbs every week, how should i start?");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(100000);
        driver.quit();
    }

    @Test (priority = 2)
    void Test_SpecificWorkoutMethod() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        Fitness_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Make me a workout for only cardio, I'm trying to lose weight.");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(100000);
        driver.quit();
    }

    @Test (priority = 3)
    void Test_GeneratedDietCalories() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        Fitness_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Can you make me a healthy diet that consists of 2000 calories a day?");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(100000);
        driver.quit();
    }

    @Test (priority = 4)
    void Test_ImpossibleRequest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        Fitness_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("I want to lose 150 lbs a day, can you please help me?");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(100000);
        driver.quit();
    }


}
