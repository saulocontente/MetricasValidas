# language: pt
# Tags: optional

Funcionalidade: Endpoint de cadastro de usuarios
  como uma aplicacao Front-End
  Eu quero enviar algumas requisicoes
  Para utilizar a API como back-end

  Cenario: Pegar lista de usuarios
    Dado que eu quero o JSON da lista de usuarios
    Quando eu pego a Lista de usuarios para a API
    Entao eu recebo status code 200


  Cenario: Inserir um usuario
    Dado que eu quero registrar um novo usuario
    Quando eu envio o usuario para a API
    Entao com o usuario Criado recebo status code 201