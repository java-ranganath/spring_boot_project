package com.example.Laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
	@Autowired
	LaptopService ls;
	@PostMapping (value="/store")
	public String store(@RequestBody List<Laptop> l ) {
		return ls.store(l);
	}
	@GetMapping (value="/getting")
	public List<Laptop> getting() {
		return ls.getting();
	
	}
	@GetMapping (value="/getobj/{id}") 
	public Laptop getobj(@PathVariable int id) {
		return ls.getobj(id);
	}
@DeleteMapping (value="/delete/{id}")
	public String delete(@PathVariable int id) {
	return ls.delete(id);
}
}
