package org.example;

public class Employee {
    private int id;
    private  String telephoneNumber;
    private  String name;
    private  int experience;

    public Employee(int id, String telephoneNumber, String name, int experience) {
        this.id = id;
        this.telephoneNumber = telephoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public String getName() {
        return name;
    }
    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "{ id: " + id +
                ", name: " + name +
                ", telephone: " + telephoneNumber +
                ", experience:" + experience + " }";
    }
}
