package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static List<Employee> readCSV(String fileName) {
        List<Employee> employees = new ArrayList<Employee>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double hoursWorked = Double.parseDouble(data[2]);
                double payRate = Double.parseDouble(data[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);
                employees.add(employee);
            }

            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return employees;
    }

}
