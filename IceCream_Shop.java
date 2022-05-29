package assignment2;
import java.util.*;
class IcecreamFlavour{
	void showflavours() {
		ArrayList<String>flavoursList=new ArrayList<>();
		flavoursList.add("chocolate");
		flavoursList.add("vanilla");
		flavoursList.add("strawberry");
		System.out.print(flavoursList);
	}
	void showIcetypes() {
		ArrayList<String>iceTypes=new ArrayList<>();
		iceTypes.add("cone");
		iceTypes.add("stick");
		iceTypes.add("cup");
		System.out.println(iceTypes);
	}
	void showToppings() {
		ArrayList<String>Toppings=new ArrayList<>();
		Toppings.add("oreo crumbles");
		Toppings.add("cherries");
		Toppings.add("chocolate chips");
		Toppings.add("fruity-fruity");
		System.out.println(Toppings);
	}

}
class Shop extends IcecreamFlavour{
	int quantity;
	int flavour;
	int iceType;
	int typeCost;
	String toppings;
	int toppingscost=0;
	int flavourcost;
	int bill;
	void pickIcetypes(){
		showIcetypes();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Icetypes:");
		iceType=sc.nextInt();
		switch(iceType) {
		case 1:
			typeCost=40;
			break;
		case 2:
			typeCost=20;
			break;
		case 3:
			typeCost=15;
			break;
		
		}
				
	}
	void pickflavours(){
		showflavours();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter flavours:");
		flavour=sc.nextInt();
		switch(flavour) {
		case 1:
			flavourcost=40;
			break;
		case 2:
			flavourcost=20;
			break;
		case 3:
			flavourcost=30;
			break;
		
		}
		if(flavour==1) 
		pickToppings();
		
	}
	void pickToppings() {
		showToppings();
		Scanner sc=new Scanner(System.in);
		System.out.println("pickToppings: ");
		toppings=sc.next();
		switch(toppings) {
		case "orecrumbles":
			toppingscost=20;
			break;
		case "cherries":
			toppingscost=35;
			break;
		case "chocolate ships":
			toppingscost=60;
			break;
		case "fruity-fruity":
			toppingscost=10;
			break;
		}
		
	}
	void iceQuantity() {
		Scanner sc=new Scanner(System.in);
		System.out.println("getquantity: ");
		int n=sc.nextInt();
		quantity=n;
	}
	int calculateBill() {
		bill=typeCost+toppingscost+flavourcost;
		bill*=quantity;
		return bill;
	}
	void showFinalbill(){
		System.out.println("Total Amount: "+calculateBill());
	}
}
public class IceCream_Shop {
	
	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.pickIcetypes();
		shop.pickflavours();
		shop.iceQuantity();
		shop.showFinalbill();
	}

}
