package autowire.test;

import autowire.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");
        Employee employee1 = applicationContext.getBean("employeeId1", Employee.class);
        System.out.println(employee1);
    }
}
