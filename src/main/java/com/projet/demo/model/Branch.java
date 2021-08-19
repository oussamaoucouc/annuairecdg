package com.projet.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branches")
public class Branch {
	@Id
	private String branchName;
	
	
	@Column(name = "branch_email", nullable = false)
	private String branchEmail;
	
	@Column(name = "branch_location", nullable = false)
	private String branchLocation;
	



	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public String getBranchEmail() {
		return branchEmail;
	}

	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}




	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", branchEmail="
				+ branchEmail + ", branchLocation=" + branchLocation + "]";
	}

	
}
