package S10_Generics.GenericsExample;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> barcelona = new Team<>("Barcelona");
        barcelona.addPlayer(joe);
//        barcelona.addPlayer(beckham);
        Team<BaseballPlayer> baseballTeam = new Team<>("Bayern MNC)");
        baseballTeam.addPlayer(pat);

        System.out.println(barcelona.numPlayers());
    }
}
