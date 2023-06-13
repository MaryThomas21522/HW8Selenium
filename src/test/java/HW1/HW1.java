package HW1;


import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HW1 extends CommonMethods {
    public static void main(String[] args) {
        // Go to website
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser =  "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // Login
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        // Click on Recruitment
        WebElement recruitmentSection = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitmentSection.click();

        // Select a date on the calendar
//        WebElement calendar = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
//        calendar.click();
        driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']/following-sibling::img")).click();

        // Select month
        WebElement mondd = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select month = new Select(mondd);
        month.selectByVisibleText("Oct");

        // Select year
        WebElement yrdd = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select year = new Select(yrdd);
        year.selectByVisibleText("2000");

        // Select date
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement dates : allDates) {
            String currentDate = dates.getText();
            if (currentDate.equals("2")) {
                dates.click();
                break;
            }
        }
    }
}

/*
Go to Syntax HRMS
Login
Click on Recruitment
Select a date on the calendar
 */
