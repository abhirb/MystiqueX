
public class Item {
	
	private int itemID;
	private String shortDesc;
	private double price;
	private String brand;
	
	//Constructor 1
	public Item()
	{
		this.itemID=0;
		this.shortDesc="";
		this.price=0;
		this.brand="";
	}
	
	//Constructor 2
	public Item(int itemID,String shortDesc,double price,String brand)
	{
		this.itemID=itemID;
		this.shortDesc=shortDesc;
		this.price=price;
		this.brand=brand;
	}
    
	//Constructor 3
	public Item(Item item)
	{
		this.itemID=item.itemID;
		this.shortDesc=item.shortDesc;
		this.price=item.price;
		this.brand=item.brand;
	}
	
	//For getting the ID of the item
	public int getItemID()
	{
		return itemID;
	}
	
	//For getting the short description of the item
	public String getShortDesc()
	{
		return shortDesc;
	}
	
	//For getting the price of the item
	public double getPrice()
	{
		return price;
	}
	
	//For getting the brand of the item
	public String getBrand()
	{
		return brand;
	}
	
}
