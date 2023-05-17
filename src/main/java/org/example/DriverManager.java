package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browser");

    public void openBrowser(){
        if (browserName.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("browser name is wrong or not implemented :" + browserName);
        }
        //open URL
        driver.get(loadProp.getProperty("url"));
        //Maximize the Window
        driver.manage().window().maximize();
        //Implying implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void closeBrowser(){

        driver.close();
    }

}
