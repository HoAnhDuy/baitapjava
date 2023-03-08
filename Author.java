package Compose;

public class Author {
	private String name, email;
	private char gender; // char of m or f
	
	public Author(String n, String e, char g) {
		name = n;
		email = e;
		
		if (g == 'm' || g == 'f')
			gender = g;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	public String toString() {
		return String.format("name=%s, email=%s, gender=%c", name, email, gender);
	}
}
