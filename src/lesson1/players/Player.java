package lesson1.players;

public interface Player {
    void run (int distance);
    void swim (int distance);
    void jump (int height);
    boolean isOnDistance();
    void totalResult();
}
