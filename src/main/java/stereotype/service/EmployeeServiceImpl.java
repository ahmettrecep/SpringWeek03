package stereotype.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stereotype.dao.EmployeeDAO;
import stereotype.model.Employee;

@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService{

    //@Autowired annotation kullanıldıgında setter  ya da constructor a gerek yoktur.
    //Spring, private değilen de olsa inject işlemini gerçekleştirir.
    //Auto-wiring gerçekleştiğinde Spring ilgili EmployeeDAO objesini oluşturur ve bind eder.
    //Bunun için reflection tekniğini kullanır.
    @Autowired
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
