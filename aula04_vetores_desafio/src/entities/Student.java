package entities;

public class Student {
	
	public String name, email;
	public int room;
	
	public Student(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	public String toString() {
		return room + ": " + name + ", " + email;
	}
}
