package array;

import java.util.Arrays;
import java.util.Scanner;

class Student{
    private int rollno;
    private int marks;
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public int getRollno(){
        return rollno;
    }
}

public class question_1 {
    public static void main(String[] args) {
        Student stu[] = new Student[10];
        Scanner s = new Scanner(System.in);
        int max_and_min[] = new int[10];
        for (int i = 0; i < stu.length; i++) {
            stu[i]=new Student();
            stu[i].setRollno(s.nextInt());
            stu[i].setMarks(s.nextInt());
            stu[i].setName(s.next());
            max_and_min[i]=stu[i].getMarks();
        }
        Arrays.sort(max_and_min);
        int max=max_and_min[9];
        int min=max_and_min[0];
        for (int i = 0; i < stu.length; i++) {
            if(stu[i].getMarks()==max){
                System.out.println("student with maximum marks:- "+stu[i].getRollno()+" "+stu[i].getMarks()+" "+stu[i].getName());
            }
            else if(stu[i].getMarks()==min){
                System.out.println("student with minimum marks:- "+stu[i].getRollno()+" "+stu[i].getMarks()+" "+stu[i].getName());
            }
        }
    }
}
