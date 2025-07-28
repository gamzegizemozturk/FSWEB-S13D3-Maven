package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String email;
    String phoneNumber;
    String address;

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Overloaded constructor a
    public Person(String firstName, String lastName, int age, String email, String phoneNumber, String address) {
        this(firstName, lastName, age); // Constructor chaining
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Method to get
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

    // testing
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());

        Person person2 = new Person("Jane", "Doe", 15, "jane.doe@example.com", "123-456-7890", "123 Main St");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is teen: " + person2.isTeen());
    }
}