package com.designpattern.designpattern.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeApp {
    @Bean
    @Scope("prototype")
    public Employee employeeStaff() {
        Employee employee = new Employee();
        employee.setPosition(Position.STAFF);
        employee.setSalary(10_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeManager() {
        Employee employee = new Employee();
        employee.setPosition(Position.MANAGER);
        employee.setSalary(20_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeVP() {
        Employee employee = new Employee();
        employee.setPosition(Position.VICE_PRESIDEN);
        employee.setSalary(30_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeCLevel() {
        Employee employee = new Employee();
        employee.setPosition(Position.C_LEVEL);
        employee.setSalary(40_000_000L);
        return employee;
    }
}
