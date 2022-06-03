package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
