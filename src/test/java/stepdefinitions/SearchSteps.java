package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SearchPage;

public class SearchSteps {

    WebDriver driver;
    SearchPage loginPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginPage = new SearchPage(driver);
    }





    @Given("User Lanc the url")
    public void user_lanc_the_url() {
        SearchPage sp = new SearchPage(driver);
        sp.launch_url();


    }





    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}