package br.scontente.feature.steps_definition;

import io.cucumber.java8.Pt;
import page.HomePage;
import page.NaMidiaPage;

import java.util.Random;

public class InMetricsWebSiteSteps implements Pt {

    private HomePage home = new HomePage();
    private NaMidiaPage midia = new NaMidiaPage();

    public InMetricsWebSiteSteps() {

        Dado("que estou no site da InMetrics", () -> {
            home.abrirPaginaInicial();
        });

        Quando("eu navego pelo conteudo do menu {string}", (String opcaoMenu) -> {
            home.abrirOpcaoDoMenu(opcaoMenu);
        });

        Entao("eu posso acessar o conteudo de noticias da InMetrics", () -> {
            Random randomLinha = new Random();
            int limite = midia.listaMaterias().size();
            int linha = randomLinha.nextInt(limite) + 1;

            if(linha <= 0 || linha > 11){
                linha = 1;
            }

            midia.setTituloMateria(midia.pegarNomeMateria(linha));

            midia.abrirMateria(linha);

            assertEquals(midia.getTituloMateria(), midia.pegarTituloMateria());
        });

    }

}