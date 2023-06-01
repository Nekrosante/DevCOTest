#Autor: Luis Miguel Arcia Moreno
#Escenarios para prueba de ingreso Block de Notas
  Feature: Crear una nota de texto enriquecido con letra en negrita
    Como Usuario Regular
    Quiero acceder a mi block de notas
    Para crear y modificarlas segun mis preferencias

  Background:
    Given Luis accede a la pagina del Block de Notas

    Scenario: Creacion de nota con letra negrilla
      When el crea una nota con letra negrilla
      Then el verifica que la nota de texto sea creada

