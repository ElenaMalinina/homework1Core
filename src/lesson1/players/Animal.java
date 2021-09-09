package lesson1.players;

public abstract class Animal implements Player {
    String name;
    String color;
    int age;
    int maxRun;
    int maxJump;
    int maxSwim;
    boolean onDistance;
    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String name, String color, int age, int maxRun, int maxJump, int maxSwim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
        this.onDistance = true;
    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println(name + " пробежал!");
        } else {
            System.out.println(name + " не смог пробежать!");
            onDistance = false;
        }
    }

    public void jump(int height) {
        if (height <= maxJump) {
            System.out.println(name + " перепрыгнул!");
        } else {
            System.out.println(name + " не смог перепрыгнуть!");
            onDistance = false;
        }
    }

    public void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.println(name + " проплыл!");
        } else {
            System.out.println(name + " не смог проплыть!");
            onDistance = false;
        }
    }
    public void totalResult(){
        System.out.println(name + onDistance);
    }
}

