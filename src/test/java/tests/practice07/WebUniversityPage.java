package tests.practice07;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebUniversityPage {

    public WebUniversityPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@type='text']")
    public WebElement addNewTodo;  // public yapma nedenimiz WebUniversityPage class ı farklı package de ise oradan kullanmaktır.

    @FindBy (xpath = "//li")
    public List<WebElement> todosWebElement;

    @FindBy(xpath = "//*[@class='fa fa-trash']")
    public List<WebElement> deleteButtonsWebElement;

    @FindBy (xpath = "//*[@placeholder='Add new todo']")
    public WebElement todo;


}
