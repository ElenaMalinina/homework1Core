package lesson1.challenges;

import lesson1.players.Player;

public class CanSwim extends Challenge {
    private int distance;
    public CanSwim (int distance) {
        this.distance = distance;
    }
    @Override
    public void doIt (Player player) {
        player.swim(distance);
    }

}
