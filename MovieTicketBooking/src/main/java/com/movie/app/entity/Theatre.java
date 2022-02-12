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
	private String theatreLocation;
	private List<Movie> listOfMovies;
	private String screenName;
	/*private List<Screen> listOfScreens;
	private List<Event> listofEvents;
	private String managerName;
	private String managerContact;*/
	
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
	
	public String getTheatreLocation() {
		return theatreLocation;
	}
	public void setTheatreLocation(String theatreLocation) {
		this.theatreLocation = theatreLocation;
	}
	
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(listOfMovies, theatreCity, theatreId,
				theatreName,theatreLocation,screenName);
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
		return Objects.equals(listOfMovies, other.listOfMovies) 
				 && Objects.equals(theatreCity, other.theatreCity)
				&& theatreId == other.theatreId && Objects.equals(theatreName, other.theatreName) && Objects.equals(theatreLocation, other.theatreLocation) && Objects.equals(screenName, other.screenName);
	}
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreCity=" + theatreCity
				+ ", theatreLocation=" + theatreLocation + ", listOfMovies=" + listOfMovies + ", screenName="
				+ screenName + "]";
	}
	
	
}

