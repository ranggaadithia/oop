package id.ac.undiksha.ais.people;

public abstract class Human {
	private String name;
	private String birthDate;
	private boolean gender; // 0-female 1-male
	private String address;

	
	
	public Human(String name, String birthDate, boolean gender, String address) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.address = address;
	}
	
	public Human()
	{
		this.name = "<please insert name>";
		this.address = "<please insert address>";
		this.gender = false;
		this.birthDate = "<please insert birthDate>";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printAll()
	{
		System.out.println(this.name);
		if (this.gender) {
			System.out.println("Male");
		} else {
			System.out.println("Female");
		}
		System.out.println(this.address);
	}
	
	
}
