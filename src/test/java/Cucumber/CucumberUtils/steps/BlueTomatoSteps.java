package Cucumber.CucumberUtils.steps;

import Cucumber.CucumberUtils.pages.BlueTomatoPage;
import Cucumber.TestDataContainer.TestDataContainer;
import Cucumber.Utils.DriverUtils;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;


public class BlueTomatoSteps {
    private BlueTomatoPage blueTomatoPage;
    private DriverUtils pages;

  //____________________________________TEST_1_________________________________

    @Step("STEP: I navigate to URL")
    public void navigate(String url){
        blueTomatoPage.navigate(url);
    }

    @Step("STEP: I click on the login link")
    public void loginLinkClick(){
        blueTomatoPage.loginLink.click();
    }

    @Step("STEP: I input the email address")
    public void emailAddressFieldInput(){
        blueTomatoPage.emailField.sendKeys(TestDataContainer.Email);
    }

    @Step("STEP: I input the password")
    public void passwordFieldInput(){
        blueTomatoPage.passwordField.sendKeys(TestDataContainer.Pass);
    }

    @Step("STEP: Click on the Login button")
    public void loginButtonClick(){
        blueTomatoPage.loginButton.submit();
    }

    @Step("STEP: Click on the Profile button")
    public void profileButtonClick(){
        blueTomatoPage.myProfileButton.click();
    }

    @Step("STEP: Click on the Change Details button")
    public void changeDetailsButtonClick(){
        blueTomatoPage.changeDetailsButton.click();
    }

    @Step("STEP: Input Phone Number in field from parameter")
    public void inputPhoneNumber(String phoneNr){
        blueTomatoPage.phoneNumberField.clear();
        blueTomatoPage.phoneNumberField.sendKeys(phoneNr);
    }

    @Step("STEP: Click on the Save button")
    public void saveButtonClick(){
        blueTomatoPage.saveButton.click();
    }

    @Step("STEP: Verify the phone number through assert")
    public void assertPhoneNumberLabel(String phoneNr){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(blueTomatoPage.phoneNumberLabel.getText().equals(phoneNr));
    }

    //_____________________________________TEST_2_________________________________________

    @Step("STEP: I search for a product given as parameter")
    public void searchForProduct(String product){
        blueTomatoPage.searchInputField.sendKeys(product);
        blueTomatoPage.searchButton.submit();
    }

    @Step("STEP: I open the product page")
    public void openProductPage(){
        blueTomatoPage.firstProductCard.click();
    }

    @Step("STEP: I select the size")
    public void selectSize(){
        for (WebElement element: blueTomatoPage.sizeList){
            if (element.getText().equals(TestDataContainer.Size)){
                element.click();
            }
        }
    }

    @Step("STEP: I click on Add To Basket button ")
    public void addToBasketClick(){
        blueTomatoPage.addToBasketButton.click();
    }

    @Step("STEP: I assert the Added To Basket Label")
    public void assertAddToBasketLabel(){
        pages.getDriver().switchTo().frame(blueTomatoPage.cartFrame);
        Assert.assertTrue(blueTomatoPage.addedToBasketLabel.getText().contains("basket"));
        System.out.println(blueTomatoPage.addedToBasketLabel.getText());
    }

    //___________________________________TEST_3_________________________________________________

    @Step("STEP: I click on See All Stories link")
    public void allStoriesLinkClick(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) blueTomatoPage.getDriver();
        js.executeScript("javascript:window.scrollBy(0,5000)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        blueTomatoPage.allStoriesLink.click();
    }

    @Step("STEP: I click on Search News button")
    public void searchNewsButtonClick(){
        blueTomatoPage.searchNewsButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("STEP: I input News in the Search Input field as parameter")
    public void inputNewsAsParameter(String news){
        blueTomatoPage.searchNewsField.sendKeys(news);
    }

    @Step("STEP: I click on the first Search Resulst item")
    public void firstNewsResultItemClick(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        blueTomatoPage.firstSearchResultItem.click();
    }

    @Step("STEP: I assert the title of the news to contain the search criteria")
    public void assertNewsTitleAgainstSearchCriteria(String things){
        Assert.assertTrue(blueTomatoPage.titleLabel.getText().contains(things));
    }

    //________________________________________TEST_4____________________________________

    @Step("STEP: I click on Our Shops link ")
    public void ourShopsLinkClick(){
        blueTomatoPage.ourShopsLink.click();
    }

    @Step("STEP: I select Germany shops")
    public void selectGermanyShops(){
        blueTomatoPage.germanyShopsItem.click();
    }

    @Step("STEP: I click on the first Shop")
    public void firstShopClick(){
        blueTomatoPage.fistShopItem.click();
    }

    @Step("STEP: I click on Products Available in Blue Tomato Shop link")
    public void productsAvailableInBlueTomatoShopLinkClick(){
        blueTomatoPage.availableProductsLink.click();
    }

    @Step("STEP: I input and apply Gender Filters")
    public void inputAndApplyGenderFilters(){
        for(WebElement element: blueTomatoPage.genderFilterList){
            if(element.getText().equals("Male")){
                element.click();
            }
        }
        blueTomatoPage.genderFilterApplyButton.submit();
    }

    @Step("STEP: I input and apply Size Filters")
    public void inputAndApplySizeFilters(){
        for(WebElement element: blueTomatoPage.sizeFilterList){
            if(element.getText().equals(TestDataContainer.Size)){
                element.click();
            }
        }
        blueTomatoPage.sizeFilterApplyButton.submit();
    }

    @Step("STEP: I input and apply Color Filters")
    public void inputAndApplyColorFilters(){
        for(WebElement element: blueTomatoPage.colorFilterList){
            if(element.getText().equals(TestDataContainer.Color)){
                element.click();
            }
        }
        blueTomatoPage.colorFilterApplyButton.submit();
    }

    @Step("STEP: I input and apply Brand Filters")
    public void inputAndApplyBrandFilters(){
        for(WebElement element: blueTomatoPage.brandFilterList){
            if(element.getText().equals(TestDataContainer.Brand)){
                element.click();
            }
        }
        blueTomatoPage.brandFilterApplyButton.submit();
    }

    @Step("STEP: I input adn apply Fit Filters")
    public void inputAndApplyFitFilters(){
        for(WebElement element: blueTomatoPage.fitFilterList){
            if(element.getText().equals(TestDataContainer.Fit)){
                element.click();
            }
        }
        blueTomatoPage.fitFilterApplyButton.submit();
    }

    @Step("STEP: I assert the result")
    public void assertResult(){
        Assert.assertTrue(blueTomatoPage.resultItem.getText().contains(TestDataContainer.Brand));
    }
}
