package com.cfhayes.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private List<Employee> employees;

    public EmployeeRepository() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
