
public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	Invoice(int id, Customer customer, double amount){
		this.id = id;
		this.customer = customer;
		this.amount = amount;
		
	}
	
	public int getID() {
		return id;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getCustomerID() {
		return id;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return (amount - (amount*customer.getDiscount()/100));
	}
	
	public String toString() {
		return "Invoice[id=" + id + ",customer=" + customer.getName() + "(" + customer.getID() + ")(" +
				customer.getDiscount()+"%),amount=" + getAmountAfterDiscount();
	}
}
