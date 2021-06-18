/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabaseapp;

import java.util.Scanner;

/**
 *
 * @author Abdulaziz Al-Alshaikh
 */
public class StudentDatabaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many students to be added to the database: ");
        int numStudents = in.nextInt();
        StudentDatabase [] students = new StudentDatabase[numStudents];
        for (int i = 0; i < students.length; i++) {
            students[i] = new StudentDatabase();
            students[i].enroll();
            students[i].payTuition();
        }
        for(StudentDatabase st: students)
            System.out.println(st);
    }
    
}
