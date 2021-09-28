package jsr330.service;


import jsr330.dao.EmployeeDAO;
import jsr330.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;


@Named
//@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {
    // @Autowired yerine inject kullanabiliriz.
    @Inject
    private EmployeeDAO employeeDAO;

    @Override
    public void saveEmployee(Employee employee) {
        //
        // business logic
        //
        //

        System.out.println("employeeservice#save employee");
        employeeDAO.saveEmployee(employee);
    }
}
