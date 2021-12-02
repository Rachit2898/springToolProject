package com.springrest.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.asset;
import com.springrest.springrest.services.assetService;



@RestController
public class MyController {
	@Autowired
	private assetService assetService;
@GetMapping("/home")
public String home() {
	return "welcome home";
}
@GetMapping("/assets")
public List<asset> getassets()
{
	return this.assetService.getassets();
	
}
@PostMapping("/assets")
	public asset addasset(@RequestBody asset asset) {
		return this.assetService.addasset(asset);
}

@GetMapping("/assets/{id}")
public asset getasset (@PathVariable String id) {
	return this.assetService.getasset(Long.parseLong(id));
}
@PutMapping("/assets")
public asset updateasset (@RequestBody asset asset){
	return this.assetService.updateasset(asset);
}
@DeleteMapping("assets/{id}")
	public ResponseEntity<HttpStatus>deleteasset(@PathVariable String id){
		try {
			this.assetService.deleteasset(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
}


