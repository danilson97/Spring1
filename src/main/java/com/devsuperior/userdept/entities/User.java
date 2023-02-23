package com.devsuperior.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity /*essa anotaçao serve para indicar que sera usada no banco*/

@Table(name = "tb_user") /*esta outra anotaçao indica o nome da tabela no banco*/

public class User {
	
	@Id /* anotaçao relacionada ao id*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*indica o valor gerado automatico*/
	private long id;
	private String name;
	private String email;
	
	@ManyToOne /*indica muitos pra um na referencia de entidades*/
	@JoinColumn(name = "department_id") /* insere o nome da chave estrangeira*/
	private Department department;
	
	public User() {
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
