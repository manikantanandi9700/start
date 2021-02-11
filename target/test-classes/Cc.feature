
@tag
Feature: login in facebook app

  @tag1
  Scenario Outline: login in fb
  Given user launches browser
  When user enter username "<user>" and  password"<pass>"
  And user hit the login button
  Then user navigate to home page


    Examples: 
    |user||pass|
    |9700568045||saimanikanta|
    |65477484848||manikanta|
    