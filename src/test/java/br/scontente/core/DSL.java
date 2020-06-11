package br.scontente.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static br.scontente.core.DriverFactory.*;

public class DSL {

    public void abrirURLcomWebDriver(String url) {
        pegarDriver().get(url);
    }

    public WebElement encontrarElemento(By by) {
        return pegarDriver().findElement(by);
    }

    public WebElement esperarPresencaDeElemento(By by, int timeout) {
        return new WebDriverWait(pegarDriver(), timeout).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> esperarPresencaDeLista(By by, int timeout) {
        return new WebDriverWait(pegarDriver(), timeout).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

}
