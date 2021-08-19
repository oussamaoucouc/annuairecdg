package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.demo.model.Branch;
import com.projet.demo.model.Employee;
import com.projet.demo.repo.BranchRepository;

@Service
public class BranchServiceImpl implements BranchService {
	
	@Autowired
	private BranchRepository branchRepository;

	@Override
	public List<Branch> getAllBranches() {
		return branchRepository.findAll();
	}

	@Override
	public void saveBranch(Branch branch) {
		this.branchRepository.save(branch);
	}

	@Override
	public Branch getBranchById(String branchName) {
		Optional<Branch> optional = branchRepository.findById(branchName);
		Branch branch = null;
		if(optional.isPresent()) {
			branch = optional.get();
		}else {
			throw new RuntimeException("Branch not found for id :: " + branchName);
		}
		return branch;
	}

	@Override
	public void deleteBranchById(String branchName) {
		this.branchRepository.deleteById(branchName);
		
	}

}
