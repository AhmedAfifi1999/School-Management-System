
package school.management.system;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Processe {

    static ArrayList<Student> studentsList = new ArrayList<>();
    static ArrayList<Teacher> teachersList = new ArrayList<>();
    static Principal principal;
    static ArrayList<Subject> subjectsList = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("************* ****************");
        System.out.println("***School Mangagment System***");
        System.out.println("************* ****************");
        System.out.println("1. Add Employee");
        System.out.println("2. Add Student");
        System.out.println("3. Add Subject");
        System.out.println("4. Show Subjects");
        System.out.println("5. Show Employees Salaries");
        System.out.println("6. Count of Student in any Subject");
        System.out.println("7. Save data in File");
        System.out.println("8. Exit");
    }

    public static void addNewEmployee() {
        System.out.println("1. Add Principal");
        System.out.println("2. Add Teacher");
        System.out.println("Enter your choice :");
        int addEmployee = scanner.nextInt();
        if (addEmployee == 1) {
            addPrincipal();
        } else if (addEmployee == 2) {
            addTeacherEmployee();

        }

    }

    public static void addTeacherEmployee() {
        System.out.println("Enter Teacher { Id ,Name ,Address  ,Phone Number ,Email ,Basic Salary}");
        int teacherId = scanner.nextInt();
        String teacherName = scanner.next();
        String teacherAddress = scanner.next();
        String teacherPhoneNumber = scanner.next();
        String teacherEmail = scanner.next();
        double teacherBasicSalary = scanner.nextDouble();

        Teacher teacher = new Teacher(teacherId, teacherName, teacherAddress, teacherPhoneNumber, teacherEmail, teacherBasicSalary);
        teachersList.add(teacher);
    }

    public static void addPrincipal() {
        System.out.println("Enter Principal { Id ,Name ,Address ,Phone Number ,Email ,Basic Salary ,Bonus }");
        int PrincipalId = scanner.nextInt();
        String PrincipalName = scanner.next();
        String PrincipalAddress = scanner.next();
        String PrincipalPhoneNumber = scanner.next();
        String PrincipalEmail = scanner.next();
        double PrincipalBasicSalary = scanner.nextDouble();
        double principalBonus = scanner.nextDouble();

        principal = new Principal(PrincipalId, PrincipalName, PrincipalAddress, PrincipalPhoneNumber, PrincipalEmail, PrincipalBasicSalary, principalBonus);

    }

    public static void addNewStudent() {
        System.out.println("Enter Student{ Id ,Level ,Name}");
        int id = scanner.nextInt();
        int level = scanner.nextInt();
        String name = scanner.next();

        Student student = new Student(id, level, name);
        studentsList.add(student);
    }

    public static void addNewSubject() {
        ArrayList<Student> studentsSubject = new ArrayList<>();

        System.out.println("Enter Subject { Name ,Student ,Teacher } ");
        String name = scanner.next();

        Teacher teacherSubject = null;

        System.out.println("---Teacher---");
        for (Teacher teacher : teachersList) {
            System.out.println(teacher.toString());
        }
        System.out.println("set Teacher Name");
        String TeacherName = scanner.next();

        for (Teacher teacher : teachersList) {
            if (TeacherName.equals(teacher.getName())) {
                teacherSubject = teacher;
                break;
            }
        }

        System.out.println("---Students---");
        for (Student student : studentsList) {
            System.out.println(student.toString());
        }
        System.out.println("set Student Name");
        String StudentName = scanner.next();
        for (Student student : studentsList) {
            if (StudentName.equals(student.getName())) {
                if (teacherSubject != null) {
                    studentsSubject.add(student);
                    //--
                    Subject subject = new Subject(name, teacherSubject, studentsSubject);
                    subjectsList.add(subject);
                    //--
                }
                break;
            }
        }

    }

    public static void showSubjects() {
        for (Subject subject : subjectsList) {
            if (subject == null) {
                break;
            }
            System.out.println(subject.toString());
        }

    }

    public static void showSalariesOfEmployees() {

        if (principal != null) {
            System.out.println("principal : " + principal.getName() + " , Salary :" + principal.getSalary());
        } else {
            System.out.println("No Principal yet");
        }
//---
        if (!teachersList.isEmpty()) {
            for (Teacher teacher : teachersList) {
            
                System.out.println("Teacher : " + teacher.getName() + " , Salary : " + teacher.getSalary());
            }
        } else {
            System.out.println("No Teacher yet");
        }
    }

    public static void countOfStudentInAnySubject() {

        System.out.println("--- Subject ---");
        for (Subject subject : subjectsList) {
            System.out.println(" Subject Name : " + subject.getName());

        }

        System.out.println("Pick one Subject (Write Subject Name) ");
        String subject = scanner.next();
        for (Subject subject1 : subjectsList) {
            if (subject1.getName().equals(subject)) {
                System.out.println("number of Student is : " + numberOfStudent(subject1));
            }

        }

    }

    public static int numberOfStudent(Subject s) {
        int i = 0;
        for (Student student : s.getStudents()) {
           
            i++;

        }
        return i;
    }

    public static void SaveData() throws IOException {
        FileStorage.write();
    }

}
