package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.EmployeeRepo;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service  //to get springboot services
public class Employeeservice {
    private final EmployeeRepo employeeRepo;
    @Autowired // bring dependency
    public Employeeservice(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
     //get all the users in Emplyer table
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id).orElseThrow(()->new UserNotFoundException("user on this id"+id+"not found"));
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }
}
