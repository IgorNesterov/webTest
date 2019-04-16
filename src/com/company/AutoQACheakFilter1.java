package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoQACheakFilter1 {

    WebDriver driver;
    By category = By.linkText("Компьютерная техника");
    By subCategory = By.linkText("Ноутбуки");
    By maxPrise = By.name("Цена до");
    List<By> manuf = Arrays.asList(By.name("Производитель HP"), By.name("Производитель Lenovo"));
    By element = By.name("snipped-card2");

    public AutoQACheakFilter1(){
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        driver = new InternetExplorerDriver();
        //driver = new ChromeDriver();
    }
    public void goToCategory(){
        driver.findElement(category).click();
    }
    public void goToSubCategory(){
        driver.findElement(subCategory).click();
    }
    public void setMaxPrise(int maxPriseValue){
        String mp = Integer.toString(maxPriseValue);
        driver.findElement(maxPrise).sendKeys(mp);
    }

    public void setManuf(){
        for(int i=0;i<manuf.size();i++){
            driver.findElement(manuf.get(i)).click();
        }
    }
    public boolean checkCountElement(){
        return driver.findElements(element).size()==12;
    }

    public boolean checkManuf(){
        if(driver.findElements(By.partialLinkText("Lenovo")).size()+driver.findElements(By.partialLinkText("HP")).size()==12){
            return true;
        }
        else {
            return false;
        }
    }
}