Feature: Login
  As a user
  I should be abe to use login services
  to access different details

Scenario:
  If i use incorrect credentials when logging in i receive an error
  Given I am able to access the sign in page
  And the site works
  When I use incorrect credentials to login
  Then I receive a viable error



