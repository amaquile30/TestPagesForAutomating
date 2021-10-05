Feature: Validar los resultados de las operaciones realizadas

  Scenario: Validar el resultado de la suma realizada
    Given que me encuentro en la pagina de la calculadora
    When presiono el boton "5"
    And presiono el boton de suma
    And presiono el boton "2"
    And presiono el boton igual
    Then el resultado es "7"

  Scenario Outline: Validar resultado de diferentes operaciones
    Given que me encuentro en la pagina de la calculadora
    When presiono el boton "<number1>"
    And presiono el boton de "<function>"
    And presiono el boton "<number2>"
    And presiono el boton igual
    Then el resultado es "<result>"

    Examples:
      | number1 | function       | number2 | result |
      | 5       | suma           | 2       | 7      |
      | 5       | resta          | 2       | 3      |
      | 2       | division       | 2       | 1      |
      | 5       | multiplicacion | 2       | 10      |