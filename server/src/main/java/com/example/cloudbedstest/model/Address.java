package com.example.cloudbedstest.model;

public class Address {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zip;
	private String country;

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
		if (!(o instanceof Address)) {
			return false;
		}

		final Address address = (Address) o;

		if (addressLine1 != null ? !addressLine1.equals(address.addressLine1) : address.addressLine1 != null) {
			return false;
		}
		if (addressLine2 != null ? !addressLine2.equals(address.addressLine2) : address.addressLine2 != null) {
			return false;
		}
		if (city != null ? !city.equals(address.city) : address.city != null) {
			return false;
		}
		if (state != null ? !state.equals(address.state) : address.state != null) {
			return false;
		}
		if (zip != null ? !zip.equals(address.zip) : address.zip != null) {
			return false;
		}
		return country != null ? country.equals(address.country) : address.country == null;
	}

	@Override
	public int hashCode() {
		int result = addressLine1 != null ? addressLine1.hashCode() : 0;
		result = 31 * result + (addressLine2 != null ? addressLine2.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		result = 31 * result + (state != null ? state.hashCode() : 0);
		result = 31 * result + (zip != null ? zip.hashCode() : 0);
		result = 31 * result + (country != null ? country.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Address{" +
			"addressLine1='" + addressLine1 + '\'' +
			", addressLine2='" + addressLine2 + '\'' +
			", city='" + city + '\'' +
			", state='" + state + '\'' +
			", zip='" + zip + '\'' +
			", country='" + country + '\'' +
			'}';
	}
}
