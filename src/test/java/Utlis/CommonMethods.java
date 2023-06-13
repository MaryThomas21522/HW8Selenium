package Utlis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
    public static WebDriver driver; //you need to put this up here bc all methods needs to assess this
    public static void openBrowserAndLaunchApplication(String url, String browser) {

        //create instance
        driver=new ChromeDriver();

        //navigate to url
        driver.get(url);

        //maximize the screen
        driver.manage().window().maximize();

    }

    public static void closeBrowser(){

        if (driver!=null){
            driver.quit();
        }
    }

    //this is a common method that will clear the textbox and send whatever text in that element
    public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);

        //create a common method for the dropdown
    }
}

