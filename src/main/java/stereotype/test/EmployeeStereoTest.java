package stereotype.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import stereotype.model.Employee;
import stereotype.service.EmployeeServiceImpl;

public class EmployeeStereoTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("stereotype.xml");
        //Employee employee1 = applicationContext.getBean("employeeId1", Employee.class);
        EmployeeServiceImpl empService = applicationContext.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
        Employee employee = new Employee();
        employee.setName("Ahmet Recep");
        employee.setSurname("Yan");
        empService.saveEmployee(employee);

        // controller -> service -> dao
    }
}
