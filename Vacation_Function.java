import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.tree.VariableHeightLayoutCache;

import static java.lang.Thread.sleep;

public class Vacation_Function {
    //Shadow root for side panel
    SearchContext ShadowRootSidePanel(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-conversation-main > cib-side-panel"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("div.main > div.non-scroller > div > div > cib-free-sydney-persona:nth-child(3)"));
        SearchContext shadowRootThree=shadowContentTwo.getShadowRoot();
        return shadowRootThree;
    }
    //Shadow root for text area
    SearchContext Text_Area(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-action-bar-main"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("div > div.main-container > div > div.input-row > cib-text-input"));
        SearchContext shadowRootThree=shadowContentTwo.getShadowRoot();
        return shadowRootThree;
    }
    //Shadow root for submit button
    SearchContext Submit_Button(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-action-bar-main"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        return shadowRootTwo;
    }
    //Shadow root for external link
    SearchContext ShadowRootExternal(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-conversation-main"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("#cib-chat-main > cib-chat-turn"));
        SearchContext shadowRootThree=shadowContentTwo.getShadowRoot();
        WebElement shadowContentThree=shadowRootThree.findElement(By.cssSelector("cib-message-group.response-message-group"));
        SearchContext shadowRootFour=shadowContentThree.getShadowRoot();
        WebElement shadowContentFour=shadowRootFour.findElement(By.cssSelector("cib-message:nth-child(2)"));
        SearchContext shadowRootFive=shadowContentFour.getShadowRoot();
        WebElement shadowContentFive=shadowRootFive.findElement(By.cssSelector("cib-message-attributions"));
        SearchContext shadowRootSix=shadowContentFive.getShadowRoot();


        return shadowRootSix;
    }
//
    //Button Vacation Click
    void Vacation_Button_Click(WebDriver driver){
        ShadowRootSidePanel(driver).findElement(By.cssSelector("button > span > span")).click();
    }

    //Send text to search bar
    void Send_Text_To_Search(WebDriver driver,String t){
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys(t);
    }

    //Submit button click
    void Submit_Button_Click(WebDriver driver){
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
    }

    @Test(priority = 1)
    void Test_Predetermined_Budget() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        //Click into vacation button
        Vacation_Button_Click(driver);
        sleep(1000);
        //Send text
        Send_Text_To_Search(driver,"3 days in Tokyo with 300$");
        sleep(1000);
        //Click Submit to search
        Submit_Button_Click(driver);
        sleep(20000);
        driver.quit();
    }

    @Test(priority = 2)
    void Test_Unrealistic_Itinerary() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        //Click into vacation button
        Vacation_Button_Click(driver);
        sleep(1000);
        //Send text
        Send_Text_To_Search(driver,"I want to go to Vietnam and US travel in 1 day");
        sleep(1000);
        //Click to submit button to search
        Submit_Button_Click(driver);
        sleep(20000);
        driver.quit();
    }

    @Test(priority = 3)
    void Test_Availability_Accuracy() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");
        //Click to vacation button
        Vacation_Button_Click(driver);
        sleep(1000);
        //Search text
        Send_Text_To_Search(driver,"I want to go to teamLab Borderless in Odaiba");
        sleep(1000);
        //Click submit to search
        Submit_Button_Click(driver);
        sleep(20000);
        driver.quit();
    }

    @Test(priority = 4)
    void Test_External_Link() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        //Click to vacation button
        Vacation_Button_Click(driver);
        sleep(1000);
        //Search text
        Send_Text_To_Search(driver,"Flight ticket Atlanta from Fort Myers");
        sleep(1000);
        //Click submit to search
        Submit_Button_Click(driver);
        sleep(70000);
        //Click to external link
        ShadowRootExternal(driver).findElement(By.cssSelector("div > div.attribution-container > div > cib-attribution-item:nth-child(1)")).click();
        sleep(20000);
        driver.quit();
    }

}
