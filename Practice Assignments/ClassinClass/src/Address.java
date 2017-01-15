
public class Address {
	String addressLineOne;
	String city;
	String state;
	int zip;

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public Address(String addressLineOne, String city, String state, int zip){
		this.addressLineOne = addressLineOne;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
}
