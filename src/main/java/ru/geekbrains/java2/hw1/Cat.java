package ru.geekbrains.java2.hw1;

public class Cat implements Team{
    private String name;
    private int distance;
    private int jump_length;

    public Cat(String name, int distance, int jump_length) {
        this.name = name;
        this.distance = distance;
        this.jump_length = jump_length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setJump_length(int jump_length) {
        this.jump_length = jump_length;
    }

    @Override
    public void jump() {
        if (jump_length >= wall_size)
            System.out.println("Кот [" +name+ "]: Перепрыгнул!");
        else
            System.out.println("Кот [" +name+ "]: Не смог перепрыгнуть");
    }

    @Override
    public void cross() {
        if (distance >= cross_distance){
            System.out.println("Кот ["+name+ "]: Пробежал!");
        }
        else

            System.out.println("Кот [" +name+ "]: Не смог пробежать");

    }
    @Override
    public boolean chek() {

        if (distance >= cross_distance){
            jump();
        }
        return false;
    }
}
