package br.scontente.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver iniciarDriver() {
        if(driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriver pegarDriver() {
        if(driver == null) {
            iniciarDriver();
        }
        return driver;
    }

    public static void encerrarDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}
