package be.ucll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    public List<Pizza> pizzas = new ArrayList<>();

    public Controller() {
        pizzas.add(new Pizza("Margherita", 10.00));
        Ingredient mozzarella = new Ingredient("Cheese", "Mozzarella");
        Ingredient nachos = new Ingredient("Vegetable", "Nachos");
    }

    @GetMapping
    public List<Pizza> getPizzas () {
        return pizzas;
    }
}
