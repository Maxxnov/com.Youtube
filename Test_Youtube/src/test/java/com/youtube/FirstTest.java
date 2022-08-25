package com.youtube;

import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void firstTest() {

        System.setProperty("webdriver.chrome.driver","\\Users\\User\\IdeaProjects\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("YouTube"));


        WebElement element = driver.findElement(By.xpath("//input[@name='search_query']"));

        element.sendKeys("1545");
        element.sendKeys(Keys.ENTER);



























    }


}
