package pages;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
  
protected static WebDriver driver;
private static WebDriverWait wait;
private static Actions actions;
    

static{
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    ChromeOptions chromeOptions = new ChromeOptions();
    driver = new ChromeDriver(chromeOptions);
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}
    

public BasePage (WebDriver driver){
    BasePage.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}

public static void closeBrowser(){
    driver.quit();

}

public static void navegateTo(String url){
    driver.get(url);
}

private WebElement find(String locator){
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
   
}

public void write(String locator , String value){
    find(locator).clear();
    find(locator).sendKeys(value);
}

public void click(String locator){
    find(locator).click();
}

public String getTextElement(String locator){
    return find(locator).getText();
}

public String getValueFromTable(String locator, int row, int column){
    String cell = locator + "/table/tbody/tr[" + row + "]/td["  + column + "]";
    return find(cell).getText(); 

}

public boolean validateExistElement(String locator){
    return find(locator).isDisplayed();
}


}
