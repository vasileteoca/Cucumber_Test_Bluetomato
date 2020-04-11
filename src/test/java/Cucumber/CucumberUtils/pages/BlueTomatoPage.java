package Cucumber.CucumberUtils.pages;

import Cucumber.Utils.DriverUtils;
import com.opera.core.systems.OperaMouse;
import com.opera.core.systems.OperaWebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlueTomatoPage extends DriverUtils {

    private DriverUtils pages;

    public BlueTomatoPage(WebDriver driver) {
        super(driver);
    }

    //______________________________________TEST_1________________________________________

    @FindBy(css = "#secondaryHeader > div > div > ul > li.js-header-account > a > span")
    public WebElement loginLink;

    @FindBy(css = "#loginEmail")
    public WebElement emailField;

    @FindBy(css = "#loginPassword")
    public WebElement passwordField;

    @FindBy(css = "#loginForm > div:nth-child(3) > button")
    public WebElement loginButton;

    @FindBy(css = "#secondaryHeader > div > div > ul > li.c-header-icons__account")
    public WebElement myProfileButton;

    @FindBy(css = "div > div.textLeft > div")
    public WebElement changeDetailsButton;

    @FindBy(css = "#phoneNumber")
    public WebElement phoneNumberField;

    @FindBy(css = "#submitAccountDataButton > span")
    public WebElement saveButton;

    @FindBy(css = "#infoPhone > span.value")
    public WebElement phoneNumberLabel;

    //__________________________________TEST_2___________________________________

    @FindBy(css = "#mainNavigation > div > div > form > input")
    public WebElement searchInputField;

    @FindBy(css = "#mainNavigation > div > div > form > button > span > div")
    public WebElement searchButton;

    @FindBy(css = "#p0 > span > a")
    public WebElement firstProductCard;

    @FindBy(css = "#US_Fashion > li")
    public List<WebElement> sizeList;

    @FindBy(css = "#detailSubmit > span.c-cta-buttons__cart-txt")
    public WebElement addToBasketButton;

    @FindBy(css = "#addToCartOverlay")
    public WebElement cartFrame;

    @FindBy(css = "div > header > div")
    public WebElement addedToBasketLabel;


    //__________________________________TEST_3___________________________________


    @FindBy(css = "div:nth-child(6) > div > div > a")
    public WebElement allStoriesLink;

    @FindBy(css = "div > li > button > div > span")
    public WebElement searchNewsButton;

    @FindBy(css = "div:nth-child(2) > div > div:nth-child(2) > div > nav > ul > div > div > nav > div > div > label > input")
    public WebElement searchNewsField;

    @FindBy(css = "nav > div > div > div > div > div > a:nth-child(1)")
    public WebElement firstSearchResultItem;

    @FindBy(css = "h1")
    public WebElement titleLabel;

    //________________________________TEST_4______________________________________

    @FindBy(css = "#secondaryHeader > div > div > div > div:nth-child(2) > a")
    public WebElement ourShopsLink;

    @FindBy(css = "div > div > div > div:nth-child(1) > ul > li > div")
    public WebElement germanyShopsItem;

    @FindBy(css = "ul>li:nth-child(1)>div>a>div")
    public WebElement fistShopItem;

    @FindBy(css = "#store-detail-page-wrapper > div > div.rightArea > div > div.storeText > div:nth-child(1) > center > div > b > a")
    public WebElement availableProductsLink;

    @FindBy(css = "#vc_gender_age > div > div > div > ul > li > a > span")
    public List<WebElement> genderFilterList;

    @FindBy(css = "#vc_gender_ageSubmitButton")
    public WebElement genderFilterApplyButton;

    @FindBy(css = "#v_sizestring > div > div > ul > li")
    public List<WebElement> sizeFilterList;

    @FindBy(css = "v_sizestringSubmitButton")
    public WebElement sizeFilterApplyButton;

    @FindBy(css = "#v_color > div > div > ul > li > div")
    public List<WebElement> colorFilterList;

    @FindBy(css = "#v_colorSubmitButton")
    public WebElement colorFilterApplyButton;

    @FindBy(css = "#brand > div > div > div > ul > li > a")
    public List<WebElement> brandFilterList;

    @FindBy(css = "#brandSubmitButton")
    public WebElement brandFilterApplyButton;

    @FindBy(css = "#c_fit > div > div > div > ul > li > a ")
    public List<WebElement> fitFilterList;

    @FindBy(css = "#c_fitSubmitButton")
    public WebElement fitFilterApplyButton;

    @FindBy(css = "#c_aermellaenge > div > div > div > ul > li > a")
    public List<WebElement> sleeveLengthFilterList;

    @FindBy(css = "#c_aermellaengeSubmitButton")
    public WebElement sleeveLengthApplyButton;

    @FindBy(css = "#p0 > span > a > div > div > p")
    public WebElement resultItem;

    public void navigate(String url) {
        pages.getDriver().manage().window().maximize();
        pages.getDriver().navigate().to(url);
    }

}



