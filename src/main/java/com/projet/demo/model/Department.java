package com.projet.demo.model;


import com.projet.demo.model.Direction;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {
	@Id
	private String departmentName;
	
	@Column(name = "dphone_number",nullable = false)
	private String dphoneNo;
	
	@Column(name = "department_email",nullable = false)
	private String departmentEmail;
	

	
	@Column(name = "department_address")
	private String department_address;
	
	
	
	



	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDphoneNo() {
		return dphoneNo;
	}

	public void setDphoneNo(String dphoneNo) {
		this.dphoneNo = dphoneNo;
	}

	public String getDepartmentEmail() {
		return departmentEmail;
	}

	public void setDepartmentEmail(String departmentEmail) {
		this.departmentEmail = departmentEmail;
	}



	public String getDepartment_address() {
		return department_address;
	}

	public void setDepartment_address(String department_address) {
		this.department_address = department_address;
	}


	


}
