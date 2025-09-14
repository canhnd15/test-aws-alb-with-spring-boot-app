package com.example.demo;

/**
 * Represents a student in the system.
 * Demonstrates proper Java coding standards and OOP principles.
 */
public class Student {
    // Fields (attributes)
    private String id;
    private String name;
    private int age;
    private double gpa;

    // Constructor
    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Default constructor
    public Student() {
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Student ID cannot be null or blank");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Student name cannot be null or blank");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Student age must be non-negative");
        }
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.gpa = gpa;
    }

    // Utility method
    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }

    // toString for debugging/logging
    @Override
    public String toString() {
        return String.format("Student{id='%s', name='%s', age=%d, gpa=%.2f}", id, name, age, gpa);
    }
}
