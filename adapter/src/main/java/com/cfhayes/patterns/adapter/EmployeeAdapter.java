package com.cfhayes.patterns.adapter;

public class EmployeeAdapter implements Employee {

    private EmployeeLdap employeeLdap;

    public EmployeeAdapter(EmployeeLdap employeeFromLdap) {
        this.employeeLdap = employeeFromLdap;
    }

    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getEmail();
    }

    public Employee getEmployee() {
        Employee employee = new EmployeeDB(
                employeeLdap.getCn(),
                employeeLdap.getGivenName(),
                employeeLdap.getSurname(),
                employeeLdap.getEmail());
        return employee;
    }
}
