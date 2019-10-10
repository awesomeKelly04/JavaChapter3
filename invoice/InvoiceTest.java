package invoice;

import javax.swing.JOptionPane;

public class InvoiceTest {

	private static Invoice invoice;

	public static void main(String[] args) {
		invoice = new Invoice("KB1234BK", "Computer Keyboard", 45, 200.50);
		
		String pn = "hd3457j";
		invoice.setPartNumber(pn);
		
		String pd = "Computer mouse";
		invoice.setPartDescription(pd);
		
		int iq = 12;
		invoice.setItemQuantity(iq);
		
		double ppi = 1200;
		invoice.setPricePerItem(ppi);
		
		//invoice = new Invoice(pn, pd, iq, ppi);
		
		String message =                                             
				   String.format("Part Number: %s%n"
				   		+ "Part Description: %s%n"
				   		+ "Quantity of item(s): %d%n"
				   		+ "Price per item: %.2f%n"
				   		+ "Total Amount: %.2f%n", invoice.getPartNumber(), invoice.getPartDescription(),
				   		invoice.getItemQuantity(), invoice.getPricePerItem(), invoice.getInvoiceAmount(invoice.getItemQuantity(), invoice.getPricePerItem()));
				      
		JOptionPane.showMessageDialog(null, message);	

	}

}
