
public class Catalogue {
	private Product[] listOfAllProducts;
	private Product [] electronicsProduct;
	private Product [] funitureItem;
	
	public Product[] getElectronicsProduct() {
		Product electronics1 = new Product();
		electronics1.setProductId("1");
		electronics1.setCost("10000");
		electronics1.setProductName("Mobiles");
		Product electronics2 = new Product();
		electronics2.setProductId("2");
		electronics2.setProductName("Laptop");
		electronics2.setCost("35000/");
		Product electronics3 = new Product();
		electronics3.setProductId("3");
		electronics3.setProductName("Tv");
		electronics3.setCost("50000/");
		electronicsProduct = new Product[3];
		electronicsProduct[0] =electronics1;
		electronicsProduct[1] =electronics2;
		electronicsProduct[2] =electronics3;
		return electronicsProduct;
	}

	public void setElectronicsProduct(Product[] electronicsProduct) {
		this.electronicsProduct = electronicsProduct;
	}

	public Product[] getFunitureItem() {
		Product furniture1 = new Product();
		furniture1.setProductId("1");
		furniture1.setCost("10000/");
		furniture1.setProductName("Dining Table");
		Product furniture2 = new Product();
		furniture2.setProductId("2");
		furniture2.setCost("1000/");
		furniture2.setProductName("Sofa");
		Product furniture3 = new Product();
		furniture3.setProductId("3");
		furniture3.setCost("15000/");
		furniture3.setProductName("Chairs");
		funitureItem = new Product[3];
		funitureItem [0] =furniture1;
		funitureItem [1] =furniture2;
		funitureItem [2] =furniture3;
		return funitureItem;
	}

	public void setFunitureItem(Product[] funitureItem) {
		this.funitureItem = funitureItem;
	}
	private Product[] listofAllProductsSellor;

	public Product[] getListOfAllProducts() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("Denims");
		product1.setCost("1000/");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("Shirts");
		product2.setCost("800/");
		listOfAllProducts = new Product[2];
		listOfAllProducts[0] = product1;
		listOfAllProducts[1] = product2;
		return listOfAllProducts;
	}

	public void setListOfAllProducts(Product[] listOfAllProducts) {
		this.listOfAllProducts = listOfAllProducts;
	}
	
	public Product[] getListofAllProductsSellor() {
		Product products1 = new Product();
		products1.setProductId("22");
		products1.setProductName("Product 22");
		products1.setCost("2200");
		Product products2 = new Product();
		products2.setProductId("23");
		products2.setProductName("Product 23");
		products2.setCost("2300");
		listofAllProductsSellor = new Product[2];
		listofAllProductsSellor[0] = products1;
		listofAllProductsSellor[1] = products2;
		return listofAllProductsSellor;
		
	}
	public void setListofAllProductsSellor(Product[] listofAllProductsSellor) {
		this.listofAllProductsSellor = listofAllProductsSellor;
	}
}
