package br.scontente.page;

import core.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public void abrirPaginaInicial() {
        String url = "https://www.inmetrics.com.br/";
        dsl.abrirURLcomWebDriver(url);
    }

    public void abrirOpcaoDoMenu(String opcaoMenu) {
        dsl.encontrarElemento(By.linkText(opcaoMenu)).click();
    }


}
