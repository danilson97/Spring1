package com.devsuperior.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*essa anotaçao serve para indicar que sera usada no banco*/
@Entity

/*esta outra anotaçao indica o nome da tabela no banco*/
@Table(name = "tb_department")
public class Department {
	
	@Id /* anotaçao relacionada ao id*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*indica o valor gerado automatico*/
	private long id;
	private String name;

	public Department() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
