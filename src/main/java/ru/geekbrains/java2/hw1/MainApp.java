package ru.geekbrains.java2.hw1;

public class MainApp {
    public static void main(String[] args) {
            Team[] team = {
                    new Human("Зураб", 200, 10),
                    new Cat("Асхаб", 340, 80),
                    new Robot("Robocop", 100,200),
            };
            for (int i = 0; i < team.length; i++) {
                team[i].cross();
                team[i].chek();



            }


    }
}
