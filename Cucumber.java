package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class amazon_steps {
WebDriver driver;
@Given("I am on Amazon Homepage")
public void i_open_the_amazon_page() {
