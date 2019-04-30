package BloodBank;

public class Donor {
	
	int id;
	String name;
	String bloodGroup;
	String gender;
	
	
	
	
	public Donor(int id,String name, String bloodGroup, String gender)
	{
		this.id=id;
		this.name=name;
		this.bloodGroup=bloodGroup;
		this.gender=gender;
		
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

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
};
