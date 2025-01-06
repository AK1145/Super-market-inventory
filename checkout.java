import java.util.*;
class checkout {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter itemcode");
			System.out.println("\t1.Rice \n\t2.Dhaal \n\t3.Sugar \n\t4.Oil \n\t5.Biscuit \n\t6.Chilli powder \n\t7.Salt");
			int itemcode = sc.nextInt();
			double price, ptotal;
			int quantity;
			String item = " ";
			switch(itemcode) {
			case 1:
				item = "Rice";
				System.out.println("Enter quantity in kgs");
				quantity = sc.nextInt();
				price = 25;
				System.out.println("Price per kg = "+price);
				ptotal = price*quantity;
				System.out.println("total price = "+ptotal);
				break;

			case 2:
				item = "Dhaal";
				System.out.println("Enter quantity in grams");
				quantity = sc.nextInt();
				price = 0.3;
				System.out.println("Price per kg = "+price);
				ptotal = price*quantity;
				System.out.println("total price = "+ptotal);
				break;

			case 3:
				item = "Sugar";
				System.out.println("Enter quantity in kgs");
				quantity = sc.nextInt();
				price = 80;
				System.out.println("Price per kg = "+price);
				ptotal = price*quantity;
				System.out.println("total price = "+ptotal);
				break;

			case 4:
				item = "Oil";
				System.out.println("Enter quantity in ml");
				quantity = sc.nextInt();
				price = 0.25;
				System.out.println("Price per ml = "+price);
				ptotal = price*quantity;
				System.out.println("total price = "+ptotal);
				break;

			case 5:
				item = "Biscuit";
				System.out.println("Enter quantity in packets");
				quantity = sc.nextInt();
				price = 50;
				System.out.println("Price per packet = "+price);
				ptotal = price*quantity;
				System.out.println("total price = "+ptotal);
				break;

			case 6:
				item = "Chilli powder";
				System.out.println("Enter quantity in packets");
				quantity = sc.nextInt();
				price = 35;
				System.out.println("Price per packet = "+price);
				ptotal = price*quantity;
				System.out.println("total price = "+ptotal);
				break;

			case 7:
				item = "Rice";
				System.out.println("Enter quantity in packets");
				quantity = sc.nextInt();
				price = 20;
				System.out.println("Price per packet = "+price);
				ptotal = price*quantity;
				System.out.println("total price = "+ptotal);
				break;
			}
			System.out.println("\nBought any other items \n\t1.yes \n\t2.no");
			int ans = sc.nextInt();
			if(ans == 1) {
				continue;
			}
			else {
				System.out.println("Thanks for visiting.");
				break;
			}
		}
		sc.close();
	}
}
