# Урок 4. Коллекции
Создать справочник сотрудников  
Необходимо:  
Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:  
Табельный номер  
Номер телефона  
Имя  
Стаж  
Добавить метод, который ищет сотрудника по стажу (может быть список)  
Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)  
Добавить метод, который ищет сотрудника по табельному номеру  
Добавить метод добавление нового сотрудника в справочник  

## Class Main
```java
package org.example;



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
```
## Class Employee
```java
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

```
## Class Directory
```java
package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directory {
    private List<Employee> employees;

    public Directory() {
        this.employees = new ArrayList<>();
    }

    //Добавить метод, который ищет сотрудника по стажу (может быть список)
    public List<Employee> SearchForEmployeesByExperience(double experience) {
        return employees.stream().filter(employee -> employee.getExperience() == experience)
                .collect(Collectors.toList());
    }

    //Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
    public List<String> SearchTelephoneNumberByName(String name) {
        return employees.stream().filter(employee -> employee.getName().equals(name))
                .map(employee -> "{ name: " + employee.getName()
                        + " phone: " + employee.getTelephoneNumber()
                        + " }").collect(Collectors.toList());
    }

    //Добавить метод, который ищет сотрудника по табельному номеру
    public Employee SearchForEmployeesById(int id) {
        return employees.stream().filter(employee -> employee.getId() == id)
                .findFirst().orElse(null);
    }


    //Добавить метод добавление нового сотрудника в справочник
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

}
```

