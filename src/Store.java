import java.util.Scanner;

/* Welcome to ECommerce api 
 * Ask Which type of user are you ? 1. Customer 2. Seller 3. Admin
 * Customer - 1. View Products 2. View Cart 3. Contact Us
 * Seller - 1.View your Products 2. Add Products 3. Contact Us
 * View your Products - 1.delete this product 2.Add a Product - Submit details of Product
 * Admin - .....
 * Products
 * Category
 * Order
  */
public class Store {
	int x;

	public Store() {
		x = 5;// store constructor is used to initialize variable.
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Ecommerce Store!");
		System.out.println("Which user are you? 1.Customer 2. Seller 3. Admin");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeOfUser;
		if (choice == 1) {
			typeOfUser = "Customer";
			Customer current = new Customer();
			System.out.println("What is your UserId?");
			sc.nextLine();
			current.setUserId(sc.nextLine());

			System.out.println("What is your password?");
			sc.nextLine();
			current.setPassword(sc.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("User Verified!");

				while (true) {
					System.out.println("Do you want to - 1. View Produts 2. View Cart 3. Contact us 4. Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						/*
						 * Category category = new Category(3); Product[] allCategory
						 * =category.getCategoryName(); for(int i=0;i<allCategory.length;i++) {
						 * System.out.println(allCategory[i].getCategoryId()+"."+" "+allCategory[i].
						 * getCategory());
						 * 
						 * }
						 */
						System.out.println("1. Clothes 2. Electronics 3. Furniture");
						int subChoice = sc.nextInt();
						if (subChoice == 1) {
							Catalogue catalogue = new Catalogue();
							Product[] allProduct = catalogue.getListOfAllProducts();
							for (int i = 0; i < allProduct.length; i++) {
								System.out.println(allProduct[i].getProductId() + " " + allProduct[i].getProductName()
										+ " " + allProduct[i].getCost());
							}
							System.out.println("Do you want to add any product to cart?(Y/N)");
							sc.nextLine();
							String addToCart = sc.nextLine();
							if (addToCart.equals("Y")) {
								System.out.println("Input the product Id you want to add to cart");
								String productId = sc.nextLine();
								Product[] cartProducts = new Product[1];
								for (int i = 0; i < allProduct.length; i++) {
									if (allProduct[i].getProductId().equals(productId))
										cartProducts[0] = allProduct[i];
								}
								Cart cart = new Cart();
								cart.setCartId("1");
								cart.setListOfProduct(cartProducts);
								current.setCart(cart);
								System.out.println("The product is successfully added to the cart!");
							} 
						}
							else if (subChoice == 2) {
								Catalogue catalogue2 = new Catalogue();
								Product[] allProduct1 = catalogue2.getElectronicsProduct();
								for (int i = 0; i < allProduct1.length; i++) {
System.out.println(allProduct1[i].getProductId() + " "+ allProduct1[i].getProductName() + " " + allProduct1[i].getCost());
								}

								System.out.println("Do you want to add any product to cart?(Y/N)");
								sc.nextLine();
								String addToCart1 = sc.nextLine();
								if (addToCart1.equals("Y")) {
									System.out.println("Input the product Id you want to add to cart");
									String productId = sc.nextLine();
									Product[] cartProducts = new Product[2];
									for (int i = 0; i < allProduct1.length; i++) {
										if (allProduct1[i].getProductId().equals(productId))
											cartProducts[0] = allProduct1[i];
											cartProducts[1] = allProduct1[i];
									}

									Cart cart = new Cart();
									cart.setCartId("1");
									cart.setListOfProduct(cartProducts);
									current.setCart(cart);
									System.out.println("The product is successfully added to the cart!");
								}
							} 
							else if (subChoice == 3) {
								Catalogue catalogue3 = new Catalogue();
								Product[] allProduct2 = catalogue3.getFunitureItem();
								for (int i = 0; i < allProduct2.length; i++) {
	System.out.println(allProduct2[i].getProductId()+ " "+allProduct2[i].getProductName()+ " " + allProduct2[i].getCost());
								}
								System.out.println("Do you want to add any product to cart?(Y/N)");
								sc.nextLine();
								String addToCart2 = sc.nextLine();
								if (addToCart2.equals("Y")) {
									System.out.println("Input the product Id you want to add to cart");
									String productId = sc.nextLine();
									Product[] cartProducts = new Product[1];
									for (int i = 0; i < allProduct2.length; i++) {
										if (allProduct2[i].getProductId().equals(productId))
											cartProducts[0] = allProduct2[i];
									}
									Cart cart = new Cart();
									cart.setCartId("1");
									cart.setListOfProduct(cartProducts);
									current.setCart(cart);
									System.out.println("The product is successfully added to the cart!");
								}
							} 
							else
								System.out.println("invalid Entry");
						
					}

					else if (choice == 2) {
						Product[] cartProducts = current.getCart().getListOfProduct();
						for (int i = 0; i < cartProducts.length; i++) {
							System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductName()
									+ " " + cartProducts[i].getCost());
						}
						System.out.println("Do you want to checkout? (Y/N)");
						sc.nextLine();
						String checkout = sc.nextLine();
						if (checkout.equals("Y"))
							if (current.getCart().equals(checkout)) {
								Order order1 = new Order();
								order1.setUser(current);
								order1.setOrderId("1");
								System.out.println("Your oreder id is" + order1.getOrderId() + "for user id "
										+ order1.getUser().getUserId());
								System.out.println("Your order is placed sucessfully");					
							}
						} 
					else if (choice == 3) {
						System.out.println("You can contact us at vishal_stores.com");
					} else if (choice == 4) {
						System.out.println("Thank You!");
						break;
					}

					else
						System.out.println("Invalid Choice ");
				}
			}
		}

		else if (choice == 2) {
			typeOfUser = "Seller";
			Seller current1 = new Seller();
			System.out.println("What is your UserId?");
			sc.nextLine();
			current1.setUserId(sc.nextLine());
			System.out.println("What is your Password?");
			sc.nextLine();
			current1.setPassword(sc.nextLine());
			if (current1.verifyUser() == true) {
				System.out.println("User Verified");
				while (true) {
					System.out.println("Do you want to 1. View product 2.Contacts us 3.Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catalogue = new Catalogue();
						Product[] allProduct3 = catalogue.getListofAllProductsSellor();
						for (int i = 0; i < allProduct3.length; i++) {
							System.out.println(allProduct3[i].getProductId() + " " + allProduct3[i].getProductName()
									+ " " + allProduct3[i].getCost());
						}
					} else if (choice == 2) {
						System.out.println("You can contact us at vishal_stores.com");
					} else if (choice == 3) {
						System.out.println("Thank You");
						break;
					} else
						System.out.println("Inavlid choice");

				}
			}
		} else if (choice == 3) {
			typeOfUser = "Admin";
			Admin current2 = new Admin();
			System.out.println("What is your UserId?");
			sc.nextLine();
			current2.setUserId(sc.nextLine());
			System.out.println("What is your Password?");
			sc.nextLine();
			current2.setPassword(sc.nextLine());
			if (current2.verifyUser() == true) {
				System.out.println("User Verified");
				while (true) {
					System.out.println("Do you want to - 1. View Products 2.  Exit");
					choice = sc.nextInt();

					if (choice == 1) {
						Catalogue catalogue = new Catalogue();
						Product[] allProduct4 = catalogue.getListOfAllProducts();
						for (int i = 0; i < allProduct4.length; i++) {
							System.out.println(allProduct4[i].getProductId() + " " + allProduct4[i].getProductName()
									+ " " + allProduct4[i].getCost());
						}
					} else if (choice == 2) {
						System.out.println("Thank You");
						break;
					} else
						System.out.println("Inavlid entry try again...");
				}
			}

			else
				System.out.println("Invalid input try again...");
		}
	}
}
