#Autor: Danny Ruiz
#Language: es

@solicitarAdelanto
Feature: Solicitud de adelanto en la plataforma de gestion Efectigo
  como usuario de plataforma de gestion Efectigo
  Quiero solicitar un adelanto

  Scenario Outline: Solicitar adelanto exitosamente
    Given el usuario quiere ingresar a la plataforma de gestion efectigo
    When el usuario ingresa el <usuario> y <password> en la plataforma de gestion efectigo
    And el usuario selecciona la opcion de solicitar adelanto y selecciona el <monto>
    Then podra ver el numero de folio de la solicitud del adelanto

    Examples:
      | usuario                       | password    | monto  |
    ##@externaldata@./src/test/resources/dataDriven/dataEfectiGO.xlsx@SolicitarAdelanto
|"marcozamudio@multiplica.com"|"Abcd1234."|"1800"|
