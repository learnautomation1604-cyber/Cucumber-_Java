package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private WebDriver driver;

    // Locators
//    private By username = By.id("username");
//    private By password = By.id("password");
//    private By loginButton = By.id("login");

    // Constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }


    public void launch_url(){
        driver.get("https://www.ebay.com");

    }


}