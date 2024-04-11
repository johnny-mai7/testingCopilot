import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

import static java.lang.Thread.setDefaultUncaughtExceptionHandler;
import static java.lang.Thread.sleep;

public class Copilot_Button {
    SearchContext ShadowRootActionBar(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-action-bar-main"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        return shadowRootTwo;
    }
    SearchContext Text_Area(WebDriver driver){
        SearchContext shadowRoot=ShadowRootActionBar(driver);
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("div > div.main-container > div > div.input-row > cib-text-input"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        return shadowRootTwo;
    }
    SearchContext Visual_Search(WebDriver driver)
    {
        SearchContext shadowRoot=ShadowRootActionBar(driver);
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#camera-container > cib-flyout > cib-visual-search"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        return shadowRootTwo;
    }
    SearchContext ShadowRootConversation(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-conversation-main"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("#cib-chat-main > div > cib-welcome-container"));
        SearchContext shadowRootThree=shadowContentTwo.getShadowRoot();
        WebElement shadowContentThree=shadowRootThree.findElement(By.cssSelector("div.controls > cib-tone-selector"));
        SearchContext shadowRootFour=shadowContentThree.getShadowRoot();
        return shadowRootFour;
    }

    SearchContext ShadowRootFeedBack(WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("cib-serp-feedback"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        return shadowRootTwo;
    }

    SearchContext ShadowRootSubmitFeedBack(WebDriver driver)
    {
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("cib-modal"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("div > div.modal > div > serp-feedback-dialog"));
        SearchContext shadowRootThree=shadowContentTwo.getShadowRoot();
        return shadowRootThree;
    }

    //New_Topic_Button
    @Test(priority = 1)
    void New_Topic_Button() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        //Send some question into search bar
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("3 days in Tokyo with 300$");
        sleep(1000);
        //Click to submit button then wait for the result
        ShadowRootActionBar(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(20000);
        //Click into the New Topic Button
        ShadowRootActionBar(driver).findElement(By.cssSelector("div > div.outside-left-container > div > button")).click();
        sleep(2000);
        driver.close();
    }

    //Conversation Styles
    @Test(priority = 2)
    void Conversation_Styles_Button()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");
        sleep(3000);
        //Scroll to see the conversation styles
        WebElement ele=driver.findElement(By.cssSelector("#b_sydWelcomeTemplate_ > div.b_ziTileCont.b_wlcmCont"));
        JavascriptExecutor exe=(JavascriptExecutor)driver;
        exe.executeScript("arguments[0].scrollIntoView(true);",ele);
        sleep(2000);
        //Click to test 3 button styles.
        ShadowRootConversation(driver).findElement(By.cssSelector("#tone-options > li:nth-child(3) > button")).click();
        sleep(2000);
        ShadowRootConversation(driver).findElement(By.cssSelector("#tone-options > li:nth-child(1) > button")).click();
        sleep(2000);
        ShadowRootConversation(driver).findElement(By.cssSelector("#tone-options > li:nth-child(2) > button")).click();
        sleep(5000);
        driver.close();
    }

    //Feedback Button
    @Test(priority = 3)
    void FeedBack_Button()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");
        //Click into the Feedback Button
        ShadowRootFeedBack(driver).findElement(By.cssSelector("#fbpgbt")).click();
        sleep(3000);
        //Click into the Submit button
        ShadowRootSubmitFeedBack(driver).findElement(By.cssSelector("form > div.btn-group > button.feedbackform-btn.primary-btn")).click();
        sleep(2000);
        driver.close();
    }


    //Upload Picture
    @Test(priority = 4)
    void Upload_Picture_Button() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        //Click to the camera button
        ShadowRootActionBar(driver).findElement(By.cssSelector("#camera-container > button")).click();
        sleep(1000);
        //Paste the img address
        Visual_Search(driver).findElement(By.cssSelector("#sb_imgpst")).sendKeys("https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Cheetah_at_Working_with_Wildlife.jpg/1200px-Cheetah_at_Working_with_Wildlife.jpg"+"\n");
        sleep(1000);
        //Enter the text to search bar
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("What is the name of this animal?");
        sleep(1000);
        //Click search button
        ShadowRootActionBar(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(30000);
        driver.close();
    }
}
