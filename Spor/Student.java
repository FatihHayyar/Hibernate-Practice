package Spor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_spor")
public class Student {
    @Id
    private int id;
    @Column(length = 20,nullable = false)
    private String name;
    private String department;
    private int note;

    public Student(int id,String name, String department, int note) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", note=" + note +
                '}';
    }

    public Student() {
    }
}
