
public class Category {
	private Product [] categoryName;
	private Product [] subCategories;
	
	int z;

	public Category(int z) {
		this.z = z;// parameterized constructor

	}

	public Product[] getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(Product[] categoryName) {
		this.categoryName = categoryName;
	}

	public Product [] getSubCategories() {
	
		return subCategories;
	}

	public void setSubCategories(Product[] subCategories) {
		this.subCategories = subCategories;
	}
}
