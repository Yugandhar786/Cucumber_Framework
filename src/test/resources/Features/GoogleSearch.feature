Feature: Feature to test google Search Functionality

  #Scenario Outline: Validate google search is working
    #Given Browser is Open
    #And user is on google Search page
    #When user enter "<searchcontent>" the a text in searchbox
    #And hits enter
    #Then user is navigated to search results
#
    #Examples: 
      #| searchcontent |
      #| Facebook      |
      #| Instagram     |
      #| YouTube       |

  Scenario Outline: Validate google search is working or not
    Given Browser is Open
    And user is on google Search page
    When user enter "<searchcontent>" the a text in searchbox
    And hits enter
    Then user is navigated to search results page
    And user is redirected to instagram page
    Then Browser is closed

    Examples: 
      | searchcontent |
      | Facebook      |
