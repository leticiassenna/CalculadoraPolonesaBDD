Feature: Realizar calculos utilizando notacao polonesa inversa

  Scenario Outline: Calculando utilizando a notacao polonesa inversa
    Given Eu quero realizar um calculo na notacao polonesa inversa
    When Eu insiro a entrada "<Entrada>"
    Then Eu tenho a saida "<Saida>"

    Examples: 
      | Entrada           | Saida |
      | 5 1 2 + 4 * + 3 - |  14.0 |
