package classWithAttributes;

public class Main {

	public static void main(String[] args) {
 		Product product = new Product(1, "Laptop",  "Asus Laptop",5000, 2, "Siyah") ;
		

		
		ProductManeger productManeger = new ProductManeger();
		productManeger.Add(product);
		System.out.println(product. getKod());
		
		
		
		
	}

}
