
public class Author {
	private String name;
	private String email;
	private char gender;



Author(String name,String email,char gender){
	this.name=name;
	this.email=email;
	this.gender=gender;
	
}

public String getname() {
	return name;
}

public String getemail() {
	return email;
}
public char getGender() {
	return gender;
}
public void setEmail(String email) {
	this.email=email;
}

public void tostring() {
	System.out.println("Email authora je " + email);
	System.out.println("Ime authora je " + name);
	System.out.println("Spol authora je " + gender);
	
}

}