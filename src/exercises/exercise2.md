# Exercise 1

Try the GET end-point http://localhost:8080/pizza in Postman
* What is going wrong?

Refactor the code so that the GET end-point: http://localhost:8080/pizza returns the following JSON:
```javascript
[
  {
    "name":"Margherita",
    "price":10.0,
    "veggie":false
  },
  {
    "name":"Napolitana",
    "price":12.5,
    "veggie":false
  }
]