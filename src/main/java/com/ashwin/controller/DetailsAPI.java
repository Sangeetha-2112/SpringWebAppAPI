package com.ashwin.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashwin.accessingdatamysql.Details;
import com.ashwin.accessingdatamysql.DetailsRepository;


@Controller
public class DetailsAPI {
	@Autowired
	private DetailsRepository detailsRepository;
	
	@GetMapping("/details")
	public List<Details>	getDetails() {

        Iterable<Details> iterable = detailsRepository.findAll();
        ArrayList<Details> returnList = new ArrayList<Details>();
        for( Details d : iterable){
            returnList.add(d);
        }
        
		return returnList;
	}

}