package com.studentapp.cucumber.steps;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;


@RunWith(SerenityRunner.class)

public class LoginSteps {
    @Managed  WebDriver driver;


    @Test

    @Given("^User navigates to mixcloud website$")
    public void user_navigates_to_mixcloud_website() {
        driver.get("https://www.mixcloud.com/");
        this.driver.manage().window().maximize();
    }

    @Step
    @When("^User clicks on the login button on homepage$")
    public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(), 'Log in')]")).click();
    }

    @Step
    @When("^User enters a valid username \"([^\"]*)\"$")
    public void user_enters_a_valid_username(String username) {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]//div/form/div[1]//input")).sendKeys(username);


    }
    @Step
    @When("^User enters a valid password \"([^\"]*)\"$")
    public void user_enters_a_valid(String password) {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]//div/form/div[2]//input")).sendKeys(password);

    }
    @Step
    @When("^User clicks on the login button$")
    public void user_clicks_on_the_login_button() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).submit();

    }
    @Step
    @Then("^User should be logged in$")
    public void user_should_be_logged_in() throws Throwable {
        Thread.sleep(5000);
        WebElement foxcy=driver.findElement(By.xpath("//span[contains(text(), 'foxcy')]"));
        Assert.assertEquals(true,  foxcy.isDisplayed());
    }
}




