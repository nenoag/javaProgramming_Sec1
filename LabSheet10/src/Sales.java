
public class Sales extends Employee {
	
	private double sales;
	
	public Sales(String id,String name,double sales) {
		super(id,name);
		this.sales = sales;
	}
	
	Sales() {
		super("","");
		this.sales = 0;
	}
	
	public double getCommission() {
		if (sales < 10000) {
			return 0;
		}
		else if (sales < 50000) {
			return (sales-10000) * 0.10;
		} else {
			return (sales-50000) * 0.15;
		}
	}
	
	public String toString() {
		return super.getName() + " (" + super.getId() + ") get commission " +
				getCommission() + " baht.";
	}

}
