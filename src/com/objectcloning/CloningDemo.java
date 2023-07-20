package com.objectcloning;
import java.lang.ClassNotFoundException;
class Department{
    int deptId;
    String name;

    public Department(int deptId, String name) {
        this.deptId = deptId;
        this.name = name;
    }
}

class  Student implements Cloneable{
    int id;
    String name;
    Department dept;

    public Student(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException  {
        Department department = new Department(1,"physics");
        Student student = new Student(1,"amru",department);
        Student student2 = (Student)student.clone();
        System.out.println(student);
        System.out.println(student2);

    }
}
