package OopSummaryPracties;

public class Test {
    public static void main(String[] args) {
        Team barcelona = new Team("Barcelona");

        PlayerStats messiStats = new PlayerStats(75,85,84,92,67);
        Player messi = new Player("Messi", messiStats);

        PlayerStats piqueStats = new PlayerStats(95,82,82,89,68);
        Player pique = new Player("Pique", piqueStats);


        barcelona.AddPlayerToTheTeam(messi);
        System.out.println(barcelona.getRating());
        barcelona.AddPlayerToTheTeam(pique);
        System.out.println(barcelona.getRating());
        barcelona.RemovePlayerFromTheTeam(pique);

        System.out.println(barcelona.getRating());
    }
}
