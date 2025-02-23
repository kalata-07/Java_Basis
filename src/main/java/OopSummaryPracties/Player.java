package OopSummaryPracties;

public class Player {
    private String name;
    private PlayerStats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //private PlayerStats getStats() {
     //   return stats;
   // }

    public int GetOverallSkills(){
        return stats.GetOverallSkills();
    }

    public void setStats(PlayerStats stats) {
        this.stats = stats;
    }

    public Player(String name, PlayerStats stats){
        setName(name);
        setStats(stats);
    }
}
