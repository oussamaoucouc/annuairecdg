package com.projet.demo.service;

import java.util.List;

import com.projet.demo.model.Direction;

public interface DirectionService {
	List<Direction> getAllDirections();
	void saveDirection(Direction direction);
	Direction getDirectionById(String directionName);
	void deleteDirectionById(String directionName);

}
