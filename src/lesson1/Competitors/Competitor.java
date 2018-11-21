package lesson1.Competitors;

public interface Competitor {
    void run(int distance);
    void swim(int distance);
    void jump(int height);
    boolean isOnDistance();
    void showResult();
    String getType();
    String getName();
    int getMaxRunDistance();
    int getMaxJumpHeight();
    int getMaxSwimDistance();
}
