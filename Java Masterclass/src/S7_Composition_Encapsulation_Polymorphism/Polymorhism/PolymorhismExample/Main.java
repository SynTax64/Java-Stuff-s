package S7_Composition_Encapsulation_Polymorphism.Polymorhism.PolymorhismExample;

public class Main {
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgetable();
        }
        return null;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " " + movie.getName() + ": " + movie.plot());
        }
    }
}
