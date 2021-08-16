
package school.management.system;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainSchool {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean continuo = true;
        try {
            FileStorage.read();
        } catch (Exception e) {
        }

        do {
            Processe.showMenu();
            
            
            System.out.println("Enter your choice :");
            int i = 0;
            try {
                i = in.nextInt();

            switch (i) {
                case 1:
                   Processe.addNewEmployee();
                    break;
                case 2:
                    Processe.addNewStudent();
                    break;
                case 3:
                    Processe.addNewSubject();
                    break;
                case 4:
                    Processe.showSubjects();
                    break;
                case 5:
                    Processe.showSalariesOfEmployees();
                    break;
                case 6:
                    Processe.countOfStudentInAnySubject();
                    break;
                case 7:
                    Processe.SaveData();
                case 8:
                    continuo = false;
                    break;

            }
            } catch (InputMismatchException e) {
                System.err.println("Error :Check input Type");
                in.next();
            }

        } while (continuo);

    }

}
