package exp1;

public class Contacts {
	String email;
	String name;
	String mobile;

	Contacts(String e, String n, String m) {
		email = e;
		name = n;
		mobile = m;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
