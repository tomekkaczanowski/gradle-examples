package model;

/**
 * Represents user of the system.
 * 
 * @author tomek
 * 
 */
public class User {

	private final String name;
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuilder toString = new StringBuilder(super.toString());
		toString.append(", name: " + name);
		return toString.toString();
	}
}
