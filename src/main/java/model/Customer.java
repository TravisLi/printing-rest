package model;

public class Customer extends User {
	
	private Integer discount ;

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	
	public Customer(String id, String username, String email, String pwd, String role) {
		super(id, username, email, pwd, role);
		this.discount = 0;
	}
}
