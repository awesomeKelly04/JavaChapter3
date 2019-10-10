package invoice;

public class Invoice {
	private String partNumber; 
	private String partDescription; 
	private int itemQuantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int itemQuantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.itemQuantity = itemQuantity;
		this.pricePerItem = pricePerItem;
		
		if (itemQuantity < 0) {
			this.itemQuantity = 0;
		}
		
		if (pricePerItem < 0.0) {
			this.pricePerItem = 0.0;
		}
		
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
		
		if (itemQuantity < 0) {
			this.itemQuantity = 0;
		}
		
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}	

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
		
		if (pricePerItem < 0.0) {
			this.pricePerItem = 0.0;
		}
	}	
	
	public double getInvoiceAmount(int itemQuantity, double pricePerItem) {		
		return itemQuantity * pricePerItem;
	}
}
