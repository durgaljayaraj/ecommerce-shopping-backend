package e_commerce_project.e_commerce.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import e_commerce_project.e_commerce.model.Product;
import e_commerce_project.e_commerce.repository.ProductRepository;

@Service
public class ProductService {
	/**List<Product> products= new ArrayList<>(Arrays.asList(new Product(101,"Iphone",99),
			new Product(102,"Gucci",100),
			new Product(103,"Coach",100)

			));
**/
	@Autowired
	ProductRepository prodrepo;
	public List<Product> getProducts(){
		return prodrepo.findAll();
		
	}
	/**public Product getById(int prodid) {
		return products.stream()
				.filter(p -> p.getProductid()== prodid)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Product with ID " + prodid + " not found"));
		}
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public Product updateProd(int prodid, Product upproduct) {
	    return products.stream()
	        .filter(p -> p.getProductid() == prodid)
	        .findFirst()
	        .map(existingProduct -> {
	            existingProduct.setProductname(upproduct.getProductname());
	            existingProduct.setPrice(upproduct.getPrice());
	            return existingProduct;
	        })
	        .orElseThrow(() -> new RuntimeException("Product with ID " + prodid + " not found"));
	}
	public boolean deleteProd(int prodid) {
		return products.removeIf(p -> p.getProductid() == prodid);
	}**/

	public Product getById(int prodid) {
		return prodrepo.findById(prodid).orElse(new Product());
	}
	
	public Product addProduct(Product product) {
		return prodrepo.save(product);
	}
	public Product updateProd(int prodid, Product upproduct) {
		return prodrepo.save(upproduct);
		
	}
	public void deleteProd(int prodid) {
		prodrepo.deleteById(prodid);
	}
	

	
	}

