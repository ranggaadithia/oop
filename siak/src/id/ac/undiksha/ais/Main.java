package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.Student;
import id.ac.undiksha.ais.people.Lecturer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Mahasiswa : ");
		Student student1 = new Student();
		
		student1.setStudentId("2215101001");
		student1.setName("Rangga");
		student1.setBirthDate("26 April 2004");
		student1.setGender(true);
		student1.setAddress("Jl. Bagus");
		student1.setSmtr(6);
		
		student1.printAll();
		
		System.out.println("Dosen :");
		
		Lecturer lecturer1 = new Lecturer();
		
		lecturer1.setName("Adithia");
		lecturer1.setLecturerId("22151010011");
		lecturer1.setGender(false);
		lecturer1.setAddress("Jl. Mawar");
		lecturer1.setBirthDate("1995-04-03");
		lecturer1.setDepartement("TI");
		lecturer1.setFaculty("FTK");
		
		lecturer1.printAll();
		
		
		
//		student1.name = "Rangga";
//		student1.birthDate = "2004-04-26";
//		student1.gender = true;
//		student1.smtr = 6;
//		student1.address = "Jalan Bagus";
//		student1.studentId = "2215101001";
//		
//		System.out.println(student1.name);
//		System.out.println(student1.birthDate);
//		if (student1.gender) {
//			System.out.println("Male");
//		} else {
//			System.out.println("Female");
//		}
//		System.out.println(student1.smtr);
//		System.out.println(student1.address);
//		System.out.println(student1.studentId);
		
	

	}

}
