package S7_Composition_Encapsulation_Polymorphism.Encapsulation;

public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (this.health > 0 && this.health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
    }

    public String getName() {
        return name;
    }

    public int remainingHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }
}
