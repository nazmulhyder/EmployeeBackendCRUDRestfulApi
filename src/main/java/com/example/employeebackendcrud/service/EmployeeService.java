package com.example.employeebackendcrud.service;

import com.example.employeebackendcrud.model.Employee;
import com.example.employeebackendcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepository _employeeRepo;
    Employee _employee = new Employee();

    public List<Employee> saveEmployees(List<Employee> oEmployees)
    {
        return _employeeRepo.saveAll(oEmployees);
    }

    public Employee saveEmployee(Employee oEmployee)
    {
        return _employeeRepo.save(oEmployee);
    }

    public List<Employee> getEmployees()
    {
        return _employeeRepo.findAll();
    }
    public Employee getEmployee(Integer id)
    {
        _employee = _employeeRepo.findById(id).orElseThrow(null);
        return _employee;
    }
    public String removeEmployee(Integer id)
    {
        _employeeRepo.deleteById(id);
        return "Employee deleted successfully";
    }
    public String updateEmployeeById(Employee oEmployee)
    {
        _employee = _employeeRepo.findById(oEmployee.getId()).orElseThrow(null);
        _employee.setName(oEmployee.getName());
        _employee.setDesignation(oEmployee.getDesignation());
        _employee.setPhone(oEmployee.getPhone());
        _employeeRepo.save(_employee);
        return "Update Successfully";
    }





}
