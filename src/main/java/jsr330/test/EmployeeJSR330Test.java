package jsr330.test;

import jsr330.model.Employee;
import jsr330.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmployeeJSR330Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jsr330.xml");
        //Employee employee1 = applicationContext.getBean("employeeId1", Employee.class);
        EmployeeServiceImpl empService = applicationContext.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
        Employee employee = new Employee();
        employee.setName("Ahmet Recep");
        employee.setSurname("Yan");
        empService.saveEmployee(employee);

        // controller -> service -> dao
    }
}
