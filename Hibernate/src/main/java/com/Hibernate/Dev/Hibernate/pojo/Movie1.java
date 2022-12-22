package com.Hibernate.Dev.Hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity							//Specifies that class is an Entity
@Table(name="Movie")

public class Movie1 {
	  
	@Id private int Id;  //@Id : Primary key in the table, @Column : Specified Column in the Table
	@Column private String MovieName;
	@Column private String Actor; 

}
