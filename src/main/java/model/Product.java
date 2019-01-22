package model;

public class Product {

	private Integer id;
	private String name;
	private ProductCategory productCategory;
	private Material material;
	private Integer height;
	private Integer width;
	private Integer baseQuantity;
	private String unit;
	private Double price;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductCategory getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getBaseQuantity() {
		return baseQuantity;
	}
	public void setBaseQuantity(Integer baseQuantity) {
		this.baseQuantity = baseQuantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", productCategory=" + productCategory + ", material="
				+ material + ", height=" + height + ", width=" + width + ", baseQuantity=" + baseQuantity + ", unit="
				+ unit + ", price=" + price + "]";
	}
	
}
