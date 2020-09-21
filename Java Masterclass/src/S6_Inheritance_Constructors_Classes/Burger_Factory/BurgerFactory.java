package S6_Inheritance_Constructors_Classes.Burger_Factory;

public class BurgerFactory {

    public Burger createBurger() {
        return new Burger();
    }

    public HealthyBurger createHealthyBurger() {
        return new HealthyBurger();
    }
}
