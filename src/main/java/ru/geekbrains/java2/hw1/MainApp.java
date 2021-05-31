package ru.geekbrains.java2.hw1;

public class MainApp {
    public static void main(String[] args) {
            Team[] team = {
                    new Human("Вася", 150, 8),
                    new Cat("Пушок", 80, 15),
                    new Robot("т1000", 500,100),
            };
            for (int i = 0; i < team.length; i++) {
                team[i].treadmill();
                team[i].chek();



            }


    }
}
