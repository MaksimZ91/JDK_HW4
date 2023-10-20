package org.example;

/*Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
 */

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
