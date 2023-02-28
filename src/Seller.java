
public class Seller extends User{
private Product [] productListed;

public Seller()
{
	super();
	
}

	public Product[] getProductListed() {
	return productListed;
}
public void setProductListed(Product[] productListed) {
	this.productListed = productListed;
}
	@Override
	public Boolean verifyUser() {
		
		return true;
	}

}
