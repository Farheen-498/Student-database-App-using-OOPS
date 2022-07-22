package studentdatabaseApp;

public class StudentdatabseApp {

	public static void main(String[] args) {
		//how many studnets we want to add
		
		Student stu1= new Student();

		stu1.enroll();
		stu1.payTuition();
		System.out.println(stu1.showInfo());
	}

}
