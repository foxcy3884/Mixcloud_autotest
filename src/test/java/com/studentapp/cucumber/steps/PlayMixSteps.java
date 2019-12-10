package com.studentapp.cucumber.steps;

import cucumber.api.PendingException;
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


@RunWith(SerenityRunner.class)


public class PlayMixSteps {
    @Managed
    WebDriver driver;

    @Test

    @Given("^User navigates to Mixcloud website$")
    public void user_navigates_to_mixcloud_website() {
        driver.get("https://www.mixcloud.com/");
        driver.manage().window().maximize();
    }

    @When("^User clicks on the login button on page$")
    public void user_clicks_on_the_login_button_on_page() throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(), 'Log in')]")).click();
    }

    @When("^User enters a valid username$")
    public void user_enters_a_valid_username() {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]//div/form/div[1]//input")).sendKeys("foxcy3884@gmail.com");
    }

    @When("^User enters a valid password$")
    public void user_enters_a_valid() {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]//div/form/div[2]//input")).sendKeys("qwerty");
    }

    @When("^User clicks on the log in button$")
    public void user_clicks_on_the_log_in_button() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).submit();
    }

    @When("^User should be successfully logged in$")
    public void user_should_be_logged_in() throws Throwable {
        Thread.sleep(2000);
        WebElement foxcy = driver.findElement(By.xpath("//span[contains(text(), 'foxcy')]"));
        Assert.assertEquals(true, foxcy.isDisplayed());
    }

    @When("^User clicks Search field$")
    public void user_clicks_Search_field() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/header/div/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/header/div/div[2]/input")).sendKeys("Martin Garrix");
    }

    @When("^User enters artistname in the Search field$")
    public void user_enters_in_the_Search_field() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/header/div/div[2]/input")).click();
    }

    @Then("^User goes to artist site$")
    public void user_goes_to_artist_site() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[4]/div/div/div[1]/div/div/section/div[1]/div[1]/div/a[5]")).click();
    }
    @Then("^User plays all available tracks of required artist$")
    public void user_plays_all_available_tracks_of_required_artist() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div/div/div[2]/div/button/div[2] ")).click();
        Thread.sleep(5000);
    }

        @Then("^User goes to profile and checks all available tracks$")
    public void user_goes_to_profile_and_checks_all_available_tracks() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/header/div/div[3]/div[1]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/header/div/div[3]/div[1]/span/div/div/ul/li[1]/a")).click();
    }

}
