package S6_Inheritance_Constructors_Classes.Burger_Factory;

import javax.xml.stream.FactoryConfigurationError;

public class Main {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger = burgerFactory.createBurger();
        HealthyBurger healthyBurger = burgerFactory.createHealthyBurger();
    }
}
