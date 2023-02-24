#Autor: Danny Ruiz
#Language: es

@Login
Feature: Login en la plataforma de gestion Efectigo
  como usuario de plataforma de gestion Efectigo
  Quiero iniciar sesion

  Scenario Outline: Inicio de Sesion Exitoso
    Given el usuario quiere ingresar a la plataforma de gestion efectigo
    When el usuario ingresa el <usuario> y <password> en la plataforma de gestion efectigo
    Then podra ingresar a la plataforma de gestion Efectigo

    Examples:
      | usuario                       | password    |
    ##@externaldata@./src/test/resources/dataDriven/dataEfectiGO.xlsx@UsuariosEfectiGo
|"marcozamudio@multiplica.com"|"Abcd1234."|
