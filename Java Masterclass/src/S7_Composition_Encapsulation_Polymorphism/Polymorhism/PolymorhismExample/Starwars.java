package S7_Composition_Encapsulation_Polymorphism.Polymorhism.PolymorhismExample;

public class Starwars extends Movie {
    public Starwars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}
