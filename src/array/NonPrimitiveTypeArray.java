package array;

import java.util.Scanner;

// to create an array of non primitive data type
class student{
    int rollno;
    String name;
    int marks;
    public student(int rollno, String name, int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
}

public class NonPrimitiveTypeArray {
    public static void main(String[] args) {
        student stu[] = new student[3];
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < stu.length; i++) {
            stu[i]=new student(s.nextInt() ,s.next(), s.nextInt());
        }
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].rollno+" "+stu[i].name+" "+stu[i].marks);
        }
    }
}
