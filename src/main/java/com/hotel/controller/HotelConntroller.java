package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entities.Hotel;
import com.hotel.service.HotelService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/hotels")

public class HotelConntroller {

	@Autowired
	HotelService hotelService;
	
	@PostMapping
	public ResponseEntity<Hotel> create(@RequestBody Hotel hotel){
		Hotel hotelSave = hotelService.create(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelSave);
		
	}
	
//	@GetMapping("/{hotelId}")
//	public ResponseEntity<Hotel> getHotelbyId(@PathVariable String id){
//		Hotel hotel = hotelService.get(id);
//		return ResponseEntity.status(HttpStatus.OK).body(hotel);
//		
//	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId) {
	    Hotel hotel = hotelService.get(hotelId);
	    return ResponseEntity.status(HttpStatus.OK).body(hotel);
	}
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotel(){
		List<Hotel> AllHotel = hotelService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(AllHotel);
	}
	
}
