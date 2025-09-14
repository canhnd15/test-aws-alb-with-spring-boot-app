package com.example.demo;

/**
 * A simple Java class representing a User.
 */
public class User {
    // Fields (attributes)
    private String name;
    private int age;

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to introduce the user
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I'm " + age + " years old.");
    }

    // Main method for testing
    public static void main(String[] args) {
        User user = new User("David", 28);
        user.introduce();
    }
}
