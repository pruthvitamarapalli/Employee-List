package com.example.employee;

import com.example.employee.Employee;

import java.util.*;

interface EmployeeRepository {

    ArrayList<Employee> getAllEmployees();

    Employee getEmployeeById(int employeeId);

    Employee updateEmployee(int employeeId, Employee employee);

    Employee addEmployee(Employee employee);

    void deleteEmployee(int employeeId);
}
