package com.ruch.employeeservice.entity;

import com.ruch.employeeservice.model.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Long departmentId;

    // ✅ Add setter method for department
    @Setter
    @Transient  // This field is not stored in the database
    private Department department;

}
