# Exercise 4

All classes are now in the package `be.ucll`, our code will get a mess in no time. 
Therefor it is time to organize our code through the principle of layered architecture!
* Which packages do you need to add?
* To which package will you move the `Controller` class? Why?
* To which package will you move the `Pizza` and `Ingredient` class? Why?
* Two package are empty after the previous steps. Why? 
* Refactor the Controller class so that the layered architecture is applied.
* Test all of your end-points if they are still working correctly after the refactoring.
  * http://localhost:8080/pizza
  * http://localhost:8080/pizza/{price}
  * http://localhost:8080/pizza?price={price}