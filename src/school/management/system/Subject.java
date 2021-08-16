
package school.management.system;

import java.io.Serializable;
import java.util.ArrayList;

public class Subject implements Serializable {
    
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students;
    
    public Subject() {
    }
    
    public void addStudentToSubject(Student student) {
        students.add(student);
    }
    
    public Subject(String name, Teacher teacher, ArrayList<Student> students) {
        this.name = name;
        this.teacher = teacher;
        teacher.setClassNumber(teacher.getClassNumber()+1);
        this.students = students;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
    @Override
    public String toString() {
        return "Subject {" + " Name : " + getName() + " " + getTeacher().toString() + " " + getStudents().toString() + " }";
    }
    
}
