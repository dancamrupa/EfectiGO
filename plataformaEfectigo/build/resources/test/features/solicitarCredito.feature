#Autor: Danny Ruiz
#Language: es

@solicitarCredito
Feature: Solicitud de credito en la plataforma de gestion Efectigo
  como usuario de plataforma de gestion Efectigo
  Quiero solicitar un credito

  Scenario Outline: Solicitar credito exitosamente
    Given el usuario quiere ingresar a la plataforma de gestion efectigo
    When el usuario ingresa el <usuario> y <password> en la plataforma de gestion efectigo
    And el usuario selecciona la opcion de solicitar credito y selecciona la <cantidad> y el <plazo>
    Then podra ver el numero de folio de la solicitud del credito

    Examples:
      | usuario                       | password    | cantidad | plazo   |
    ##@externaldata@./src/test/resources/dataDriven/dataEfectiGO.xlsx@SolicitarCredito
|"marcozamudio@multiplica.com"|"Abcd1234."|"5000"|"3 meses"|
|"marcozamudio@multiplica.com"|"Abcd1234."|"25000"|"18 meses"|
