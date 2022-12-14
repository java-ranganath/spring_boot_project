package com.example.Laptop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
	@Autowired
LaptopDao ld;
	
	public String store(List<Laptop> l) {
		return ld.store(l);
	}

	public List<Laptop> show(List<Laptop> l) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Laptop> getting() {
		
		return ld.getting();
	}

	public Laptop getobj(int id) {
		
		return ld.getobj(id);
	}

	public String delete(int id) {
		
		return ld.delete(id);
	}


}
