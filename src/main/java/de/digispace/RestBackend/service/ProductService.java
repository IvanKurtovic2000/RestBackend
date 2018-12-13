package de.digispace.RestBackend.service;

import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.digispace.RestBackend.dao.ProductDAO;
import de.digispace.RestBackend.entities.Product;

@Path("/product")
public class ProductService {

	private ProductDAO pDao;
	
	
	
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public void findAllProducts() throws Exception{
		
		 pDao.findAllProducts();
		
	}
	
	
	
	
	
	
	
	
	
	
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTest() {
		return "Hallo das ist ein Test";

	}

	@GET
	@Path("/getproduct")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProductInJSON() {

		Calendar calendar = Calendar.getInstance();
		java.sql.Timestamp ourJavaTimestampObject = new java.sql.Timestamp(calendar.getTime().getTime());

		Product product = new Product(10, "Pommes", "leckere Pommes", 5L, "Fastfood", ourJavaTimestampObject);

		return product;

	}

}
