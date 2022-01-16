package com.example.cloudbedstest.model;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Address address;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(final Address address) {
		this.address = address;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof User)) {
			return false;
		}

		final User user = (User) o;

		if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) {
			return false;
		}
		if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) {
			return false;
		}
		if (email != null ? !email.equals(user.email) : user.email != null) {
			return false;
		}
		if (password != null ? !password.equals(user.password) : user.password != null) {
			return false;
		}
		return address != null ? address.equals(user.address) : user.address == null;
	}

	@Override
	public int hashCode() {
		int result = firstName != null ? firstName.hashCode() : 0;
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "User{" +
			"firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", email='" + email + '\'' +
			", password='" + password + '\'' +
			", address=" + address +
			'}';
	}
}
