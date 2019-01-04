package model;

public class OrderItem {

	private Integer id;
	private Product product;
	private Integer quantity;
	private Byte[] uploadFile;
	private String remark;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Byte[] getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(Byte[] uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
