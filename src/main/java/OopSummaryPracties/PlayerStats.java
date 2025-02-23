package OopSummaryPracties;

public class PlayerStats {
    private int endurance;
    private int sprint;
    private int dribble;
    private int shooting;
    private int passing;

 //   public int getEndurance() {
 //       return endurance;
 //   }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

 //   public int getSprint() {
//        return sprint;
//    }

    public void setSprint(int sprint) {
        this.sprint = sprint;
    }

 //   public int getDribble() {
  //      return dribble;
  //  }

    public void setDribble(int dribble) {
        this.dribble = dribble;
    }

//    public int getShooting() {
//        return shooting;
//    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

//    public int getPassing() {
//        return passing;
//    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public PlayerStats(int endurance, int dribble, int shooting, int sprint, int passing){
        setDribble(dribble);
        setEndurance(endurance);
        setPassing(passing);
        setSprint(sprint);
        setShooting(shooting);
    }

    public int GetOverallSkills(){
        int result = (dribble+endurance+shooting+sprint+passing)/5;
        return result;
    }
}
