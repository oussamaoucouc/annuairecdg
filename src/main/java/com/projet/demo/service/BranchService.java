package com.projet.demo.service;

import java.util.List;

import com.projet.demo.model.Branch;

public interface BranchService {
	List<Branch> getAllBranches();
	void saveBranch(Branch branch);
	Branch getBranchById(String branchName);
	void deleteBranchById(String branchName);
}
