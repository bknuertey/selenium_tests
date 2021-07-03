package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage
{
    public CheckoutPage(WebDriver driver) {this.driver = driver;}

    private WebDriver driver;

    ////initialize all variables
    private By pickUpLocation = By.xpath("//*[@id=\"mainContent\"]/form/div/div/section[1]/div[2]/div/div[1]/div/div[2]/form/div/div/a");
    private By chooseLocation = By.xpath("//button[@name='selectPickupLocation']");
    private By useLocation = By.xpath("//a[contains(text(),'Use this Address')]");
    private By paymentOption = By.xpath("//*[@id=\"mainContent\"]/form/div/section/div/div[4]/form/ul/li[1]/div/button");
    private By continueToPayment = By.name("placeOrder");
    private By checkout_iFrame = By.id("kpg-frame-component");
    private By card = By.cssSelector("#channel-template > div.data-card__content > div > div:nth-child(2) > button");
    private By cardField = By.id("card-number");
    private By dateField = By.id("expiry");
    private By cvvField = By.id("cvv");
    private By completePayment = By.id("validateCardForm");
    private By invalidMessage = By.id("error-message");

    public void clickPickUpLocation() throws InterruptedException
    {
        //go to pickup location
        driver.findElement(pickUpLocation).click();
        Thread.sleep(2000);
    }

    public void clickChooseLocation() throws InterruptedException
    {
        //select a location
        driver.findElement(chooseLocation).click();
        Thread.sleep(2000);
    }

    public void clickConfirmLocation() throws InterruptedException
    {
        //confirm location
        driver.findElement(useLocation).click();
    }

    public void clickPayNow()
    {
        //click on pay now
        driver.findElement(paymentOption).click();
    }

    public void clickContinueToPayment() throws InterruptedException
    {
        //continue to payment page
        driver.findElement(continueToPayment).click();
        Thread.sleep(5000);
    }

    public void clickPaymentType() throws InterruptedException
    {
        //create a web element
        WebElement checkoutFrame = driver.findElement(checkout_iFrame);

        //go to payment page
        driver.switchTo().frame(checkoutFrame);
        Thread.sleep(5000);

        //select card
        driver.findElement(card).click();
        Thread.sleep(5000);
    }

    public void enterCardDetails(String cardNumber, String date, String cvv)
    {
        //enter card details
        driver.findElement(cardField).sendKeys(cardNumber);
        driver.findElement(dateField).sendKeys(date);
        driver.findElement(cvvField).sendKeys(cvv);
    }

    public void clickFinalPayNow() throws InterruptedException
    {
        //confirm payment
        driver.findElement(completePayment).click();
        Thread.sleep(10000);
    }

    public String invalidMessage()
    {
        //get error message
        driver.findElement(invalidMessage).getText();
        return null;
    }

    public void closeModal() throws InterruptedException
    {
        //close modal
        driver.findElement(By.xpath("//aside[@onclick='UIHelper.returnToMerchantPage()']")).click();
        Thread.sleep(2500);
    }
}
