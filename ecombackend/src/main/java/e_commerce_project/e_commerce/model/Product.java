package e_commerce_project.e_commerce.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Component
@Entity
@Table(name="products")
public class Product {

   @Id

	private int productid;
	private String productname;
	public String description;
	public String brand;
	private BigDecimal price;
	public String category;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date releasedate;
	public boolean availability;
	public int quantity;
	
	
	public Product(int productid, String productname, String description, String brand, BigDecimal price, String category,
			Date releasedate, boolean availability, int quantity) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.category = category;
		this.releasedate = releasedate;
		this.availability = availability;
		this.quantity = quantity;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product() {
		super();
	}
	
}
