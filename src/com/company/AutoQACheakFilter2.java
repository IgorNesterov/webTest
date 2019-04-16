package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Arrays;
import java.util.List;

public class AutoQACheakFilter2 {

    WebDriver driver;
    By category = By.linkText("Компьютерная техника");
    By subCategory = By.linkText("Ноутбуки");
    By minPrise = By.name("Цена от");
    By maxPrise = By.name("Цена до");
    List<By> manuf = Arrays.asList(By.name("Производитель Acer"), By.name("Производитель DELL"));
    By element = By.className("n-snipped-card2");

    public AutoQACheakFilter2(){
        driver = new InternetExplorerDriver();
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
    public void setMinPrise(int minPriseValue){
        String mp = Integer.toString(minPriseValue);
        driver.findElement(minPrise).sendKeys(mp);
    }
    public void setManuf(){
        for(int i=0;i<manuf.size();i++){
            driver.findElement(manuf.get(i)).click();
        }
    }
    public boolean checkCountElement(){
        return driver.findElements(element).size()==12;
    }
    public boolean checkPrice(){
        List<WebElement> list = driver.findElements(By.className("price"));
        for(int i=0; i<list.size();i++){
            if(!((Integer.parseInt(list.get(i).getText())>20000) && (Integer.parseInt(list.get(i).getText())<25000))){
                return false;
            }
        }
        return true;
    }
}
