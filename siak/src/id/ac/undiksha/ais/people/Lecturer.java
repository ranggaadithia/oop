package id.ac.undiksha.ais.people;

public class Lecturer extends Human{
	private String lecturerId;
	private String faculty;
	private String departement;
	
	public Lecturer()
	{
		this.lecturerId = "<please insert lecturerId>";
		this.faculty = "<please insert faculty>";
		this.departement = "<please insert departement>";
	}
	
	public Lecturer(String name, String birthDate, boolean gender, String address, String lecturerId, String faculty,
			String departement) {
		super(name, birthDate, gender, address);
		this.lecturerId = lecturerId;
		this.faculty = faculty;
		this.departement = departement;
	}

	public String getLecturerId() {
		return lecturerId;
	}

	public void setLecturerId(String lecturerId) {
		this.lecturerId = lecturerId;
	}
	
	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public void printAll()
	{
		super.printAll();
		System.out.println(this.lecturerId);
		System.out.println(this.departement);
		System.out.println(this.faculty);
	}
	
}
