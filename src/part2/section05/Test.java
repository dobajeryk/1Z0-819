package part2.section05;

import java.util.*;

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        return name.hashCode() + age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            return this.name.equals(stud.name) && this.age == stud.age;
        }
        return false;
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    public static int compareByName(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(Boolean.valueOf("abc"));
    }
}