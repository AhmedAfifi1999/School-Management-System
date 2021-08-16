
package school.management.system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FileStorage {
    
        static  String fileName = "data.dat";

    public static void write() throws FileNotFoundException, IOException {
        ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(fileName));

        System.out.println("Start Save");
        try {
            writeFile.writeObject(Processe.studentsList);

        } catch (Exception e) {
        }
        
        try {
            writeFile.writeObject(Processe.teachersList);

        } catch (Exception e) {
        }

        try {
            writeFile.writeObject(Processe.subjectsList);

        } catch (Exception e) {
        }
        try {
            writeFile.writeObject(Processe.principal);

        } catch (Exception e) {
        }

        writeFile.close();


    }

    public static void read() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream readFile = new ObjectInputStream(new FileInputStream(fileName));
        try {
            Processe.studentsList = (ArrayList<Student>) readFile.readObject();//Casting
        } catch (Exception e) {

        }
        try {
            Processe.teachersList = (ArrayList<Teacher>) readFile.readObject();

        } catch (Exception e) {
        }

        try {
            Processe.subjectsList = (ArrayList<Subject>) readFile.readObject();

        } catch (Exception e) {
        }
        try {
            Processe.principal = (Principal) readFile.readObject();

        } catch (Exception e) {
        }

        readFile.close();

    }
    
}
