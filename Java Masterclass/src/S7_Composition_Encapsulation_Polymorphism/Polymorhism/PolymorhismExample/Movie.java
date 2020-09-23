package S7_Composition_Encapsulation_Polymorphism.Polymorhism.PolymorhismExample;

public class Movie {

    private String name;

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here";
    }

    public Movie(String name) {
        this.name = name;
    }
}
