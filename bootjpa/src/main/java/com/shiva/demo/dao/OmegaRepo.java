package com.shiva.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.shiva.demo.model.*;

public interface OmegaRepo extends CrudRepository<omega, Integer> {
	
	
 
}
