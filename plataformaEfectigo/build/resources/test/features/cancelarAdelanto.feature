#Autor: Danny Ruiz
#Language: es

@cancelarAdelanto
Feature: Cancelacion de adelanto en la plataforma de gestion Efectigo
  como usuario de plataforma de gestion Efectigo
  Quiero solicitar un adelanto

  Scenario Outline: Solicitar adelanto exitosamente
    Given el usuario quiere ingresar a la plataforma de gestion efectigo
    When el usuario ingresa el <usuario> y <password> en la plataforma de gestion efectigo
    And el usuario selecciona la opcion de solicitar adelanto y selecciona el <monto>
    And el usuario cancela el adelanto solicitado
    Then podra ver el mensaje de la solicitud cancelada

    Examples:
      | usuario                       | password    | monto  |
    ##@externaldata@./src/test/resources/dataDriven/dataEfectiGO.xlsx@CancelarAdelanto
|"marcozamudio@multiplica.com"|"Abcd1234."|"2000"|
