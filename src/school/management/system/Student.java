/*
الطالبة :خلود خالد الجدي  ، الرقم الجامعي :2301200312
*/
package school.management.system;

import java.io.Serializable;

public class Student implements Serializable {

    private int id;
    private int level;
    private String name;

    public Student() {
    }

    public Student(int id, int level, String name) {
        this.id = id;
        this.level = level;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student {"+" Id : "+getId()+", Name : "+getName()+" , Level : "+getLevel()+" }";
    }
    
    

}
/*
الطالبة :خلود خالد الجدي  ، الرقم الجامعي :2301200312
*/