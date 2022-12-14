package com.example.Laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopDao {
	@Autowired
	LaptopRepository lr;
	
public String store(List<Laptop> l) {
	lr.saveAll(l);
	return "Success";
}

public List<Laptop> getting() {
	
	return lr.findAll();
}

public Laptop getobj(int id) {
	
	return lr.findById(id).get();
}

public String delete(int id) {
	
	 lr.deleteById(id);
	 return "DELETED";
}
}
