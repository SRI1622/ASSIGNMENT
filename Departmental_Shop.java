package assignment;
import java.util.*;

class Flavours{
	Scanner sc =new Scanner(System.in);
	public int Chocolate() {
		System.out.print("\nPlease Enter Your Quantity : ");
		int Number_Of_Quantity = sc.nextInt();
		final int ChocoPrice = 75;
		return Number_Of_Quantity *ChocoPrice;
	}
	public int Vanilla() {
		System.out.print("\nPlease Enter Your Quantity : ");
		int Number_Of_Quantity = sc.nextInt();
		final int VanillaPrice = 50;
		return Number_Of_Quantity*VanillaPrice;
	}
	public int Strawberry() {
		System.out.print("\nPlease Enter Your Quantity : ");
		int Number_Of_Quantity = sc.nextInt();
		final int StrawberryPrice = 25;
		return Number_Of_Quantity*StrawberryPrice;
	}
}

class Ice_Cream extends Flavours{
	Scanner sc= new Scanner(System.in);
	
	public void Stick_Ice() {
		final int StickIcePrice = 25;
		System.out.print("\nChoose the Flavour : \n\n1.Chocolate \n2.Vanilla \n3.Strawberry \n\nType Your Flavour :");
		for(int i=1;i==i;i++) {
		String Name_Of_Flavour = sc.nextLine();
		switch(Name_Of_Flavour) {
		case "chocolate":
			int Total_Chocolate_Price =Chocolate();
			System.out.println("\nTotal Cost : ₹" +(float)(Total_Chocolate_Price+StickIcePrice));
			System.out.println("Thank You! For Shopping.");
			break;
		case "vanilla":
			int Total_Vanilla_Price =Vanilla();
			System.out.println("\nTotal Cost : ₹" +(float)(Total_Vanilla_Price+StickIcePrice));
			System.out.println("Thank You! For Shopping.");
			break;
		case "strawberry":
			int Total_Strawberry_Price=Strawberry();
			System.out.println("\nTotal Cost : ₹" +(float)(Total_Strawberry_Price+StickIcePrice));
			System.out.println("Thank You! For Shopping.");
			break;
		default:
			System.out.println("\nPlease choose correct flavour.....");
			System.out.print("\nAgain type your flavour : ");
			continue;
		}
		break;
		}
		
	}
	
	public void Cone_Ice() {
		final int ConeIcePrice = 35;
		System.out.print("\nChoose the Flavour : \n\n1.Chocolate \n2.Vanilla \n3.Strawberry \n\nType Your Flavour :");
		for(int i=1;i==i;i++) {
		String Name_Of_Flavour = sc.nextLine();
		switch(Name_Of_Flavour) {
		case "chocolate":
			int Total_Chocolate_Price =Chocolate();
			System.out.println("\nTotal Cost : ₹" +(float)(Total_Chocolate_Price+ConeIcePrice));
			System.out.println("Thank You! For Shopping.");
			break;
		case "vanilla":
			int Total_Vanilla_Price =Vanilla();
			System.out.println("\nTotal Cost : ₹" +(float)(Total_Vanilla_Price+ConeIcePrice));
			System.out.println("Thank You! For Shopping.");
			break;
		case "strawberry":
			int Total_Strawberry_Price=Strawberry();
			System.out.println("\nTotal Cost : ₹" +(float)(Total_Strawberry_Price+ConeIcePrice));
			System.out.println("Thank You! For Shopping.");
			break;
		default:
			System.out.println("\nPlease choose correct flavour.....");
			System.out.print("\nAgain type your flavour : ");
			continue;
		}
		break;
		}
	}
	
	public void Cup_Ice() {
		final int CupIcePrice = 15;
		System.out.print("\nChoose the Flavour : \n\n1.Chocolate \n2.Vanilla \n3.Strawberry \n\nType Your Flavour :");
		for(int i=1;i==i;i++) {
		String Name_Of_Flavour = sc.nextLine();
		switch(Name_Of_Flavour) {
		case "chocolate":
			int Total_Chocolate_Price =Chocolate();
			System.out.println("\nTotal Cost : ₹" +(float)(Total_Chocolate_Price+CupIcePrice));
			System.out.println("Thank You! For Shopping.");
			break;
		case "vanilla":
			int Total_Vanilla_Price =Vanilla();
			System.out.println("\nTotal Cost : ₹" +(float)(Total_Vanilla_Price+CupIcePrice));
			System.out.println("Thank You! For Shopping.");
			break;
		case "strawberry":
			int Total_Strawberry_Price=Strawberry();
			System.out.println("\nTotal Cost : ₹" +(float)(Total_Strawberry_Price+CupIcePrice));
			System.out.println("Thank You! For Shopping.");
			break;
		default:
			System.out.println("\nPlease choose correct flavour.....");
			System.out.print("\nAgain type your flavour : ");
			continue;
		}
		break;
		}
	}
}
public class Departmental_Shop {

	public static void main(String[] args) {
		Ice_Cream obj_Of_Ice_Cream = new Ice_Cream();
	Scanner sc = new Scanner(System.in);
	System.out.print("Your Menu : \n\n1.Stick ice \n2.Cone ice \n3.Cup ice \n\nEnter your choice : ");
	for(int i=1;i==i;i++) {
	int Choose_the_Number = sc.nextInt();
	switch(Choose_the_Number) {
	case 1 : 
		obj_Of_Ice_Cream.Stick_Ice();
		break;
	case 2 :
		obj_Of_Ice_Cream.Cone_Ice();
		break;
	case 3:
		obj_Of_Ice_Cream.Cup_Ice();
		break;
	default:
		System.out.println("\nWrongly entered......");
		System.out.print("\nAgain re-enter your choice : ");
		continue;
	}
	break;
	}
	sc.close();
	}
	
}
