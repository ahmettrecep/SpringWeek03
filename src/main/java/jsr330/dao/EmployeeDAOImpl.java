package jsr330.dao;

import jsr330.model.Employee;
import org.springframework.stereotype.Repository;

import javax.inject.Named;

@Named
//stereotype annotationlar yerine @named annotationını kullanabiliriz.
//@Repository(value="employeeDAOImpl")
public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void saveEmployee(Employee employee) {
        System.out.println("employeedao insert");
    }
}
