@Regression
Feature: Blue Tomato change phone number to a logged in user
       As a logged in user
       I want to change my phone number in my account
       Add to basket and verify basket
       Search for news article
       Filter product in a specific shop
       Using Java, cucumber and serenity

       @Test1 Change phone number
       Scenario Outline: Log in and change the phone number in my account
          Given I navigate to URL "https://www.blue-tomato.com/en-GB"
          Given I click on the Login link
          Then I input email address
          Then I input password
          Then I click Login button
          Then I click on the Profile button
          Then I click Change Details button
          Then I input phone number as parameter "<phonenumber>"
          Then I click Save button
          Then I verify the phone number "<phonenumber>"

          Examples:
             | phonenumber |
             | 0748333035  |
             | 0788888888  |
             | 0746666666  |
             | 0735353535  |
             | 0744323232  |

       @Test2 Add to basket and verify basket
       Scenario Outline: Add product to basket and verify basket
            Given I navigate to URL "https://www.blue-tomato.com/en-GB"
            Then I search for a product given as parameter "<product>"
            Then I open product page
            Then I select the size
            Then I press Add to Basket button
            Then I verify the Add To Basket Label

            Examples:
                | product                         |
                | NIDECKER TRINITY BOA FCS 2020   |
                | ORTOVOX AVALANCHE RESCUE KIT 3+ |
                | LIB TECH NO43 C2X 146 2020      |

       @Test3 Search for news article
       Scenario Outline: Navigate and search for a news article
            Given I navigate to URL "https://www.blue-tomato.com/en-GB"
            Then I click the See All Stories link
            Then I click on Search News button
            Then I input news as parameter "<news>"
            Then I click on first search result
            Then I assert things as parameter "<things>"

            Examples:
                | news          | things           |
                | Anna Gasser   | ANNA GASSER      |
                | Snowboarding  | IVIKA JURGENSON  |

       @Test4 Filter product in a specific shop
       Scenario: Open specific shop and filter for specific product
            Given I navigate to URL "https://www.blue-tomato.com/en-GB"
            Then I click on Our Shops link
            Then I select Germany shops
            Then I select the first shop
            Then I click on Products available in Blue Tomato Shop link
            Then I input and apply Gender Filter
            Then I input and apply Size Filter
            Then I input and apply Color Filter
            Then I input and apply Brand Filter
            Then I input and apply Fit Filter
            Then I assert result



