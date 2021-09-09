package lesson1.players;

public class Team {
    String teamName;
    Player[] gameTeam;
    public Team (String teamName, Player[] gameTeam) {
        this.teamName = teamName;
        this.gameTeam = gameTeam;
    }
    public String getTeamName(){
        return "Команда " +teamName;
    }

    public Player[] getGameTeam() {
        return gameTeam;
    }
    public void totalResults(){
        for (Player p: gameTeam){
            p.totalResult();
        }
    }
    public void showMembersFinishedCourse(){
        for (Player c: gameTeam){
            if (c.isOnDistance())
                c.totalResult();
        }
    }
}
