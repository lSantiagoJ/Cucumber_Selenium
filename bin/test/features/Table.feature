
Feature: Vamos a realizar test de una tabla statica


Background: como usuario navega a la pagina web de la tabla
  Given Navego al sitio web de la tabla statica
  
@Table
Scenario: Validar el valor que retirna la celda fila 5 columna 2
  Then Como usuario valido el valor de la celda fila 5 columna 2

  Scenario: Validar que la tabla se muestre
  Then Como usuario valido si la tabla se muestra en la pagina

  