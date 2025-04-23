import com.pluralsight.Employee;
import java.util.List;

import static com.pluralsight.CSVReader.readCSV;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = readCSV("employees.csv");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
