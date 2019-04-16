package com.company;

import org.openqa.selenium.By;

public class Test2 {
    public static void main(String[] args){
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        AutoQACheakFilter2 obj = new AutoQACheakFilter2();
        obj.driver.get("https://yandex.ru/");
        obj.driver.findElement(By.linkText("Маркет")).click();
        obj.goToCategory();
        obj.goToCategory();
        obj.setMaxPrise(30000);
        obj.setManuf();
        obj.checkCountElement();
        obj.checkPrice();

    }
}
