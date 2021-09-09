package lesson1.challenges;

import lesson1.players.Player;
import lesson1.players.Team;

public class Course {
    Challenge[] challenges;
    public Course (Challenge[] challenges) {
        this.challenges = challenges;
    }
    public void doIt (Team team) {
        Player[] gameTeam = team.getGameTeam();
        if (gameTeam.length > 0) {
            for (Player p: gameTeam) {
                for (Challenge c: challenges) {
                    c.doIt(p);
                    if (!p.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("В команде нет игроков");
        }
    }
}
