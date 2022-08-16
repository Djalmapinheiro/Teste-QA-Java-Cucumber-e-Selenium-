
@cadastrar
Feature: Cadastrar Customer
Como usuario
quero enviar os dados via formulario
Para cadastrar um novo customer

Scenario: Cadastrar customer
Given que selecione o bootstrap v4
And acessar o formulario
When enviar o formulario
Then valido a mensagem de envio