# SwagLabs-Testing
A BDD approach to testing a mock e-commerce website.

### Tools used:
- Java -> Programming language.
- IntelliJ -> IDE used to develop the program. Specifically useful due to backed-in plugins such as cucumber.
- Maven -> Build management tool, used solely as a dependency manager for the purposes of this project.
- Junit -> Used for testing in conjunction with selenium and cucumber.
- Cucumber -> BDD, takes business requirements and translates them into automated tests.
- Log4j(sf) -> Logging tool.
- Selenium -> Used to run a webdriver and programmatically interact with a browser.

### Brief explanation:


### Methods available in Page Object Models:
#### Login Page
  - **setUsername(String)** -> Used to set username field.
  - **setPassword(String)** -> Used to set password field.
  - **clickSubmit()** -> Clicks the submit button.
  - **getErrorMessage()** -> return an error message as a String.

#### Products Page
  -> Item Names = Backpack, BikeLight, BoltTShirt, FleeceJacket, Onesie, RedTShirt.
  - **clickAdd[ITEM]ToCart()** -> Replace [ITEM] with the name of an item to add it to your cart.
  - **clickRemove[ITEM]FromCart()** -> Replace [ITEM] with the name of an item to remove it from your cart.
  - **click[ITEM]Image()** -> Replace [ITEM] with the name of an item to click on its image link.
  - **click[ITEM]NameLink()** -> Replace [ITEM] with the name of an item to click its name link.
  - **clickCartButton()** -> Clicks the cart button link.
  - **getCartBadgeNumber()** -> Returns the number from the shopping cart badge (how many items in your cart). If the badge is not present this method returns 0.
  - **clickProductSortButton()** -> Used to open the product sort drop-down menu.
  - **clickProductSortNameAZ()** -> Clicks the sort by name A-Z filter button.
  - **clickProductSortNameZA()** -> Clicks the sort by name Z-A filter button.
  - **clickProductSortPriceLH()** -> Clicks the sort by price low-high filter button.
  - **clickProductSortPriceHL()** -> Clicks the sort by price high-low filter button.
  - **itemsAreSorted\[SORT-METHOD]()** -> Returns true or false based on whether the items are sorted by the chosen sort method (NameAZ, NameZA, PriceLH, PriceHL).
  - **add[ITEM]ToCartButtonIsPresent()** -> Returns a boolean dependent on whether the button to add a given item to the cart is present.
  - **remove[ITEM]FromCartButtonIsPresent()** -> Returns a boolean dependent on whether the button to remove a given item from the cart is present.

#### Your Cart Page
  - **clickContinueShoppingButton()** -> Clicks the continue shopping button.
  - **clickCheckoutButton()** -> Clicks the checkout button.
  - **click[ITEM]NameLink()** -> Replace [ITEM] with the name of an item to click its name link.
  - **clickRemove[ITEM]FromCart()** -> Replace [ITEM] with the name of an item to remove it from your cart.
  - **[ITEM]IsInCart()** -> Returns a boolean based on whether the item is present in the cart. (first letter of this method is lowercase. e.g. backPackIsInCart())

#### Checkout Page
  - **clickCancelButton()** -> Clicks the cancel button at the bottom of the page.
  - **clickContinueButton()** -> Clicks the continue button.
  - **clickCartButton()** -> Clicks the cart button in the top right-hand corner.
  - **getErrorMessage()** -> Returns a String containing the error message text content.
  - **clickErrorMessagesExitButton()** -> Clicks the exit button on an error message.
  - **getFirstName()** -> Gets the contents of the first name field.
  - **setFirstName(String)** -> Sets the contents of the first name field.
  - **getLastName()** -> Gets the contents of the last name field.
  - **setLastName(String)** -> Sets the contents of the last name field.
  - **getPostCode()** -> Gets the contents of the postal code field.
  - **setPostCode(String)** -> Sets the contents of the postal code field.
  - **firstNameHasErrorIcon()** -> Returns a boolean based on whether the first name field contains an error symbol.
  - **lastNameHasErrorIcon()** -> Returns a boolean based on whether the last name field contains an error symbol.
  - **postCodeHasErrorIcon()** -> Returns a boolean based on whether the post code field contains an error symbol.    

#### Checkout Overview Page
  - **clickCancelButton()** -> Clicks the cancel button.
  - **clickFinishButton()** -> Clicks the finish button.
  - **click[ITEM]NameLink()** -> Replace [ITEM] with the name of an item to click its name link.
  - **totalCostIsTaxPlusTotal()** -> Returns a boolean based on whether the total = tax + subtotal.
  - **taxIsEightPercent()** -> Returns a boolean based on whether the tax displayed is 8% of the subtotal.(+-0.1% returns true).

#### Checkout Complete page
  - **clickBackToHomePage()** -> Clicks the back to homepage button.

#### Burger Menu Component
  - **burgerMenuIsPresent()** -> Returns a boolean based on whether the burger menu component is present.
  - **clickMenuButton()** -> Clicks the burger menu button to display the options available.
  - **click[MENU_ITEM]Button()** -> Clicks the desired burger menu item button. MENU_ITEMs = Inventory, About, Logout, CloseMenu.

#### Social Buttons Component
  -> Socials = twitter, facebook, linkedin
  - **[SOCIAL]ButtonIsPresent()** -> Returns a boolean based on whether the chosen social is present.
  - **click[SOCIAL]Button()** -> Clicks on the chosen social button (e.g. clickTwitterButton()).
