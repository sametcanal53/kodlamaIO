package Week4;

public class Gamer {
	private int id;
	private String name;
	private String lastName;
	private double identityNumber;

	public Gamer(int id, String name,String lastName , double identityNumber) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(double identityNumber) {
		this.identityNumber = identityNumber;
	}
}
