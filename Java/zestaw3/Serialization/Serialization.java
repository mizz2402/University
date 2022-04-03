package Serialization;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialization {

    public static void main(String[] args) {
        List employeesList = new ArrayList();
        employeesList.add(new Employee("Jan", "Kowalski", 20));
        employeesList.add(new Employee("Anna", "Kowalska", 25));
        employeesList.add(new Employee("Mateusz", "Krzywy", 30));

        Employees employees = new Employees();
        employees.setEmployees(employeesList);

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("employees.xml")));

            encoder.writeObject(employees);
            encoder.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

