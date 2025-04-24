import com.pluralsight.CSVReader;
import com.pluralsight.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.pluralsight.CSVReader.readCSV;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Employee> employees = readCSV("employees.csv");

        for (Employee employee : employees) {
            CSVReader.writeCSV(employee, "test.csv");
        }
    }
}
