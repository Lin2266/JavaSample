package Java.io;

import java.util.Date;

public class Excel_Invoices {
	Integer itemId;
	String itemName;
	Integer itemQty;
	Double totalPrice;
	Date itemSoldDate;
	public Excel_Invoices(Integer intmId, String itemName, Integer itemQty, Double totalPrice, Date itemSoldDate) {
		super();
		this.itemId = intmId;
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.totalPrice = totalPrice;
		this.itemSoldDate = itemSoldDate;
	}
	public Integer getIntmId() {
		return itemId;
	}
	public void setIntmId(Integer intmId) {
		this.itemId = intmId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getItemQty() {
		return itemQty;
	}
	public void setItemQty(Integer itemQty) {
		this.itemQty = itemQty;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getItemSoldDate() {
		return itemSoldDate;
	}
	public void setItemSoldDate(Date itemSoldDate) {
		this.itemSoldDate = itemSoldDate;
	}
	
}
