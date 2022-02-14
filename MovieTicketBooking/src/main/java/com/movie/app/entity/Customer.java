package com.movie.app.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column
private int customerId;
@NotNull(message="Customer name should not be left blank")
private String customerName;
private String address;
@Size(min=10,max=10,message="Enter a valid mobile number")
private String mobileNumber;
@Email
private String email;
private String password;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public int hashCode() {
	return Objects.hash(address, customerId, customerName, email, mobileNumber, password);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	return Objects.equals(address, other.address) && customerId == other.customerId
			&& Objects.equals(customerName, other.customerName) && Objects.equals(email, other.email)
			&& Objects.equals(mobileNumber, other.mobileNumber) && Objects.equals(password, other.password);
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
			+ ", mobileNumber=" + mobileNumber + ", email=" + email + ", password=" + password + "]";
}

}
