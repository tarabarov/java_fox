package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountPage {
    private WebDriver webDriver;

    @Findby(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    private WebElement logoutButton;

    protected LoginPage signOut(){
        logoutButton.click();
        return new LoginPage(webDriver);
    }

    public AccountPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, AccountPage.class);
    }
}
