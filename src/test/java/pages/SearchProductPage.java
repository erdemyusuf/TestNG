package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchProductPage {

    public SearchProductPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()=' Products']")
    public WebElement products;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductsText;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchBox;

    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement searchButton;

    @FindBy (xpath = "//*[@class='title text-center']")
    public WebElement searchVerify;

    @FindBy (xpath = "(//*[text()='Blue Top'])[1]")
    public WebElement blueTop;


}
