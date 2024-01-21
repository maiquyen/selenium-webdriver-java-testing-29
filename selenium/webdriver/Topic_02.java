package webdriver;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic_02 {
    @Test
    public void TC_02_Logo() {
        Assert.assertTrue(driver.findElement(By.cssSelector("img.fb_logo")).isDisplayed());
    }

}
