package com.movie.app.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Screen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int screenId;
	private int theatreId;
	@NotNull(message="ScreenName should not be left blank")
	private String screenName;
	@OneToMany
	private List<Show> showList;
	@Max(value=25,message = "No of rows should not be greater than 25")
	private int rows;
	@Max(value=25,message = "No of columns should not be greater than 25")
	private int columns;
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public List<Show> getShowList() {
		return showList;
	}
	public void setShowList(List<Show> showList) {
		this.showList = showList;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	@Override
	public int hashCode() {
		return Objects.hash(columns, rows, screenId, screenName, showList, theatreId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Screen other = (Screen) obj;
		return columns == other.columns && rows == other.rows && screenId == other.screenId
				&& Objects.equals(screenName, other.screenName) && Objects.equals(showList, other.showList)
				&& theatreId == other.theatreId;
	}
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", theatreId=" + theatreId + ", screenName=" + screenName
				+ ", showList=" + showList + ", rows=" + rows + ", columns=" + columns + "]";
	}

}
