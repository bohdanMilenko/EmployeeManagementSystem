package Service;

import Entities.Employee;

import java.io.Serializable;

public class EmployeeService implements Serializable {

    private static volatile EmployeeService singletonInstance;

    private EmployeeService() {

    }

    public static synchronized  EmployeeService getInstance(){
        if(singletonInstance == null){
            synchronized (EmployeeService.class) {
                if(singletonInstance == null) {
                    singletonInstance = new EmployeeService();
                }
            }
        }

        return singletonInstance;
    }

    public EmployeeService readResolve(){
        return getInstance();
    }

    public void createNewEmployee(){

    }
}
