package com.example.demo;

public class user {
    public String NAME;
    public int Age;

    public void SET_NAME(String n) {
        NAME = n;
    }

    public void set_age(int a) {
        Age = a;
    }

    public String getname() {
        return NAME;
    }

    public boolean isAdult() {
        return Age > 17 ? true : false;
    }

    public void IntroduceUSER() {
        System.out.println("Hi " + NAME + " " + Age + " years. Salary fixed = " + 12345);
    }

    public static void main(String[] args) {
        user u = new user();
        u.SET_NAME("david");
        u.set_age(28);
        u.IntroduceUSER();
    }
}
