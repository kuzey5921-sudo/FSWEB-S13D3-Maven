package org.example;

public class MainTest {

    public static void main(String[] args) {

        // Person test
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Ali", "Yılmaz", 16);
        Person person3 = new Person("Ayşe", "Kaya", 12, "ayse@mail.com", "0555...", "Istanbul");

        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("IsTeen: " + person1.isTeen());

        System.out.println("IsTeen (person2): " + person2.isTeen());
        System.out.println("IsTeen (person3): " + person3.isTeen());

        // Wall test (sorudaki örnek)
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}