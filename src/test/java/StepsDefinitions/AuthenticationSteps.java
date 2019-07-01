package StepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.TestCase.assertEquals;

public class AuthenticationSteps {

   WebDriver driver;

    @Given("^User is on Home page$")
    public void setup() throws Throwable {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://localhost/CreditAuto/src/web/");
        driver.manage().window().maximize();
    }

    @When("^User clicks on access credit button$")
    public void User_clicks_on_access_credit_button() throws Throwable {
        driver.findElement(By.id("lnkAccesCreditAuto")).click();
    }

    @Then("^User is on login page$")
    public void User_is_on_login_page() throws Throwable{
        assertEquals(driver.findElement(By.cssSelector("legend")).getText(), "Connectez-vous");
    }

    @Then("^User provides the username as ([^\"]*) and the password as ([^\"]*)$")
    public void he_provides_the_username_and_the_password(String username,String password) throws Throwable {
        driver.findElement(By.id("username")).sendKeys("gca");
        driver.findElement(By.id("password")).sendKeys("qsi2019");
    }


    @Then("^User clicks on login button$")
    public void User_clicks_on_login_button() throws Throwable {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^User should be logged in to the application$")
    public void User_should_be_logged_in_to_the_application() throws Throwable {

        Assert.assertEquals(driver.findElement(By.cssSelector("h4")).getText(), "Bienvenue sur l'application Crédit Auto");
    }

    @Then("^User should be show an error message$")
    public void User_should_be_show_an_error_message() throws Throwable {
        assertEquals(driver.findElement(By.xpath("//div[2]/div/div/div")).getText(), "Identifiants invalides.");
    }
    @Then("^User close application$")
    public void User_close_application() throws Throwable {
        driver.quit();
    }

    @Then("^User clicks on credit button$")
    public void User_clicks_on_credit_button() throws Throwable {
        driver.findElement(By.id("lnkCredit")).click();

    }
    @Then("^User clicks on Create Contract credit button$")
    public void User_clicks_on_Create_Contract_credit_button() throws Throwable {
        driver.findElement(By.id("lnkCreerContrat")).click();
    }
    @Then("^User provides the purchase amount as ([^\"]*) and the credit amount as ([^\"]*) and the duration as ([^\"]*)$")
    public void User_provides_the_purchase_amount_and_the_credit_amount_and_the_duration(String MA, String MC, String D) throws Throwable {
        driver.findElement(By.id("form_simulation_montantAchat")).sendKeys(MA);
        driver.findElement(By.id("form_simulation_montantCredit")).sendKeys(MC);
        driver.findElement(By.id("form_simulation_duree")).sendKeys(D);
    }
    @Then("^User chooses the category as ([^\"]*)$")
    public void User_chooses_the_category(String C) throws Throwable {
        new Select(driver.findElement(By.id("form_simulation_categorie"))).selectByVisibleText(C);
    }
    @Then("^User clicks on calculate cost credit button$")
    public void User_clicks_on_calculate_cost_credit_button() throws Throwable {
        driver.findElement(By.id("calcul")).click();
        WebElement Element = driver.findElement(By.id("txtTaux"));
        //This will scroll the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
    @Then("^User verify the rate with ([^\"]*)$")
    public void User_verify_the_rate(String T) throws Throwable {
        String C = driver.findElement(By.id("txtTaux")).getAttribute("value");
        System.out.println(C);
        System.out.println(T);
        assertEquals(C, T);
      /*  if (C.equals(T)){
            System.out.println("OK");
        }
        else{
            System.out.println("KO");
        }*/
    }

    @Then("^User clicks on cancel button$")
    public void User_clicks_on_cancel_button() throws Throwable {
        driver.findElement(By.linkText("Annuler")).click();
    }
    @Then("^User clicks on create contract button$")
    public void User_clicks_on_create_contract_button() throws Throwable {
        driver.findElement(By.linkText("Créer contrat")).click();
    }
    @Then("^User provides the last name as ([^\"]*) and the first name as ([^\"]*)$")
    public void User_provides_the_last_name_and_the_first_name() throws Throwable {
        driver.findElement(By.id("name")).sendKeys("bensalem");
        driver.findElement(By.id("firstname")).sendKeys("ghizlane");
    }
    @Then("^User clicks on search button$")
    public void User_clicks_on_search_button() throws Throwable {
        driver.findElement(By.id("btnRechercher")).click();

    }
    @Then("^User select a customer$")
    public void User_select_a_customer() throws Throwable {
        driver.findElement(By.xpath("//table[@id='clients']/tbody/tr/td/div/label")).click();

    }
    @Then("^User clicks on valid button$")
    public void User_clicks_on_valid_button() throws Throwable {
        driver.findElement(By.id("submit")).click();


    }
    @Then("^User clicks on print button$")
    public void User_clicks_on_print_button() throws Throwable {
        driver.findElement(By.id("print")).click();


    }














}
