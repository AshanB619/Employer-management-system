package repo;

import model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//extend from our Employee class in model and we need to give primary key also
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
