
public class Owner {
	private String name;
	private String phoneNumber;
	
	public  Owner(String name,String phoneNumber) {
		this.name=name;
		setPhoneNumber(phoneNumber);
	}
	public Owner() {
		this.name=null;
		this.phoneNumber=null;
		
	}
	public String getName() {
		return this.name;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPhoneNumber(String phoneNumber) {
		if(isPhoneNumberValid(phoneNumber)) {
			this.phoneNumber=phoneNumber;
		}
		else {
	        throw new IllegalArgumentException("Invalid phone number. It must contain 10 digits.");

		}
		
	}
	
	public boolean isPhoneNumberValid(String phoneNumber) {
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
