package org.example;

public class Person {
    // İstenen 3 instance variable
    private String firstName;
    private String lastName;
    private int age;

    // Kendi eklediğim 3 instance variable
    private String email;
    private String phoneNumber;
    private String city;

    // İlk constructor - sadece temel bilgiler (firstName, lastName, age)
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        // Diğer alanları varsayılan değerlerle set et
        this.email = "unknown@email.com";
        this.phoneNumber = "000-000-0000";
        this.city = "Unknown";
    }

    // İkinci constructor - tüm bilgiler (constructor chaining kullanarak)
    public Person(String firstName, String lastName, int age,
                  String email, String phoneNumber, String city) {
        this(firstName, lastName, age); // Constructor chaining
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    // İstenen 4 method
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

    // Ek methodlar (kendi eklediğim alanlar için)
    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    // toString metodu (opsiyonel - daha iyi görüntü için)
    @Override
    public String toString() {
        return String.format("Person{firstName='%s', lastName='%s', age=%d, email='%s', phone='%s', city='%s'}",
                firstName, lastName, age, email, phoneNumber, city);
    }
}
