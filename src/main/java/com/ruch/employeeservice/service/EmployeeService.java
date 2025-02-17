package com.ruch.employeeservice.service;
import com.ruch.employeeservice.client.DepartmentClient;
import com.ruch.employeeservice.entity.Employee;
import com.ruch.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private DepartmentClient departmentClient;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public Object getEmployeeWithDepartment(Long employeeId) {
        Employee employee = repository.findById(employeeId).orElse(null);
        if (employee != null) {
            employee.setDepartment(departmentClient.getDepartmentById(employee.getDepartmentId()));
        }
        return employee;
    }
}
