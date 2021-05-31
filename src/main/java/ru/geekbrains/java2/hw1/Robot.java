package ru.geekbrains.java2.hw1;

public class Robot implements Team{
    private String name;
    private int distance;

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setJump_length(int jump_length) {
        this.jump_length = jump_length;
    }

    public Robot(String name, int distance, int jump_length) {
        this.name = name;
        this.distance = distance;
        this.jump_length = jump_length;
    }

    private int jump_length;

    @Override
    public void treadmill() {
        if (distance >= treadmill_distance) {
            System.out.println(name + " Пробежал!");
        } else
            System.out.println(name + " Не смог пробежать");
    }

    @Override
    public void jump() {
        if (jump_length >= wall_size)
            System.out.println(name + " Перепрыгнул!");
        else
            System.out.println(name + " Не смог перепрыгнуть");
    }

    @Override
    public boolean chek() {

        if (distance >= treadmill_distance) {
            jump();
        }
        return false;
    }
}
