Feature: To Login the OrangeHRM page
#Scenario: To check OrangeHRM login functinality with "valid" user
    #Given user in on OrangeHRM login page
    #When user enters username as "Admin"in the username field
    #And user enters password as "admin123" in password field
    #And clicks on Login button
    #Then user should get page title as "OrangeHRM"
#		And close the browser
  
  Scenario Outline: To check OrangeHRM login functinality with <result> user
    Given user in on OrangeHRM login page
    When user enters username as <username> in the username field
    And user enters password as <password> in password field
    And clicks on Login button
    Then user should get page title as <title>
		#And close the browser
    Examples: 
      | result  | username | password | title     |
      | valid   | Admin    | admin123 | OrangeHRM |
      | ivalid   | Admin   | ""       | OrangeHRM |
      | ivalid   | ""      | admin123 | OrangeHRM |