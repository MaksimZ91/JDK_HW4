package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.addEmployee(new Employee(1,"1 123 45 65", "Иван", 25));
        directory.addEmployee(new Employee(2,"1 123 46 66", "Максим", 27));
        directory.addEmployee(new Employee(3,"1 123 47 67", "Петр", 31));
        directory.addEmployee(new Employee(4,"1 123 48 68", "Роман", 5));
        directory.addEmployee(new Employee(5,"1 123 49 69", "Анна", 25));
        directory.addEmployee(new Employee(6,"1 123 50 70", "Роман", 48));

        System.out.println(directory.SearchForEmployeesByExperience(25));
        System.out.println(directory.SearchTelephoneNumberByName("Роман"));
        System.out.println(directory.SearchForEmployeesById(3));

    }
}