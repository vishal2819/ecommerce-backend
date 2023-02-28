
public class Customer extends User {
		private Cart cart;
		private Order order;
		public Customer()
		{
			super();//used to call parent class constructor.
			
		}
	public Order getOrder() {
			return order;
		}
		public void setOrder(Order order) {
			this.order = order;
		}
	public Cart getCart() {
			return cart;
		}
		public void setCart(Cart cart) {
			this.cart = cart;
		}
	public Boolean verifyUser() {
		
		return true;
	}

}
