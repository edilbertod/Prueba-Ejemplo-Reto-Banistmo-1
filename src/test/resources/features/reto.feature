#Autor: Edilberto Duncan
  #language: es

  @HistoriaDeUsuario
  Característica: Descargar documento de “Codigo de Buen Gobierno”.
    Yo como usuario quiero ingresar a la página web de Bancolombia para acceder a la sección Información Corporativa y descargar el documento "Codigo de Buen Gobierno".
  @Escenario1:
  Escenario: descargar documento Codigo de Buen Gobierno
  Dado ingreso a la pagina web de bancolombia
  Cuando accedo a la sección informacion corporativa para acceder a documentos de interes
  Y descargar el reporte
  Entonces Verifico que el documento descargado sea el correcto
