package com.ruch.employeeservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "employees")
public class Employee {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String departmentId;  // Stores Department ID

    // Constructors
    public Employee() {}

    public Employee(String name, String departmentId) {
        this.name = name;
        this.departmentId = departmentId;
    }

}
