package lesson1;
import lesson1.challenges.*;
import lesson1.players.*;


public class Main {
    public static void main(String[] args) {
        Player[] players = {new Cat("Барсик", "черный", 6), new Turtle("Донателло", "зеленый", 1), new Wolf("Серый", "серый", 3)};
        Challenge[] challenges = {new CanRun(200), new CanJump(2), new CanSwim (15)};
        Team team = new Team("Животные", players);
        System.out.println(team.getTeamName());
        Course course = new Course(challenges);
        System.out.println();course.doIt(team);
        System.out.println();team.totalResults();
        System.out.println("Победитель соревнований - ");team.showMembersFinishedCourse();
    }
}
