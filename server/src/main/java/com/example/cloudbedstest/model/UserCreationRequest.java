package com.example.cloudbedstest.model;

public class UserCreationRequest {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zip;
	private String country;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(final String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(final String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(final String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(final String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof UserCreationRequest)) {
			return false;
		}

		final UserCreationRequest that = (UserCreationRequest) o;

		if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) {
			return false;
		}
		if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) {
			return false;
		}
		if (email != null ? !email.equals(that.email) : that.email != null) {
			return false;
		}
		if (password != null ? !password.equals(that.password) : that.password != null) {
			return false;
		}
		if (addressLine1 != null ? !addressLine1.equals(that.addressLine1) : that.addressLine1 != null) {
			return false;
		}
		if (addressLine2 != null ? !addressLine2.equals(that.addressLine2) : that.addressLine2 != null) {
			return false;
		}
		if (city != null ? !city.equals(that.city) : that.city != null) {
			return false;
		}
		if (state != null ? !state.equals(that.state) : that.state != null) {
			return false;
		}
		if (zip != null ? !zip.equals(that.zip) : that.zip != null) {
			return false;
		}
		return country != null ? country.equals(that.country) : that.country == null;
	}

	@Override
	public int hashCode() {
		int result = firstName != null ? firstName.hashCode() : 0;
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		result = 31 * result + (addressLine1 != null ? addressLine1.hashCode() : 0);
		result = 31 * result + (addressLine2 != null ? addressLine2.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		result = 31 * result + (state != null ? state.hashCode() : 0);
		result = 31 * result + (zip != null ? zip.hashCode() : 0);
		result = 31 * result + (country != null ? country.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "UserCreationRequest{" +
			"firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", email='" + email + '\'' +
			", password='" + password + '\'' +
			", addressLine1='" + addressLine1 + '\'' +
			", addressLine2='" + addressLine2 + '\'' +
			", city='" + city + '\'' +
			", state='" + state + '\'' +
			", zip='" + zip + '\'' +
			", country='" + country + '\'' +
			'}';
	}
}
