package ru.geekbrains.java2.hw1;

public class Human implements Team{
    private String name;
    private int distance;
    private int jump_length;

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setJump_length(int jump_length) {
        this.jump_length = jump_length;
    }

    public Human(String name, int distance, int jump_length) {
        this.name = name;
        this.distance = distance;
        this.jump_length = jump_length;
    }

    @Override
    public void cross() {
        if (distance >= cross_distance) {
            System.out.println("чувак [" + name + "]: пробежал");
        } else
            System.out.println("чувак [" + name + "]: я ленивый, я столько не бегаю");
    }

    @Override
    public void jump() {
        if (jump_length >= wall_size)
            System.out.println("чувак [" + name + "]: перепрыгнул");
        else
            System.out.println("чувак [" + name + "]: я не могу так прыгать");
    }
    @Override
    public boolean chek() {

        if (distance>=cross_distance){
            jump();
        }
        return false;
    }
}
