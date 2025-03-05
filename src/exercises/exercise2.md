# Exercise 2

Try the GET end-point http://localhost:8080/pizza in Postman
* You get a 404. What does a 404 HTTP status code mean?

Refactor the code so that the GET end-point: http://localhost:8080/pizza returns 
- a 200 HTTP status code 
- and the following JSON in the body of the response
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