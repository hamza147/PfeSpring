package org.sid.controller;

import java.util.List;

import org.sid.entities.LocationEtudePrice;
import org.sid.services.LocationEtudePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/LocationEtudePrix")
public class LocationEtudePriceController {

	@Autowired
	private LocationEtudePriceService epService;

	@PostMapping("/{id}/Add")
	public List<LocationEtudePrice> addLocation(@PathVariable("id") int id, @RequestBody List<LocationEtudePrice> l) {
		return epService.addLocation(id, l);
	}

	@DeleteMapping("/{id}/Delete")
	public void Deletelocation(@PathVariable("id") int id) {
		epService.Deletelocation(id);
	}

	@PutMapping("/edit")
	public LocationEtudePrice editLocation(LocationEtudePrice l) {
		return epService.editLocation(l);
	}

}
