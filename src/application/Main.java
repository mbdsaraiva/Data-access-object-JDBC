package application;

import java.util.Date;

import module.entities.Department;
import module.entities.Seller;

public class Main {

	public static void main(String[] args) {

			Department obj = new Department (1, "Books");
			
			System.out.println(obj);
			
			Seller seller = new Seller(21, "Matheus", "matheus@gmail.com", new Date(), 3000.0, obj);
			
			System.out.println(seller);
	}

}
