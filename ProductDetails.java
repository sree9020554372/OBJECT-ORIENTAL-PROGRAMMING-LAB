class Product{
	String pcode, pname;
	double price;
	void details(){
		System.out.println("PRODUCT DETAILS");
		System.out.println("PCode : "+pcode);
		System.out.println("PName : "+pname);
		System.out.println("Price : "+price);
	}
}
public class ProductDetails{
	public static void main(String args[]){
		Product p1 = new Product();
		p1.pcode = "S9T20";
		p1.pname = "SAMSUNG S9";
		p1.price = 20300;
		System.out.println("\nProduct1:");
		p1.details();
		
		Product p2 = new Product();
		p2.pcode = "XE302";
		p2.pname = "ONE PLUS";
		p2.price = 28000;
		System.out.println("\nProduct2:");
		p2.details();
				
		Product p3 = new Product();
		p3.pcode = "Y20";
		p3.pname = "VIVO";
		p3.price = 13000;
		System.out.println("\nProduct3:");
		p3.details();
				
		if(p1.price<p2.price && p1.price<p3.price){
			System.out.println("\n\nProduct1 has the lowest price :");
			p1.details();
		}
		else if(p2.price < p3.price){
			System.out.println("\nProduct2 has the lowest price:\n");
			p2.details();
		}
		else
		{
			System.out.println("\nProduct3 has the lowest price:\n");
			p3.details();
		}
	}
}
