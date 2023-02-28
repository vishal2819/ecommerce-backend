
public class Product {
	private String productId;
	private String cost;
	private String productName;
	private Seller seller;
	private String category;
	private String subcategory;
	
	
	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public String getCategory() {
		return category;
	}

public void setCategory(String category) {
		this.category = category;
	}

	int x;
	public Product()
	{
		x=5;
		
	}
	
	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
