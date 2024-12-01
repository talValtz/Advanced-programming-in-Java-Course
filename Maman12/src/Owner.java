// Owner class represents an owner of a pet

public class Owner {
	
	private String name;
	private String phoneNumber;

	//Constructors
	public  Owner(String name,String phoneNumber) {
		this.name=name;
		setPhoneNumber(phoneNumber);
	}
	public Owner() {
		this.name=null;
		this.phoneNumber=null;
	}
	
	//Getters
	public String getName() {
		return this.name;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	//Setters
	public void setName(String name) {
		this.name=name;
	}
	public void setPhoneNumber(String phoneNumber) {
		if(isPhoneNumberValid(phoneNumber)) {
			this.phoneNumber=phoneNumber;
		}
		else {
			System.out.println("Invalid phone number. It must contain 10 digits.");
			this.phoneNumber="";

		}
	}

	//Check if the phone number is valid
	private boolean isPhoneNumberValid(String phoneNumber) {
		if (phoneNumber.length() != 10) {
			return false;
		}
		for (char c : phoneNumber.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}


	@Override
	public String toString() {
		return String.format("\n Owner name='%s',Owner phoneNumber='%s'", name, phoneNumber);
	}




}
