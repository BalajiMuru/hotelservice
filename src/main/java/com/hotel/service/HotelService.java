package com.hotel.service;

import java.util.List;

import com.hotel.entities.Hotel;

public interface HotelService {
	//Create
	
	Hotel create(Hotel hotel);
	
	//getAll
	
	List<Hotel> getAll();
	//get single
	
	Hotel get(String id);

}
