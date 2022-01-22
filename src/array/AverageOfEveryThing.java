package array;

import java.util.Scanner;

class Average{
    static int marks[][];
    static {
        marks = new int[4][5];
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the marks of " + (i + 1) + " student");
            for (int j = 0; j < 5; j++) {
                marks[i][j] = s.nextInt();
            }
        }
    }
}

public class AverageOfEveryThing {
    public static void main(String[] args) {
        int count=0;
        for (int j = 0; j < 5; j++) {
            float total_marks_in_subject=0;
            for (int i = 0; i < 4; i++) {
                total_marks_in_subject+=Average.marks[i][j];
            }
            System.out.println("Average of subject "+(j+1)+" = "+total_marks_in_subject/4);
        }

        for (int i = 0; i < 4; i++) {
            float total_marks=0;
            for (int j = 0; j < 5; j++) {
                total_marks+=Average.marks[i][j];
            }
            System.out.println("Average obtained by student "+(i+1)+" = "+total_marks/5);
            if((total_marks/5)<50){
                count++;
            }
        }
        System.out.println("Number of students who scored less than 50 is:-"+count);
        for (int i = 0; i < 4; i++) {
            int total_score=0;
            for (int j = 0; j < 5; j++) {
                total_score+=Average.marks[i][j];
            }
            System.out.println("Score obtained by student "+(i+1)+" = "+total_score);
        }

    }
}
