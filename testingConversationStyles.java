import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class testingConversationStyles {

    SearchContext Creative_Click (WebDriver driver){
        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#tone-description"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.className("#tone-creative"));
        SearchContext shadowRootThree=shadowContentTwo.getShadowRoot();
        return shadowRootThree;
    }
    SearchContext Text_Area(WebDriver driver) {
        WebElement shadowHost = driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#cib-action-bar-main"));
        SearchContext shadowRootTwo = shadowContent.getShadowRoot();
        WebElement shadowContentTwo = shadowRootTwo.findElement(By.cssSelector("div > div.main-container > div > div.input-row > cib-text-input"));
        SearchContext shadowRootThree = shadowContentTwo.getShadowRoot();
        return shadowRootThree;
    }

    SearchContext CreativeStylesButton(WebDriver driver){
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


    @Test(priority=1)
    void TestingCreativeStyle()  throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("maijohnny7@gmail.com");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("Roxykenjoey19681996.");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();

        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-conversation-main"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("#cib-chat-main > div > cib-welcome-container"));
        SearchContext shadowRootThree=shadowContentTwo.getShadowRoot();
        WebElement shadowContentThree=shadowRootThree.findElement(By.cssSelector("div.controls > cib-tone-selector"));
        SearchContext shadowRootFour=shadowContentThree.getShadowRoot();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].scrollIntoView();", shadowContentThree);

        sleep(10000);
        ShadowRootConversation(driver).findElement(By.cssSelector("#tone-options > li:nth-child(1) > button")).click();
        sleep(2000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Write me a poem about Florida's uniques features from other states.");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(100000);
        driver.quit();
    }

    @Test(priority=2)
    void TestingBalancedStyle()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("maijohnny7@gmail.com");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("Roxykenjoey19681996.");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();
        sleep(10000);

        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-conversation-main"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("#cib-chat-main > div > cib-welcome-container"));
        SearchContext shadowRootThree=shadowContentTwo.getShadowRoot();
        WebElement shadowContentThree=shadowRootThree.findElement(By.cssSelector("div.controls > cib-tone-selector"));
        SearchContext shadowRootFour=shadowContentThree.getShadowRoot();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].scrollIntoView();", shadowContentThree);

        ShadowRootConversation(driver).findElement(By.cssSelector("#tone-options > li:nth-child(1) > button")).click();
        sleep(2000);
        ShadowRootConversation(driver).findElement(By.cssSelector("#tone-options > li:nth-child(2) > button")).click();
        sleep(2000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Write me a paper about the solar eclipse and the precautions we should take.");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(100000);
        driver.quit();
    }

    @Test(priority=3)
    void PreciseStyle()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("maijohnny7@gmail.com");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("Roxykenjoey19681996.");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();

        WebElement shadowHost=driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot=shadowHost.getShadowRoot();
        WebElement shadowContent=shadowRoot.findElement(By.cssSelector("#cib-conversation-main"));
        SearchContext shadowRootTwo=shadowContent.getShadowRoot();
        WebElement shadowContentTwo=shadowRootTwo.findElement(By.cssSelector("#cib-chat-main > div > cib-welcome-container"));
        SearchContext shadowRootThree=shadowContentTwo.getShadowRoot();
        WebElement shadowContentThree=shadowRootThree.findElement(By.cssSelector("div.controls > cib-tone-selector"));
        SearchContext shadowRootFour=shadowContentThree.getShadowRoot();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].scrollIntoView();", shadowContentThree);

        sleep(10000);
        ShadowRootConversation(driver).findElement(By.cssSelector("#tone-options > li:nth-child(3) > button")).click();
        sleep(2000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Explain what the quadratic equation is and how it is. Give me problems and its answers.");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(100000);
        driver.quit();
    }

    @Test(priority=4)
    void TestingWithSamePromptPart1()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("maijohnny7@gmail.com");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("Roxykenjoey19681996.");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();

        WebElement shadowHost = driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#cib-conversation-main"));
        SearchContext shadowRootTwo = shadowContent.getShadowRoot();
        WebElement shadowContentTwo = shadowRootTwo.findElement(By.cssSelector("#cib-chat-main > div > cib-welcome-container"));
        SearchContext shadowRootThree = shadowContentTwo.getShadowRoot();
        WebElement shadowContentThree = shadowRootThree.findElement(By.cssSelector("div.controls > cib-tone-selector"));
        SearchContext shadowRootFour = shadowContentThree.getShadowRoot();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].scrollIntoView();", shadowContentThree);

        sleep(10000);
        ShadowRootConversation(driver).findElement(By.cssSelector("#tone-options > li:nth-child(1) > button")).click();
        sleep(2000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Write me a poem about Florida's uniques features from other states.");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(10000);

    }

    @Test(priority=5)
    void TestingWithSamePromptPart2()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("maijohnny7@gmail.com");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("Roxykenjoey19681996.");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();

        WebElement shadowHost = driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#cib-conversation-main"));
        SearchContext shadowRootTwo = shadowContent.getShadowRoot();
        WebElement shadowContentTwo = shadowRootTwo.findElement(By.cssSelector("#cib-chat-main > div > cib-welcome-container"));
        SearchContext shadowRootThree = shadowContentTwo.getShadowRoot();
        WebElement shadowContentThree = shadowRootThree.findElement(By.cssSelector("div.controls > cib-tone-selector"));
        SearchContext shadowRootFour = shadowContentThree.getShadowRoot();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].scrollIntoView();", shadowContentThree);

        sleep(10000);
        ShadowRootConversation(driver).findElement(By.cssSelector("#tone-options > li:nth-child(2) > button")).click();
        sleep(2000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Write me a poem about Florida's uniques features from other states.");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(10000);

    }

    @Test(priority=6)
    void TestingWithSamePromptPart3()  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\seleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com/");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("maijohnny7@gmail.com");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("Roxykenjoey19681996.");
        sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();

        WebElement shadowHost = driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#cib-conversation-main"));
        SearchContext shadowRootTwo = shadowContent.getShadowRoot();
        WebElement shadowContentTwo = shadowRootTwo.findElement(By.cssSelector("#cib-chat-main > div > cib-welcome-container"));
        SearchContext shadowRootThree = shadowContentTwo.getShadowRoot();
        WebElement shadowContentThree = shadowRootThree.findElement(By.cssSelector("div.controls > cib-tone-selector"));
        SearchContext shadowRootFour = shadowContentThree.getShadowRoot();
        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("arguments[0].scrollIntoView();", shadowContentThree);

        sleep(10000);
        ShadowRootConversation(driver).findElement(By.cssSelector("#tone-options > li:nth-child(3) > button")).click();
        sleep(2000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Write me a poem about Florida's uniques features from other states.");
        sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        sleep(10000);

    }

}
