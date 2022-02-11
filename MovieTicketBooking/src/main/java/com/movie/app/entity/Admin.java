package com.movie.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Admin {
	@Id
	private int userId;
	private String adminName;
	
}
