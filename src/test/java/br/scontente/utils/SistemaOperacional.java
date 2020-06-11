package br.scontente.utils;

import br.scontente.exceptions.SistemaOperacionalInvalidoException;

import java.io.File;

public enum SistemaOperacional {
    WINDOWS("Windows", "chromedriver/windows/chromedriver.exe"),
    MAC("Mac", "chromedriver/mac/chromedriver"),
    LINUX("Linux", "chromedriver/linux/chromedriver.exe");

    private String sistemaOperacional;
    private String caminhoDriver;

    SistemaOperacional(String sistemaOperacional, String caminhoDriver) {
        this.sistemaOperacional = sistemaOperacional;
        this.caminhoDriver = caminhoDriver;
    }

    public static String pegarCaminhoDoDriverPorSistemaOperacional() {
        String nomeSO = System.getProperty("os.name");

        for (SistemaOperacional sistema : SistemaOperacional.values()) {
            if (nomeSO.contains(sistema.sistemaOperacional)) {
                return new File(sistema.caminhoDriver).getAbsolutePath();
            }
        }
        throw new SistemaOperacionalInvalidoException("Sistema Operacional Invalido", null );
    }

}
