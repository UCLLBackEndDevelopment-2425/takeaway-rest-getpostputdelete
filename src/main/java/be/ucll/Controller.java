package be.ucll;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    public List<Pizza> pizzas = new ArrayList<>();

    public Controller() {
        pizzas.add(new Pizza("Margherita", 10.00));
    }

    @GetMapping
    public List<Pizza> getPizzas () {
        return pizzas;
    }

    @GetMapping("/{price}")
    public List<Pizza> getPizza(@PathVariable double price) {
        List<Pizza> pizzasWithPrice = new ArrayList<>();
        for (Pizza pizza:pizzas) {
            if(pizza.price==price)
                pizzasWithPrice.add(pizza);
        }
        return pizzasWithPrice;
    }

}
