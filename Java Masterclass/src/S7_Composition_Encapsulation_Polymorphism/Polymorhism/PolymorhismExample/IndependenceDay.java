package S7_Composition_Encapsulation_Polymorphism.Polymorhism.PolymorhismExample;

public class IndependenceDay extends Movie{

    public IndependenceDay() {
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens attempts to take over planet earth";
    }
}
