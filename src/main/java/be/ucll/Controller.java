package be.ucll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    public List<Pizza> pizzas = new ArrayList<>();

    public Controller() {
        pizzas.add(new Pizza("Margherita", 10.00));
        pizzas.add(new Pizza("Napolitana", 12.50));
        Ingredrient mozzarella = new Ingredrient("Cheese", "Mozzarella");
        Ingredrient nachos = new Ingredrient("Vegtable", "Nachos");
    }

    @GetMapping
    public List<Pizza> getPizzas () {
        return pizzas;
    }
}
