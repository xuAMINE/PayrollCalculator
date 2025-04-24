package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

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

    public static void writeCSV(List<Employee> employees, String fileName) throws IOException {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));

            for (Employee employee : employees) {
                bw.write(employee.displayInfoCSV());
            }
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void writeJSON(List<Employee> employees, String fileName) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.append("[\n");

            for (int i = 0; i < employees.size(); i++) {
                if (i != 0) bw.append(",\n");

                Employee employee = employees.get(i);
                bw.append(employee.displayInfoJSON());

            }
            bw.append("\n]");
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }


}
