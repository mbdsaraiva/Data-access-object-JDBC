package application;

import java.util.Date;

import module.dao.DaoFactory;
import module.dao.SellerDao;
import module.entities.Department;
import module.entities.Seller;

public class Main {

	public static void main(String[] args) {

			Department obj = new Department (1, "Books");
			
			
			SellerDao sellerDao = DaoFactory.createSellerDao();
			
			System.out.println("=== TEST 1: seller findById ====");
			Seller seller = sellerDao.findById(3);
			System.out.println(seller);
	}

}
