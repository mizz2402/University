package Serialization;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    List employees = new ArrayList();

    public Employees() {}


    // setters

    public void setEmployees(List employees) {
        this.employees = employees;
    }


    // getters

    public List getEmployees() {
        return employees;
    }
}
