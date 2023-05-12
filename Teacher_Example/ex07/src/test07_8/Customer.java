package test07_8;

public class Customer {
    private int id = 3;
	public static void main(String[] args) { 
	    Customer customer = new Customer();
	    customer.id = 5;
	    customer.showId();
	}
	
	protected void showId() {
	    System.out.println(id);
	}
}
