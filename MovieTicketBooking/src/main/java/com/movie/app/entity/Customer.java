package com.movie.app.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	@NotNull(message="customer name field should not be left blank")
	private String customerName;
	@Size(min=10,max=10,message="Enter a valid phone number")
	private String mobileNumber;
	@OneToMany
	private List<Ticket> myTickets;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public List<Ticket> getMyTickets() {
		return myTickets;
	}
	public void setMyTickets(List<Ticket> myTickets) {
		this.myTickets = myTickets;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerName, mobileNumber, myTickets, userId);
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
		return Objects.equals(customerName, other.customerName) && Objects.equals(mobileNumber, other.mobileNumber)
				&& Objects.equals(myTickets, other.myTickets) && Objects.equals(userId, other.userId);
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", customerName=" + customerName + ", mobileNumber=" + mobileNumber
				+ ", myTickets=" + myTickets + "]";
	}

}
