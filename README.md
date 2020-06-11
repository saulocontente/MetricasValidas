#Metricas Validas

###Resumo:
Esse projeto implementa os cenarios de casos de teste 
   - na API https://reqres.in/api/
   - na UI do website https://www.inmetrics.com.br/


#Instruções de instalação


## Requisitos:
- Navegador Chrome na versão: 83.0.4103.61,
- Java 8 ou mais recente,
- Maven,
- Chromedriver na versão: 83.0.4103.61;


### Instalação de requisitos

- Download Java em:
    https://www.java.com/pt_BR/

- Download Maven Binary zip file at:
    http://maven.apache.org/download.cgi

    - Instale o Maven seguindo as instruções em:
        http://maven.apache.org/install.html
    
- Download Chromedriver 83.0.4103.61 em:
    https://chromedriver.chromium.org/
    
    - Se estiver usando MacOS:
        - Descompacte e substitua o Chromedriver na pasta do projeto: \chromedriver\macos  
    
    - Se estiver usando Windows:
        - Descompacte e substitua o Chromedriver na pasta do projeto: \chromedriver\windows
    
    - Se estiver usando Linux:
        - Descompacte e substitua o Chromedriver na pasta do projeto: \chromedriver\linux
    
#
# **Executando o projeto:**

- Abra a pasta da raiz do projeto no seu terminal e execute o comando:
```bash 
    $ mvn clean test 
```
- Após execução ira gerar relatórios HTML em:
    \target\report-html-API\index.html
    \target\report-html-UI\index.html
    
    