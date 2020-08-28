package com.gmail.dymitr.kuzmin.Decorator;

import com.gmail.dymitr.kuzmin.Decorator.Pizzas.*;
import com.gmail.dymitr.kuzmin.Decorator.Toppings.*;

/**
 *  https://www.geeksforgeeks.org/decorator-pattern-set-3-coding-the-design/
 */

public class Pizzeria {

    public static void main(String[] args) {
        Pizza pizzaPeppyPaneer = new PeppyPaneer();

        pizzaPeppyPaneer = new Jalapenio(pizzaPeppyPaneer);
        pizzaPeppyPaneer = new FreshTomato(pizzaPeppyPaneer);
        pizzaPeppyPaneer = new Paneer(pizzaPeppyPaneer);

        pizzaPeppyPaneer.print();
    }
}
