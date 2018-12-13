package de.digispace.RestBackend.test;

import java.util.Calendar;

import de.digispace.RestBackend.dao.ProductDAO;
import de.digispace.RestBackend.entities.Product;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar = Calendar.getInstance();
		java.sql.Timestamp ourJavaTimestampObject = new java.sql.Timestamp(calendar.getTime().getTime());

		ProductDAO product = new ProductDAO();
		Product hamburger = new Product(9, "Hamburger", "Saftiger Hamburger mit Pommes", 15L, "Fastfood",
				ourJavaTimestampObject);

		Product pommes = new Product(7, "Pommes", "leckere Pommes", 5L, "Fastfood", ourJavaTimestampObject);


	}

}
