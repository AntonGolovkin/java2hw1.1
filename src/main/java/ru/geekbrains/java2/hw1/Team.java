package ru.geekbrains.java2.hw1;

public interface Team {
    int wall_size=100;
    void jump();

    int cross_distance=200;
    void cross();

    default boolean chek() {
        cross();
        jump();
        return true;
    }
}
