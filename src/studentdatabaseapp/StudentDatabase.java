package studentdatabaseapp;

import java.util.Scanner;

/**
 *
 * @author Abdulaziz Al-Alshaikh
 */
public class StudentDatabase {
    private String name;
    private int year;
    private int studentID;
    private static int id = 1000;
    private String listEnrolledCourses = "";
    private static int coursePrice = 600;
    private int studentBalance;
    
   
    public StudentDatabase() {
        this.name = setName();
        this.year = setYear();
        this.studentID = setId();
    }

   
    private String setName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        return in.nextLine();
    }

    private int setYear() {
        Scanner in = new Scanner(System.in);
        System.out.println("1) Freshmen\n2) Sophmore\n3) Junior\n4) Senior\nEnter the year of the student "+this.name+": ");
        return in.nextInt();
    }

    private int setId() {
        ++this.id;
        String id = this.year+""+this.id;
        return Integer.parseInt(id);
        
        
    }
    
    public void enroll() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the courses you want to enroll in(q to quit): ");
        do{
            String tempCourse = in.nextLine();
            if(tempCourse.toLowerCase().equals("q"))
                break;
            this.listEnrolledCourses+= "\t"+tempCourse+"\n";
            this.studentBalance += this.coursePrice;
        }while(true);
    }
    
    public void getPayment() {
        System.out.println("Your balance now is: "+this.studentBalance+"$");
    }
    
    public void payTuition() {
        getPayment();
        System.out.println("How much do you want to pay($)? ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        this.studentBalance -= payment;
        System.out.println("Thank for your payment of "+payment+"$");
        getPayment();
    }
    @Override
    public String toString() {
        return(String.format("%nName: %s%nID: %d%nCourses Enrolled:%n%sStudent Balance: %s", this.name, this.studentID, this.listEnrolledCourses, this.studentBalance));
    }
    
    
}
