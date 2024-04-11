import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.Set;

public class printInfo {

    public static void main(String[] args) throws IOException {
        // Set system property for WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\willi\\Desktop\\driver\\chromedriver.exe");
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Go to website
        driver.get("https://copilot.microsoft.com/");

        // Call methods to print information
        printTitle(driver);
        printURL(driver);
        printElementSize(driver);
        printElements(driver);
        screenshot(driver);

        // Close the driver
        driver.quit();
    }

    public static void printTitle(WebDriver driver) {
        String title = driver.getTitle();
        System.out.println("Title: " + title);
    }

    public static void printURL(WebDriver driver) {
        String url = driver.getCurrentUrl();
        System.out.println("URL: " + url);
    }

    public static void printElementSize(WebDriver driver) {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of elements: " + links.size());
    }

    public static void printElements(WebDriver driver) {
        System.out.println("Elements:");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        List<WebElement> spans = driver.findElements(By.tagName("span"));


        // Print non-empty links
        for (WebElement link : links) {
            String text = link.getAccessibleName().trim();
            if (!text.isEmpty()) {
                System.out.println(text);
            }
        }

        // Print non-empty spans
        System.out.println("Spans:");
        for (WebElement span : spans) {
            String text = span.getText().trim();
            if (!text.isEmpty()) {
                System.out.println(text);
            }
        }
    }
    public static void screenshot(WebDriver driver) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File des = new File("project_screenshot.png");
        FileHandler.copy(src, des);
        driver.close();
    }

}

