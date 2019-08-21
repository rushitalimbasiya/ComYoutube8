package Com.Youtube8;
import org.junit.Assert;
import org.openqa.selenium.By;

import static Com.Youtube8.BrowserSelector.browserSelection;

//8.	www.youtube.com, search: Take screen short of the failed test; play  Mukech otwani's video.


public class HomePage extends Util {

    public static void main(String[] args) {

        LoadProp loadProp = new LoadProp();
        BrowserSelector browserSelector = new BrowserSelector();
        browserSelection();

        //for open url
        driver.get(loadProp.getProperty("url"));
        // click on  search box
        clickOnElement(By.xpath("//form/div/div/input"));
        //enter in search box Take Screenshort of the failed test
        sendKeyMethod(By.xpath("//form/div/div/input"), loadProp.getProperty("Enter"));

        //click on search button
        clickOnElement(By.cssSelector(".style-scope ytd-searchbox>form>button>yt-icon"));
        //play mukesh otwani video
        clickOnElement(By.xpath("//a[@aria-label='How to Capture Screenshot in Selenium Webdriver by Mukesh otwani 3 years ago 26 minutes 145,269 views']"));

        //assert Mukesh otwani name
        String expectedResult = "Mukesh otwani";
        String actualResult = driver.findElement(By.xpath("//yt-formatted-string[@id='owner-name']/a")).getText();
        Assert.assertEquals(expectedResult, actualResult);

        driver.close();
    }
}