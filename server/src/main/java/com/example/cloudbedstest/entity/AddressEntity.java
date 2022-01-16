package com.example.cloudbedstest.entity;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id")
	private BigInteger addressId;

	@Column(name = "address_1")
	private String addressLine1;

	@Column(name = "address_2")
	private String addressLine2;

	private String city;

	private String state;

	private String zip;

	private String country;

	@OneToOne(mappedBy = "address")
	private UserEntity user;

	public BigInteger getAddressId() {
		return addressId;
	}

	public void setAddressId(final BigInteger addressId) {
		this.addressId = addressId;
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

	public UserEntity getUser() {
		return user;
	}

	public void setUser(final UserEntity user) {
		this.user = user;
	}

	// toString method explicitly excludes user because otherwise it recurses forever
	@Override
	public int hashCode() {
		int result = addressId != null ? addressId.hashCode() : 0;
		result = 31 * result + (addressLine1 != null ? addressLine1.hashCode() : 0);
		result = 31 * result + (addressLine2 != null ? addressLine2.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		result = 31 * result + (state != null ? state.hashCode() : 0);
		result = 31 * result + (zip != null ? zip.hashCode() : 0);
		result = 31 * result + (country != null ? country.hashCode() : 0);
		//result = 31 * result + (user != null ? user.hashCode() : 0);
		return result;
	}

	// toString method explicitly excludes user because otherwise it recurses forever
	@Override
	public String toString() {
		return "AddressEntity{" +
			"addressId=" + addressId +
			", addressLine1='" + addressLine1 + '\'' +
			", addressLine2='" + addressLine2 + '\'' +
			", city='" + city + '\'' +
			", state='" + state + '\'' +
			", zip='" + zip + '\'' +
			", country='" + country + '\'' +
			", user=" + user.getUserId() +
			'}';
	}

	// equals method explicitly excludes user because otherwise it recurses forever
	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof AddressEntity)) {
			return false;
		}

		final AddressEntity that = (AddressEntity) o;

		if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) {
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
}
