package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.awt.dnd.DragGestureEvent;
import java.util.ConcurrentModificationException;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
       String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        loginPage.loginAsTeacher();
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

        BrowserUtils.waitFor(2);
        String actualTest = dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualTest.contains("Welcome"));
    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {
        System.out.println("I enter student username and password and click login button");
    }

    @When("The user enters developer credentials")
    public void theUserEntersDeveloperCredentials() {
        loginPage.loginAsDeveloper();    }

    @When("The user enters tester credentials")
    public void theUserEntersTesterCredentials() {
        System.out.println("I enter tester username and password and click login button");
    }


    @When("The user logs using {string} and {string}")
    public void theUserLogsUsingAnd(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        loginPage.login(username, password);
    }

    @And("The welcome message contains {string}")
    public void theWelcomeMessageContains(String user) {
        BrowserUtils.waitFor(2);
        String actualMessage = dashboardPage.welcomeMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals("Welcome " + user, actualMessage);
    }


}
