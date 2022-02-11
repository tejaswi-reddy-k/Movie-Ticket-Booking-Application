package com.movie.app.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class Theatre {
	
	private int theatreId;
	private String theatreName;
	private String theatreCity;
	private List<Movie> listOfMovies;
	private List<Screen> listOfScreens;
	private List<Event> listofEvents;
	private String managerName;
	private String managerContact;
	
	@Id
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}
	public List<Movie> getListOfMovies() {
		return listOfMovies;
	}
	public void setListOfMovies(List<Movie> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}
	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}
	public void setListOfScreens(List<Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	
	public List<Event> getListofEvents() {
		return listofEvents;
	}
	public void setListofEvents(List<Event> listofEvents) {
		this.listofEvents = listofEvents;
	}
	@Override
	public int hashCode() {
		return Objects.hash(listOfMovies, listOfScreens,listofEvents, managerContact, managerName, theatreCity, theatreId,
				theatreName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Theatre other = (Theatre) obj;
		return Objects.equals(listOfMovies, other.listOfMovies) && Objects.equals(listOfScreens, other.listOfScreens)&&Objects.equals(listofEvents, other.listofEvents)
				&& Objects.equals(managerContact, other.managerContact)
				&& Objects.equals(managerName, other.managerName) && Objects.equals(theatreCity, other.theatreCity)
				&& theatreId == other.theatreId && Objects.equals(theatreName, other.theatreName);
	}
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity
				+ ", listOfMovies=" + listOfMovies + ", listOfScreens=" + listOfScreens + ", listofEvents="
				+ listofEvents + ", managerName=" + managerName + ", managerContact=" + managerContact + "]";
	}
	
}
