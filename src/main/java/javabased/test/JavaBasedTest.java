package javabased.test;

import javabased.configuration.JavaBasedConfiguration;
import javabased.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedTest {
    public static void main(String[] args) {
        //configuration class bilgisini veriyoruz.
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedConfiguration.class);
        
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);
    }
}
