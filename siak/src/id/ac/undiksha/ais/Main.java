package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.*;

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
		
		System.out.println("_____");
		Student student3 = new Student("sat", "22/11/21", true, "jl.ma", "22141221", 6);
		student3.printAll();
		
		student3.prodi.setStudyProgramName(null);
		student3.prodi.setDepartementName(null);
		student3.prodi.getFacultyName();
		
//		Student student4 = new Human();
		Human human1 = new Student();
		human1.setName("more");
		human1.printAll();
		
//		Human human2 = new Human();
	}

}
