package com.example.demo;



import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

import org.springframework.stereotype.Repository;


import com.example.demo.Item;

@Repository
public class ItemDAO {
	
	//Adding all the items and returning it	
	public ArrayList<Item> getAllItems()
	{
		ArrayList<Item> itemlist=new ArrayList<Item>();
		itemlist.add(new Item(100,"Shoes",1000,"Adidas"));
		itemlist.add(new Item(101,"Shirt",599,"Louis Philippe"));
		itemlist.add(new Item(102,"Shorts",899,"Max"));
		itemlist.add(new Item(103,"Tracks",799,"Under Armour"));
		itemlist.add(new Item(104,"Sunglass",2100,"RayBan"));
		itemlist.add(new Item(105,"Sportswear",2999,"Nike"));
		itemlist.add(new Item(106,"Watch",8999,"G-Shock"));
		itemlist.add(new Item(107,"Phone",18999,"Apple"));
		itemlist.add(new Item(108,"Football",700,"Shining Star"));
		itemlist.add(new Item(109,"Jeans",999,"Levis"));
		
		Collections.sort(itemlist, (Item i1, Item i2) -> Double.valueOf(i2.getPrice()).compareTo(i1.getPrice()));
		
		return itemlist;
	}

	//For getting the item details according to its ID
	public Item getItemByID(String ID)
	{
		int Id=Integer.parseInt(ID);
		Predicate<Item> byID=i -> i.getItemID()==Id;
		return filterItems(byID);
	}
	
	//To filter the items which does not match the ID
	public Item filterItems(Predicate<Item> strategy)
	{
		return getAllItems().stream().filter(strategy).findFirst().orElse(null);
	}
	
}
