

public class Person {

    // Instance variables
    private final String firstName;
    private final String lastName;
    private final int age;

    // Eklediğimiz 3 değişken
    private String gender;
    private String city;
    private String job;

    // Constructor 1
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor 2 (Overloading + Chaining)
    public Person(String firstName, String lastName, int age, String gender, String city, String job) {
        this(firstName, lastName, age); // constructor chaining
        this.gender = gender;
        this.city = city;
        this.job = job;
    }

    // Methods
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