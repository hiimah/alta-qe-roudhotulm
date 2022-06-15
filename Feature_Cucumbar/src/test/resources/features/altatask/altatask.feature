Feature: Postage Calculation

  Scenario Outline: Postage Calculation Functionality
    When I want count <Length> with <Width> with <Height> and <NetWeight>
    Then I get total weight <VolWeight> and get total pay <Postage>
    Examples:
      | Length | Width | Height | NetWeight | VolWeight | Postage |
      | 40     | 40    | 40     | 2         |  12       | 10000   |
      | 40     | 60    | 5      | 4         |  2        | 20000   |
      | 60     | 45    | 95     | 6         |  51       | 30000   |

