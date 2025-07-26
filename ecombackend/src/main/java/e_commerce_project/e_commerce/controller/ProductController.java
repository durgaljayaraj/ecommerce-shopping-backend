package e_commerce_project.e_commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import e_commerce_project.e_commerce.model.Product;
import e_commerce_project.e_commerce.service.ProductService;

@RestController
@RequestMapping("/ecom")
public class ProductController {
	@Autowired
	ProductService prodservice;
	
	@GetMapping("/product")
	public List<Product> getProd() {
		return prodservice.getProducts();
	}
	
	@GetMapping("/product/{prodid}")
	public Product getById(@PathVariable int prodid) {
		return prodservice.getById(prodid);
	}
	@PostMapping("/product/add")
	public void addProduct(@RequestBody Product product) {
		prodservice.addProduct(product);
	}
	@PutMapping("/update/{prodid}")
	public Product update(@PathVariable int prodid, @RequestBody Product upproduct) {
	    return prodservice.updateProd(prodid, upproduct);
	}
	@DeleteMapping("/delete/{prodid}")
	public void delete(@PathVariable int prodid) {
		prodservice.deleteProd(prodid);
	}
}
