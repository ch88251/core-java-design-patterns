package com.cfhayes.patterns.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeClientTest {

    private EmployeeRepository repository;

    @BeforeEach
    public void setup() {
        repository = new EmployeeRepository();
    }

    @Test
    public void testClient() {
        Employee employee = new EmployeeDB("1", "John", "Doe", "jdoe@gmail.com");
        repository.addEmployee(employee);

        EmployeeLdap employeeLdap = new EmployeeLdap("2", "Jane", "Fonda", "jfonda@gmail.com");
        EmployeeAdapter adapter = new EmployeeAdapter(employeeLdap);
        repository.addEmployee(adapter.getEmployee());

        List<Employee> employeeList = repository.getAllEmployees();
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

    }
}
