package stereotype.dao;

import org.springframework.stereotype.Repository;
import stereotype.model.Employee;

@Repository(value="employeeDAOImpl")
public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public void saveEmployee(Employee employee) {
        System.out.println("employeedao insert");
    }
}
