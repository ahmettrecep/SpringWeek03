package javabased.configuration;

import javabased.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;


// @Configuration annotation ı konfigürasyon sınıfı olduğunu belirtir.
// Burada bean tanımlarını yapacağız.
@Configuration
@PropertySource(value="classpath:employee.properties")
//properties dosyalarını load etmek için kullanıyoruz.
@ComponentScan // context-component-scan tagına karşılık gelir.
@ImportResource//ek configuration xml için kullanılabilir.
public class JavaBasedConfiguration {
    @Autowired
    private Environment env;

    //Bu annotation XML'deki <bean> tag ına karşılık gelir.
    @Bean
    public Employee createEmployee(){
        System.out.println("JavaBasedConfiguration#createEmployee");
        String name = env.getProperty("empname");
        String surname = env.getProperty("empsurname");

        return new Employee(name, surname);
    }
}