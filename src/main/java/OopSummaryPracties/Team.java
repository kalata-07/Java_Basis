package OopSummaryPracties;

import java.util.LinkedList;

public class Team {
    private String name;
    private int rating;
    public LinkedList<Player> playerList = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        CalculateCurrentRating();
        return rating;
    }

    public Team(String name){
        setName(name);
    }

    public void AddPlayerToTheTeam(Player player){
        playerList.add(player);
       // CalculateCurrentRating();
    }

    public void RemovePlayerFromTheTeam(Player player){
        if(playerList.contains(player)){
        playerList.remove(player);
       // CalculateCurrentRating();
        }else {
            System.out.println("No such player");
        }
    }

    private void CalculateCurrentRating(){
        int result=0;
        for (Player player:playerList) {
            result+=player.GetOverallSkills();
        }

       rating= result/playerList.size();
    }
}
