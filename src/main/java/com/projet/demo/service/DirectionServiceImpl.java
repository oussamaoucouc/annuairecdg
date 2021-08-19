package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.demo.model.Direction;
import com.projet.demo.repo.DirectionRepository;

@Service
public class DirectionServiceImpl implements DirectionService {
	
	@Autowired
	private DirectionRepository DirectionRepository;

	@Override
	public List<Direction> getAllDirections() {
		return DirectionRepository.findAll();
	}

	@Override
	public void saveDirection(Direction direction) {
		this.DirectionRepository.save(direction);
	}

	@Override
	public Direction getDirectionById(String directionName) {
		Optional<Direction> optional = DirectionRepository.findById(directionName);
		Direction direction = null;
		if(optional.isPresent()) {
			direction = optional.get();
		}else {
			throw new RuntimeException("Direction not found for id :: " + directionName);
		}
		return direction;
	}

	@Override
	public void deleteDirectionById(String directionName) {
		this.DirectionRepository.deleteById(directionName);
		
	}


	

}
