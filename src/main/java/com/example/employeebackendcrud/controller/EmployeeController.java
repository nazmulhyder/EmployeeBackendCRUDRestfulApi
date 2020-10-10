package com.example.employeebackendcrud.controller;
import com.example.employeebackendcrud.model.Employee;
import com.example.employeebackendcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/EmployeeApi")
@Controller
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService _employeeService;
    @PostMapping("/addEmployees")
    public List<Employee> saveEmployees(@RequestBody List<Employee> oEmployees)
    {
        return _employeeService.saveEmployees(oEmployees);
    }
    @PostMapping("/addEmployee")
    public Employee saveEmployee(@RequestBody Employee oEmployee)
    {
        return _employeeService.saveEmployee(oEmployee);
    }
    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee oEmployee)
    {
        return _employeeService.updateEmployeeById(oEmployee);
    }
    @DeleteMapping("/removeEmployee/{id}")
    public String removeEmployee(@PathVariable Integer id)
    {

        return _employeeService.removeEmployee(id);
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees()
    {
        return _employeeService.getEmployees();
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable Integer id)
    {
        return _employeeService.getEmployee(id);
    }

}
