package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Material;
import model.Product;
import model.ProductCategory;
import model.User;

@SpringBootApplication
@CrossOrigin(maxAge = 4800, allowCredentials = "false") 
@RestController
@RequestMapping("/api")
public class RestApp {

	private static Logger logger = LoggerFactory.getLogger(RestApp.class);
	
	@RequestMapping(value="/resource",method = RequestMethod.GET)
	public Map<String,Object> home() {
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		return model;
	}

	@RequestMapping(value="/get/productCategory",method = {RequestMethod.OPTIONS,RequestMethod.GET})
	public List<ProductCategory> getProductCategory() {

		logger.info("Get product category");
		
		List<ProductCategory> list = new ArrayList<ProductCategory>();
		
		for(int i=1;i<10;i++){
			
			ProductCategory pc = new ProductCategory();
			pc.setId(i);
			pc.setName("productCat" + i);
			pc.setImage("data:image/jpeg;base64,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");
			
			list.add(pc);
		}
		
		return list;
	}
	
	@RequestMapping(value="/get/product/{productCatId}",method = {RequestMethod.OPTIONS,RequestMethod.GET})
	public List<Product> login(@PathVariable("productCatId")Integer productCatId) {

		logger.info("Get product of Product Category ID");
		
		ProductCategory c = new ProductCategory();
		c.setId(productCatId);
		c.setName("Production Cat");
		
		List<Product> list = new ArrayList<Product>();
		
		
		for(int i=1;i<10;i++){
		
			Product p = new Product();
			p.setId(i);
			p.setBaseQuantity(1000);
			
			Material m = new Material();
			m.setId(i);
			m.setName("Material" + i);
			
			p.setMaterial(m);
			p.setHeight(100);
			p.setWidth(100);
			p.setName("Product" + i);
			p.setUnit("Unit");
			p.setPrice(new Double(1000*i));
			
			list.add(p);
		}
		
		
		return list;
	}
	
	@RequestMapping(value="/login/{username}/{pwd}",method = {RequestMethod.OPTIONS,RequestMethod.GET})
	public User login(@PathVariable("username")String username, @PathVariable("pwd")String pwd) {

		logger.info("login");

		if(username.equals("test")&&pwd.equals("1234")){
			return new User("1", "test", "test@gmail.com", "1234", "customer");
		}
		return null;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RestApp.class, args);
	}
	
}
