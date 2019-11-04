package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class ItemController {
	
	@Autowired
	private ItemDAO itemDAO;
	
	
	//GET request for getting all items in descending order
	@GetMapping("/items")
	public ArrayList<Item> getItems()
	{
		return itemDAO.getAllItems();
	}
	
	//GET request for getting the item details for specific ID
	@GetMapping("/item/{id}")
	public Item getItemByID(@PathVariable("id") String ID)
	{
		return itemDAO.getItemByID(ID);
	
	}
	
}
