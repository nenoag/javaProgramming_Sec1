
public class Product {
	private int unit;
	
	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	public int getUnit() {
		return this.unit;
	}
	
	public int getTotalprice() {
		return this.unit * 100;
	}
	
	public String toString() {
		return "You buy " + this.unit + " units (" + this.getTotalprice()+").";
	}
}
