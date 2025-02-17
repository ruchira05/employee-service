package com.ruch.employeeservice.client;
import com.ruch.employeeservice.model.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "department-service", url = "http://localhost:8081")
public interface DepartmentClient {
    @GetMapping("/departments/{id}")
    Department getDepartmentById(@PathVariable Long id);
}