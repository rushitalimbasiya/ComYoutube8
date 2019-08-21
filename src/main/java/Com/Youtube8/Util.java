package Com.Youtube8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Util extends BasePage {

    public static void clickOnElement (By by)
    {
        driver.findElement(by).click();        // for click method
    }

    public static void clearOnElement(By by){

        driver.findElement(by).clear();        // for clear method
    }
     public static void sendKeyMethod(By by,String sendkey){
        driver.findElement(by).sendKeys(sendkey);
    }

    // Send Key Method to enter the search box
   // public static void sendKeysMethodForEnterKey(By by,Keys text) {
      //  driver.findElement(by).sendKeys(text);}

}
