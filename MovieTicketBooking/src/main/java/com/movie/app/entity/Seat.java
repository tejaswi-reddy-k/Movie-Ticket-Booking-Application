package com.movie.app.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Seat {
	
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seat(int seatId, @Min(value = 50, message = "Min Seats booked is 50") String seatNumber,
			@NotNull(message = "Seat type Cannot be left Blank") String type,
			@Min(value = 100, message = "Min range of seat cost is 100.00") double price) {
		super();
		this.seatId = seatId;
		this.seatNumber = seatNumber;
		this.type = type;
		this.price = price;
	}
	@Id
	private int seatId;
	@Min(value = 50, message = "Min Seats booked is 50")
	private String seatNumber;
	@NotNull(message = "Seat type Cannot be left Blank")
	private String type;
	@Min(value = (long) 100.00, message = "Min range of seat cost is 100.00")
	private double price;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(price, seatId, seatNumber, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && seatId == other.seatId
				&& Objects.equals(seatNumber, other.seatNumber) && Objects.equals(type, other.type);
	}
	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatNumber=" + seatNumber + ", type=" + type + ", price=" + price + "]";
	}
	

}
