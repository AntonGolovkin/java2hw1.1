package ru.geekbrains.java2.hw1;

public interface Team {
    int wall_size=10;
    void jump();

    int treadmill_distance=100;
    void treadmill();

    default boolean chek() {
        treadmill();
        jump();
        return true;
    }
}
