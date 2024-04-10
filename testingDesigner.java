import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class testingDesigner {

    SearchContext Designer_Click(WebDriver driver) {
        WebElement shadowHost = driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#cib-conversation-main > cib-side-panel"));
        SearchContext shadowRootTwo = shadowContent.getShadowRoot();
        WebElement shadowContentTwo = shadowRootTwo.findElement(By.cssSelector("div.main > div.non-scroller > div > div > cib-free-sydney-persona:nth-child(2)"));
        SearchContext shadowRootThree = shadowContentTwo.getShadowRoot();
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

    SearchContext Submit_Button(WebDriver driver) {
        WebElement shadowHost = driver.findElement(By.className("cib-serp-main"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#cib-action-bar-main"));
        SearchContext shadowRootTwo = shadowContent.getShadowRoot();
        return shadowRootTwo;
    }

    @Test(priority = 1)
    void restriction() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\willi\\Desktop\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("software_testing19@outlook.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("softwaretesting19");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();

        Designer_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        Thread.sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Depict president Bill Clinton as a circus clown");
        Thread.sleep(2000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        Thread.sleep(9000);
        driver.quit();
    }
    @Test(priority = 2)
    void image_render() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\willi\\Desktop\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("software_testing19@outlook.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("softwaretesting19");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();

        Designer_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        Thread.sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Render a real life realistic image of downtown Los Angeles");
        Thread.sleep(3000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        Thread.sleep(40000);
        driver.quit();
    }
    @Test(priority = 3)
    void input_processing() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\willi\\Desktop\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("software_testing19@outlook.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("softwaretesting19");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();

        Designer_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        Thread.sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Draw a yellow wooden toy car next to a basketball");
        Thread.sleep(3000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        Thread.sleep(50000);
        driver.quit();
    }
    @Test(priority = 4)
    void stylistic_expression() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\willi\\Desktop\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Go to the URL
        driver.get("https://copilot.microsoft.com");

        driver.findElement(By.xpath("//*[@id='id_a']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='b_idProviders']/li[1]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("software_testing19@outlook.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("softwaretesting19");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='acceptButton']")).click();

        Designer_Click(driver).findElement(By.cssSelector("button > span > span")).click();
        Thread.sleep(1000);
        Text_Area(driver).findElement(By.cssSelector("#searchbox")).sendKeys("Render a painting of a beach but in the style of Van Gogh");
        Thread.sleep(1000);
        Submit_Button(driver).findElement(By.cssSelector("div > div.main-container > div > div.bottom-controls > div.bottom-right-controls > div.control.submit > button")).click();
        Thread.sleep(50000);
        driver.quit();
    }

}
