import com.pluralsight.Employee;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static com.pluralsight.FileIO.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the employee file name: ");
        String employeeFile = sc.nextLine();
        System.out.println("Please enter a name for the output file");
        String outputFile = sc.nextLine();

        List<Employee> employees = readCSV(employeeFile);


        if (getFileExtension(outputFile).equals("csv"))
            writeCSV(employees, outputFile);
        else writeJSON(employees, outputFile);

    }
}
