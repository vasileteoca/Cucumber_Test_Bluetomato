package Cucumber.CucumberUtils.stepdefinitions;

import Cucumber.CucumberUtils.pages.BlueTomatoPage;
import Cucumber.CucumberUtils.steps.BlueTomatoSteps;
import Cucumber.Utils.DriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

import java.io.IOException;

import static Cucumber.Utils.DriverUtils.setEnvironment;

public class BlueTomatoStepDefs {
    private DriverUtils pages;
    private BlueTomatoPage blueTomatoPage;

    //Do not delete
    @cucumber.api.java.Before
    public void setUp() throws IOException {
        Serenity.initializeTestSession();
        setEnvironment();
        pages.getCurrentDriver();
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        String property = variables.getProperty("webdriver.set.fullscreen");
        if (property.contains("true")) {
            blueTomatoPage.getDriver().manage().window().maximize();
        }
    }

    @Steps
    private BlueTomatoSteps blueTomatoSteps;

    @Given("^I navigate to URL \"([^\"]*)\"$")
    public void navigate(String url){
        blueTomatoSteps.navigate(url);
    }

    //_________________________________________TEST_1___________________________________________________

    @Given("^I click on the Login link$")
    public void clickLoginLink() {
        blueTomatoSteps.loginLinkClick();
    }

    @Then("^I input email address$")
    public void inputEamilAddress(){
        blueTomatoSteps.emailAddressFieldInput();
    }
    @Then("^I input password$")
    public void inputPassword(){
        blueTomatoSteps.passwordFieldInput();
    }

    @Then("^I click Login button$")
    public void clickLoginButton(){
        blueTomatoSteps.loginButtonClick();
    }

    @Then("^I click on the Profile button$")
    public void clickProfileButton(){
        blueTomatoSteps.profileButtonClick();
    }

    @Then("^I click Change Details button$")
    public void clickChangeDetailsButton(){
        blueTomatoSteps.changeDetailsButtonClick();
    }

    @Then("^I input phone number as parameter \"([^\"]*)\"$")
    public void inputPhoneNumberAsParameter(String phoneNumber){
        blueTomatoSteps.inputPhoneNumber(phoneNumber);
    }

    @Then("^I click Save button$")
    public void clickSaveButton(){
        blueTomatoSteps.saveButtonClick();
    }

    @Then("^I verify the phone number \"([^\"]*)\"$")
    public void verifyPhoneNumberLabel(String phoneNumber){
        blueTomatoSteps.assertPhoneNumberLabel(phoneNumber);
    }

    //___________________________________________TEST_2_______________________________________________________________

    @Then("^I search for a product given as parameter \"([^\"]*)\"$")
    public void searchForProduct(String product){
        blueTomatoSteps.searchForProduct(product);
    }


    @Then("^I open product page$")
    public void openProductPage(){
        blueTomatoSteps.openProductPage();
    }

    @Then("^I select the size$")
    public void selectProductSize(){
        blueTomatoSteps.selectSize();
    }

    @Then("^I press Add to Basket button$")
    public void addToBasketClick(){
        blueTomatoSteps.addToBasketClick();
    }

    @Then("^I verify the Add To Basket Label$")
    public void assertAddedToBasketLabel(){
        blueTomatoSteps.assertAddToBasketLabel();
    }

    //___________________________TEST_3________________________________

    @Then("^I click the See All Stories link$")
    public void clickSeeAllStoriesLink(){
        blueTomatoSteps.allStoriesLinkClick();

    }


    @Then("^I click on Search News button$")
    public void clickSearchNewsButton(){
        blueTomatoSteps.searchNewsButtonClick();
    }

    @Then("^I input news as parameter \"([^\"]*)\"$")
    public void inputNewsAsParameter(String news){
        blueTomatoSteps.inputNewsAsParameter(news);
    }

    @Then("^I click on first search result$")
    public void clickFirstSearchResult(){
        blueTomatoSteps.firstNewsResultItemClick();
    }

    @Then("^I assert things as parameter \"([^\"]*)\"$")
    public void assertThingsAsParameter(String things){
        blueTomatoSteps.assertNewsTitleAgainstSearchCriteria(things);
    }

    //____________________________TEST_4__________________________________

    @Then("^I click on Our Shops link$")
    public void clickOurShopsLink(){
        blueTomatoSteps.ourShopsLinkClick();
    }

    @Then("^I select Germany shops$")
    public void selectGermanyShops(){
        blueTomatoSteps.selectGermanyShops();
    }

    @Then("^I select the first shop$")
    public void selectFirstShop(){
        blueTomatoSteps.firstShopClick();
    }

    @Then("^I click on Products available in Blue Tomato Shop link$")
    public void clickProductsAvailableInBluTomatoShopLink(){
        blueTomatoSteps.productsAvailableInBlueTomatoShopLinkClick();
    }

    @Then("^I input and apply Gender Filter$")
    public void inputAndApplyGenderFilters(){
        blueTomatoSteps.inputAndApplyGenderFilters();
    }

    @Then("^I input and apply Size Filter$")
    public void inputAndApplySizeFilters(){
        blueTomatoSteps.inputAndApplySizeFilters();
    }

    @Then("^I input and apply Color Filter$")
    public void inputAndApplyColorFilters(){
        blueTomatoSteps.inputAndApplyColorFilters();
    }

    @Then("^I input and apply Brand Filter$")
    public void inputAndApplyBrandFilters(){
        blueTomatoSteps.inputAndApplyBrandFilters();
    }

    @Then("^I input and apply Fit Filter$")
    public void inputAndApplyFitFilters(){
        blueTomatoSteps.inputAndApplyFitFilters();
    }

    @Then("^I assert result$")
    public void assertResult(){
        blueTomatoSteps.assertResult();
    }





}
