package hospital.app.dao;

import java.util.List;

import hosptal.app.dto.Item;

public interface ItemDao {
	public Item saveItem(Item item,int id);
	public Item getItemById(int id);
	public List<Item> getItemByMedOrderId(int id);
	public Item updateItem(Item item,int id);
	public boolean deleteItemById(int id);

}
