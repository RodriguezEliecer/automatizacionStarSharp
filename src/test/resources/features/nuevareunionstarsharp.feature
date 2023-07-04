#Autor: Eliecer Rodríguez
#language: es

@HistoriaDeUsuario
  Característica: Verificar el agendamiento de una nueva reunión en StarSharp
    Yo como usuario quiero agendar una nueva reunión en StarSharp y verificar que se haya creado satisfactoriamente

    @CasoNuevaReunion
    Esquema del escenario: Creación de una nueva reunión
      Dado que estoy en la página de inicio de StarSharp
      Cuando realizo la autenticación con las credenciales
        | loginUsuario    | loginClave   |
        | <loginUsuario> | <loginClave> |
      Y accedo al menú ORGANIZACION-UNIDADES DE NEGOCIO
      Y creo una nueva Unidad de Negocio
        | unidadReunion   |
        | <unidadReunion> |
      Y accedo al menú REUNION>REUNIONES
      Y programo una nueva reunión seleccionando la Unidad de Negocio recién creada
      Y diligencio todos los campos del formulario de la reunión
        | nombreReunion   | tipoReunion   | numeroReunion   | fechaInicio   | horaInicio   | fechaFinalizacion   | horaFinalizacion   | ubicacionReunion   | unidadReunion   | organizadorReunion   | reporteroReunion   |
        | <nombreReunion> | <tipoReunion> | <numeroReunion> | <fechaInicio> | <horaInicio> | <fechaFinalizacion> | <horaFinalizacion> | <ubicacionReunion> | <unidadReunion> | <organizadorReunion> | <reporteroReunion> |
      Entonces verifico que la reunión se haya creado satisfactoriamente
        | nombreReunion   |
        | <nombreReunion> |
      Ejemplos:
        | loginUsuario | loginClave | unidadReunion | nombreReunion     | tipoReunion | numeroReunion | fechaInicio | horaInicio | fechaFinalizacion | horaFinalizacion | ubicacionReunion | organizadorReunion | reporteroReunion |
        | admin        | serenity   | TestQA        | Reunión QA PRUEBA | Strategy    | WDM-104       | 07/05/2023  | 02:10      | 07/05/2023        | 12:00            | On Site          | Dylan Smith        | Isabella Lewis   |
