
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

public class SortPrice {

	
	private ArrayList<Item> itemList;
	
	//Constructor
	public SortPrice()
	{
		itemList=new ArrayList<Item>();
	}
	
	//Adding the items into the array list
	public void addItems()
	{
		Item i1=new Item(100,"Shoes",new BigDecimal("1000"),"Adidas");
		Item i2=new Item(101,"Shirt",new BigDecimal("599"),"Louis Philippe");
		Item i3=new Item(102,"Shorts",new BigDecimal("899"),"Max");
		Item i4=new Item(103,"Tracks",new BigDecimal("799"),"Under Armour");
		Item i5=new Item(104,"Sunglass",new BigDecimal("2100"),"RayBan");
		Item i6=new Item(105,"Sportswear",new BigDecimal("2999"),"Nike");
		Item i7=new Item(106,"Watch",new BigDecimal("8999"),"G-Shock");
		Item i8=new Item(107,"Phone",new BigDecimal("18999"),"Apple");
		Item i9=new Item(108,"Football",new BigDecimal("700"),"Shining Star");
		Item i10=new Item(109,"Jeans",new BigDecimal("999"),"Levis");
		
		itemList.add(i1);
		itemList.add(i2);
		itemList.add(i3);
		itemList.add(i4);
		itemList.add(i5);
		itemList.add(i6);
		itemList.add(i7);
		itemList.add(i8);
		itemList.add(i9);
		itemList.add(i10);
		
			
	}
	
	//For displaying the items
	public void displayItems()
	{
		Iterator<Item> itr=itemList.iterator();
		Item item;
		while(itr.hasNext())
		{
			item=new Item(itr.next());
			
			System.out.println("Item ID: "+item.getItemID()+", Short Description: "+item.getShortDesc()+", Price: "+item.getPrice()+", Brand: "+item.getBrand());
			
		}
		System.out.println();
 	}
	
	//For sorting the prices of the items in descending order
	public void sort()
	{
		System.out.println("ITEMS AFTER SORTING:\n");
		
		//Lambda Expression
		Collections.sort(itemList, (Item i1, Item i2) -> (i2.getPrice()).compareTo(i1.getPrice()));
			      
				
	}
}
