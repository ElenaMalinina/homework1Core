package lesson1.challenges;

import lesson1.players.Player;

public class CanJump extends Challenge {
    private int height;
    public CanJump (int height) {
        this.height = height;
    }
    @Override
    public void doIt (Player player) {
        player.jump(height);
    }
}
