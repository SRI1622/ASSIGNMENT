package assignment3;
import java.util.*;

class Bill{
	int count=1;
	
	void showBill() {
		System.out.println("-----------------------------------------------");
	    System.out.println("                Bill");
	    System.out.println("-----------------------------------------------");
	}
	
	void displayBill(double totalCostOfItem,String itemName,int quantityOfItem) {
		System.out.println(count+". Total Cost Of "+quantityOfItem+" "+itemName+" is "+totalCostOfItem);
	    	count++;
	}	
	
}

class calculation extends Bill{
	int NumberOfQuantity=0;
	double totalTax=0;
	double totalCost=0;
	
	void costCalculation(int quantityOfItem,double costOfItem,String itemName) {
			double totalCostOfItem  = (quantityOfItem*costOfItem)+ (salesTaxCalculation(quantityOfItem,costOfItem));
			NumberOfQuantity+=quantityOfItem;
			totalCost+=totalCostOfItem;
			displayBill(totalCostOfItem,itemName,quantityOfItem);
	}
	
	double salesTaxCalculation(int quantityOfItem,double costOfItem) {
		double taxAmount = quantityOfItem*((15*costOfItem)/100);
		totalTax+=taxAmount;
		return taxAmount;
	}
	
}

class Items extends calculation{
	 String item;
	 int quantity;
	 double price;
	 int count=0;
	 
	 ArrayList<String> list = new ArrayList<>();
	 
	 void ListOfItems(String Name) {
		list.add(Name);
	 }
	 
	 void displayItems() {
		 list.forEach((n)->System.out.println(++count+". "+n));
	 }
	 
	 void separateItem() {
		 for(int i=0;i<list.size();i++) {
			 String Name=list.get(i);
			 String[] arr = Name.split(" ");
			 item=arr[1];
			 quantity=Integer.parseInt(arr[0]);
			 price=Double.parseDouble(arr[3]);
			 costCalculation(quantity,price,item);
		 }
	}
	 
	 void heading() {
		 System.out.println("-----------------------------------------------");
	     System.out.println("                Order List");
	     System.out.println("-----------------------------------------------");
	}

	 void displayAmount() {
	     System.out.println("-----------------------------------------------"); 
		 System.out.println("                Total Amount");
	     System.out.println("-----------------------------------------------");
	     System.out.println("Cost of "+NumberOfQuantity+" item is : Rs. "+(totalCost-totalTax)); 
	     System.out.println("Total tax of "+NumberOfQuantity+" item is : Rs. "+totalTax);
	     System.out.println("Total Amount of "+NumberOfQuantity+" item is : Rs. "+totalCost);
		}
	 
}

public class SalesTax {

	public static void main(String[] args) {
		Items item = new Items();
		item.heading();
		item.ListOfItems("3 Pen at 5.00");
		item.ListOfItems("4 Pencil at 3.00");
		item.ListOfItems("2 NoteBook at 30.00");
		item.ListOfItems("5 ColourBox at 50.00");
		item.ListOfItems("5 BindingPaper at 25.00");
		item.displayItems();
		item.showBill();
		item.separateItem();
		item.displayAmount();
	}

}
