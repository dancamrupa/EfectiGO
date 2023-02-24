#Autor: Danny Ruiz
#Language: es

@cancelarCredito
Feature: Cancelacion de credito en la plataforma de gestion Efectigo
  como usuario de plataforma de gestion Efectigo
  Quiero cancelar un credito solicitado

  Scenario Outline: Cancelar credito
    Given el usuario quiere ingresar a la plataforma de gestion efectigo
    When el usuario ingresa el <usuario> y <password> en la plataforma de gestion efectigo
    And el usuario selecciona la opcion de solicitar credito y selecciona la <cantidad> y el <plazo>
    And el usuario cancela el credito solicitado
    Then podra ver el mensaje de la solicitud cancelada

    Examples:
      | usuario                       | password    | cantidad | plazo   |
    ##@externaldata@./src/test/resources/dataDriven/dataEfectiGO.xlsx@CancelarCredito
|"marcozamudio@multiplica.com"|"Abcd1234."|"18000"|"9 meses"|
|"marcozamudio@multiplica.com"|"Abcd1234."|"26000"|"30 meses"|
