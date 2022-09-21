package Oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		// set value (değer ayarlamak)
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImgUrl("image1.jpg");

		Product product2 = new Product();
		// set value (değer ayarlamak)
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImgUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImgUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("5459110140");
		individualCustomer.setCustomerNumber("12345678900");
		individualCustomer.setFirstName("Zeynep");
		individualCustomer.setLastName("Bayraktar");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.IO");
		corporateCustomer.setPhone("5455851014");
		corporateCustomer.setTaxNumber("12354655455");
		corporateCustomer.setCustomerNumber("546468");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(individualCustomer.getFirstName()+" " + individualCustomer.getLastName());
		}

		
		
	}

}
