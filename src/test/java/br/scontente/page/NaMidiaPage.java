package br.scontente.page;

import br.scontente.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class NaMidiaPage extends BasePage {

    private String tituloMateria;

    public String getTituloMateria() {
        return tituloMateria;
    }

    public void setTituloMateria(String tituloMateria) {
        this.tituloMateria = tituloMateria;
    }

    public List<WebElement> listaMaterias() {
        return dsl.esperarPresencaDeLista(By.xpath("//div[1]/article"), 10);
    }

    public String pegarNomeMateria(int linha) {
        return dsl.encontrarElemento(By.xpath("//div[@class = 'row list-insights']/article["+linha+"]//h3")).getText();
    }

    public void abrirMateria(int linha) {
        dsl.encontrarElemento(By.xpath("//div[1]/article["+linha+"]/a[1]")).click();
    }

    public String pegarTituloMateria() {
        return dsl.esperarPresencaDeElemento(By.xpath("//div[@class = 'col-md-12 text-center top-post']/h1"), 10).getText();
    }

}
