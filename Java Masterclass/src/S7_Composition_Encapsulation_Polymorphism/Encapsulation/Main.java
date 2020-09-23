package S7_Composition_Encapsulation_Polymorphism.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "David";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("David", 90, "Sword");
        System.out.println("Remaining health " + enhancedPlayer.remainingHealth());

    }
}
