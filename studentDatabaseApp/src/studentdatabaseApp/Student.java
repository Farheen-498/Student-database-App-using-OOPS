package studentdatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstname;
	private String lastname;
	private String gardeYear;
	private String studentId;
	private String courses="";
	private int tuitionBalance;
	private int costOfCourse = 600;
	private int gradeYear ;
	private static int id=1000;
	
	//constructor prompt user to enter Student's name and email
	
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Student first name: ");
		this.firstname=sc.nextLine(); 
		
		System.out.println("enter Student last name");
		this.lastname= sc.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\n Enter class level: ");
		this.gradeYear =sc.nextInt();
		setstudentId();
		System.out.println(firstname+ " "+lastname+ " "+ gradeYear+" "+ studentId);
		
	}
	//Generate an Id
	
	private void setstudentId() {
		//Grade level + ID
		
		id++;
		this.studentId=gradeYear+ ""+id;
	}
	
	//Enroll in Course
	public void enroll() {
		do {
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner sc = new Scanner(System.in);
		String course = sc.nextLine();
		if(!course.equals("Q")) {
			courses = course + "\n" +courses;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else {
			break;
			}
		}while(1 !=0);
		
		System.out.println("ENROLLED IN:" + courses);
		System.out.println("TUITION BALANCE: "+ tuitionBalance);
	}
	
	//View Balance
	
	public void viewBalance() {
		System.out.println("Your balance is: Rs "+tuitionBalance);
	}
	// Pay Tuition
	public void payTuition() {
		viewBalance();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the tuition payment:");
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of Rs "+payment);
		viewBalance();
	}
	
	//Show status
	
	public String showInfo() {
		return "Name: " +firstname +" "+lastname+
				"\nGraduation Level:"+gradeYear+
				"\nStudent ID:"+studentId+
				"\nCourses Enrolled:"+ courses+
				"\nBalances: Rs"+ tuitionBalance;
	}
}
