package com.movie.app.entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	private int userId;
	private String adminName;
	private String adminContact;

	public Admin() {

	}

	public Admin(String adminName, String adminContact) {
		this.adminName = adminName;
		this.adminContact = adminContact;
	}

	public Admin(int userId, String adminName, String adminContact) {
		this.userId = userId;
		this.adminName = adminName;
		this.adminContact = adminContact;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adminContact, adminName, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(adminContact, other.adminContact) && Objects.equals(adminName, other.adminName)
				&& userId == other.userId;
	}

	@Override
	public String toString() {
		return "Admin [userId=" + userId + ", adminName=" + adminName + ", adminContact=" + adminContact + "]";
	}

}
