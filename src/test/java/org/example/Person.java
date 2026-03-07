package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Eklediğimiz 3 yeni instance variable
    private String gender;
    private String city;
    private double height;

    // İlk constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // İkinci constructor (overloading + constructor chaining)
    public Person(String firstName, String lastName, int age, String gender, String city, double height) {
        this(firstName, lastName, age); // constructor chaining
        this.gender = gender;
        this.city = city;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}