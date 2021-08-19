package com.projet.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.demo.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, String> {

	Optional<Branch> findById(String branchName);

	void deleteById(String branchName);

}
