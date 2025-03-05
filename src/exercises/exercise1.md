# Exercise 1

Run the given code
- What happens?
- Try the GET end-point http://localhost:8080/pizza in Postman
- What is going wrong?

Refactor the code so that 
- Spring Boot starts up correctly
- The GET end-point: http://localhost:8080/pizza returns the following json when trying it in Postman 
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
