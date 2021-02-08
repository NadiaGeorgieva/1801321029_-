Feature: Добавяне в списъка с дисциплини оценка на съответния  студент
 
  Scenario: Добавяне на оценка правилно въвеждане
    Given Потребителя отваря екран за добавяне на оценка на студент
    When  Въвежда име на дисциплината "BIT"
    And   Въвежда оценка на студента "5"
    And   Натиска бутона за добавяне на оценка 
    Then  Вижда  съобщение "Успешно добавяне" 
    

 
  Scenario: Добавяне на оценка с грешно въведени данни
    Given Потребителя отваря екран за добавяне на оценка на студент
    When  Въвежда име на дисциплината "B0T"
    And   Въвежда оценка на студента "5"
    And   Натиска бутона за добавяне на оценка 
    Then  Вижда  съобщение "Такава дисциплина няма в избрания спъсък"
  


  Scenario: Добавяне на оценка с ограничени данни
    Given Потребителя отваря екран за добавяне на оценка на студент
    When  Въвежда име на дисциплината "BIT"
    And   Въвежда оценка на студента "7"
    And   Натиска бутона за добавяне на оценка 
    Then  Вижда  съобщение "Оценката е в диапазона от 2 до 6"
    