package lesson1.challenges;

import lesson1.players.Player;

public class CanRun extends Challenge {
    private int distance;
    public CanRun (int distance) {
        this.distance = distance;
    }
    @Override
    public void doIt (Player player) {
        player.run(distance);
    }
}

